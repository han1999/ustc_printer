package com.hanxiao.mapper;

import com.hanxiao.bean.RolePerm;
import com.hanxiao.bean.RolePermExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RolePermMapper {
    long countByExample(RolePermExample example);

    int deleteByExample(RolePermExample example);

    int deleteByPrimaryKey(Integer rolePermId);

    int insert(RolePerm record);

    int insertSelective(RolePerm record);

    List<RolePerm> selectByExample(RolePermExample example);

    RolePerm selectByPrimaryKey(Integer rolePermId);

    int updateByExampleSelective(@Param("record") RolePerm record, @Param("example") RolePermExample example);

    int updateByExample(@Param("record") RolePerm record, @Param("example") RolePermExample example);

    int updateByPrimaryKeySelective(RolePerm record);

    int updateByPrimaryKey(RolePerm record);
}