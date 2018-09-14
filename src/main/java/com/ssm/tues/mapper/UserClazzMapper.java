package com.ssm.tues.mapper;

import com.ssm.tues.po.UserClazz;
import com.ssm.tues.po.UserClazzExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserClazzMapper {
    long countByExample(UserClazzExample example);

    int deleteByExample(UserClazzExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserClazz record);

    int insertSelective(UserClazz record);

    List<UserClazz> selectByExample(UserClazzExample example);

    UserClazz selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserClazz record, @Param("example") UserClazzExample example);

    int updateByExample(@Param("record") UserClazz record, @Param("example") UserClazzExample example);

    int updateByPrimaryKeySelective(UserClazz record);

    int updateByPrimaryKey(UserClazz record);
}