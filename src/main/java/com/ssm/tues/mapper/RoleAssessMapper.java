package com.ssm.tues.mapper;

import com.ssm.tues.po.RoleAssess;
import com.ssm.tues.po.RoleAssessExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleAssessMapper {
    long countByExample(RoleAssessExample example);

    int deleteByExample(RoleAssessExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RoleAssess record);

    int insertSelective(RoleAssess record);

    List<RoleAssess> selectByExample(RoleAssessExample example);

    RoleAssess selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RoleAssess record, @Param("example") RoleAssessExample example);

    int updateByExample(@Param("record") RoleAssess record, @Param("example") RoleAssessExample example);

    int updateByPrimaryKeySelective(RoleAssess record);

    int updateByPrimaryKey(RoleAssess record);
}