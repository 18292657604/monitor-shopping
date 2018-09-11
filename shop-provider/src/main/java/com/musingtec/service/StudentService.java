package com.musingtec.service;

import com.musingtec.bean.Student;
import com.musingtec.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
	 /*
	 	@Autowired
	 	private StudentRepository studentRepository;
	 */
	 @Autowired
	 public StudentMapper studentMapper;


	 public List<Student> getStudentList(){
		 return studentMapper.getStudentList();
	 }

	@Transactional
	 public int insertStudent(){
		List stuList = new ArrayList();
		stuList.add("小猪");
		stuList.add("小黑");
		return studentMapper.insertStudent(stuList);
	 }




}
