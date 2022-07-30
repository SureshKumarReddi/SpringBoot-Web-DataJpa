package com.Suresh.SpringBoot.Service;

import java.util.List;

import com.Suresh.SpringBoot.Models.Student;

public interface HelloService {

	public Student getStudent(Integer sid);

	public Iterable<Student> getAllStudents();

	public List<Student> getStudentNameAndAge(String studname, int age);

	public List<Integer> getStudentNameAndAgeGt(int age);

}
