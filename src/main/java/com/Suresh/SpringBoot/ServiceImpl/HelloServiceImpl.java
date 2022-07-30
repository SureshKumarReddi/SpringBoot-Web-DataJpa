package com.Suresh.SpringBoot.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Suresh.SpringBoot.Dao.StudentDao;
import com.Suresh.SpringBoot.Models.Student;
import com.Suresh.SpringBoot.Service.HelloService;

@Service
public class HelloServiceImpl implements HelloService {

	@Autowired
	private StudentDao dao;

	@Override
	public Student getStudent(Integer sid) {
		return dao.getStudent(sid);
	}

	@Override
	public Iterable<Student> getAllStudents() {
		return dao.getAllStudents();
	}

	@Override
	public List<Student> getStudentNameAndAge(String studname, int age) {
		return dao.getStudentNameAndAge(studname, age);
	}

	@Override
	public List<Integer> getStudentNameAndAgeGt(int age) {
		return dao.getStudentNameAndAgeGt(age);
	}

}
