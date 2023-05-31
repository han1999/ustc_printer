package com.hanxiao.mapper;

import com.hanxiao.bean.Itemprice;
import com.hanxiao.bean.ItempriceExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ItempriceMapper {
    long countByExample(ItempriceExample example);

    int deleteByExample(ItempriceExample example);

    int deleteByPrimaryKey(Integer itemId);

    int insert(Itemprice record);

    int insertSelective(Itemprice record);

    List<Itemprice> selectByExample(ItempriceExample example);

    Itemprice selectByPrimaryKey(Integer itemId);

    int updateByExampleSelective(@Param("record") Itemprice record, @Param("example") ItempriceExample example);

    int updateByExample(@Param("record") Itemprice record, @Param("example") ItempriceExample example);

    int updateByPrimaryKeySelective(Itemprice record);

    int updateByPrimaryKey(Itemprice record);
}