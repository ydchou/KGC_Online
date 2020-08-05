package cn.kgc.wxc.exam.mapper;

import cn.kgc.wxc.exam.entity.ClassRoom;
import cn.kgc.wxc.exam.entity.ClassRoomExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClassRoomMapper {
    int countByExample(ClassRoomExample example);

    int deleteByExample(ClassRoomExample example);

    int deleteByPrimaryKey(Integer rid);

    int insert(ClassRoom record);

    int insertSelective(ClassRoom record);

    List<ClassRoom> selectByExample(ClassRoomExample example);

    ClassRoom selectByPrimaryKey(Integer rid);

    int updateByExampleSelective(@Param("record") ClassRoom record, @Param("example") ClassRoomExample example);

    int updateByExample(@Param("record") ClassRoom record, @Param("example") ClassRoomExample example);

    int updateByPrimaryKeySelective(ClassRoom record);

    int updateByPrimaryKey(ClassRoom record);
}