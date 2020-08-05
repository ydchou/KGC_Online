package cn.kgc.wxc.exam.mapper;

import cn.kgc.wxc.exam.entity.ExamResult;
import cn.kgc.wxc.exam.entity.ExamResultExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExamResultMapper {
    int countByExample(ExamResultExample example);

    int deleteByExample(ExamResultExample example);

    int insert(ExamResult record);

    int insertSelective(ExamResult record);

    List<ExamResult> selectByExample(ExamResultExample example);

    int updateByExampleSelective(@Param("record") ExamResult record, @Param("example") ExamResultExample example);

    int updateByExample(@Param("record") ExamResult record, @Param("example") ExamResultExample example);
}