package cn.kgc.wxc.exam.mapper;

import cn.kgc.wxc.exam.entity.Itembank;
import cn.kgc.wxc.exam.entity.ItembankExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItembankMapper {
    int countByExample(ItembankExample example);

    int deleteByExample(ItembankExample example);

    int deleteByPrimaryKey(Integer eid);

    int insert(Itembank record);

    int insertSelective(Itembank record);

    List<Itembank> selectByExample(ItembankExample example);

    Itembank selectByPrimaryKey(Integer eid);

    int updateByExampleSelective(@Param("record") Itembank record, @Param("example") ItembankExample example);

    int updateByExample(@Param("record") Itembank record, @Param("example") ItembankExample example);

    int updateByPrimaryKeySelective(Itembank record);

    int updateByPrimaryKey(Itembank record);
}