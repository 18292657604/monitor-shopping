package com.musingtec.mapper;

import com.musingtec.bean.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 学生信息的持久层
 * @author lsy
 * @date 2018/8/24
 */
@Mapper
public interface StudentMapper {

    public List<Student> getStudentList();

    public int insertStudent(List<String> stuList);

}
