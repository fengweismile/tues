package com.ssm.tues.mapper;

import com.ssm.tues.po.AssessOption;
import com.ssm.tues.po.AssessOptionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AssessOptionMapper {
    long countByExample(AssessOptionExample example);

    int deleteByExample(AssessOptionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AssessOption record);

    int insertSelective(AssessOption record);

    List<AssessOption> selectByExample(AssessOptionExample example);

    AssessOption selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AssessOption record, @Param("example") AssessOptionExample example);

    int updateByExample(@Param("record") AssessOption record, @Param("example") AssessOptionExample example);

    int updateByPrimaryKeySelective(AssessOption record);

    int updateByPrimaryKey(AssessOption record);
}