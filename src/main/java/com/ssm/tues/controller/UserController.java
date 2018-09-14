package com.ssm.tues.controller;

import com.ssm.tues.po.User;
import com.ssm.tues.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("login")
    public String login(HttpSession session, String username, String password ){
        User user = new User();
        user = userService.login(username,password);
        if (user!=null){
            session.setAttribute("user",user);
            return "index";
        }
        return "login";
    }

    @RequestMapping("loginPage")
    public String loginPage(){
        String now = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        System.out.println(now+"to LoginPage!!!");
        return "login";
    }

    public  String login(HttpServletRequest request,String username,String password){
        System.out.println("username"+username+"-----"+"password"+password);
        org.apache.shiro.subject.Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(username,password);
        String error = null;
        try {
            subject.login(token);
        } catch (UnknownAccountException e) {
            error = "用户名/密码错误";
        } catch (IncorrectCredentialsException e) {
            error = "用户名/密码错误";
        } catch (ExcessiveAttemptsException e) {
            // TODO: handle exception
            error = "登录失败多次，账户锁定10分钟";
        } catch (AuthenticationException e) {
            // 其他错误，比如锁定，如果想单独处理请单独catch处理
            error = "其他错误：" + e.getMessage();
        }
        if (error != null) {// 出错了，返回登录页面
            request.setAttribute("error", error);
            return "failure";
        } else {// 登录成功
            return "success";
        }
    }
}
