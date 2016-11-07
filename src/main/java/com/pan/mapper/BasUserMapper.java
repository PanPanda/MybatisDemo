package com.pan.mapper;

import com.pan.po.BasUser;
import com.pan.po.BasUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface BasUserMapper {
    long countByExample(BasUserExample example);

    int deleteByExample(BasUserExample example);

    int deleteByPrimaryKey(String id);

    int insert(BasUser record);

    int insertSelective(BasUser record);

    List<BasUser> selectByExample(BasUserExample example);

    BasUser selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BasUser record, @Param("example") BasUserExample example);

    int updateByExample(@Param("record") BasUser record, @Param("example") BasUserExample example);

    int updateByPrimaryKeySelective(BasUser record);

    int updateByPrimaryKey(BasUser record);

    @Select("SELECT * FROM bas_user WHERE hosnum = #{hosnum}")
    List<BasUser> getBasUsersByHosnum(@Param("hosnum")String hosnum);

    @Select("SELECT COUNT(*) FROM bas_user WHERE hosnum = #{hosnum}")
    int getBasUserCount(@Param("hosnum") String hosnum);
}