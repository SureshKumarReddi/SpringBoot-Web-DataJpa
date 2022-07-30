package com.Suresh.SpringBoot.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.Suresh.SpringBoot.Models.Student;
import com.Suresh.SpringBoot.Service.HelloService;

@RestController
public class FirstController {

	@Autowired
	private HelloService service;

    @GetMapping("/stud/{studname}/{age}")
	public ResponseEntity<List<Student>> getStudentBYNameAndAge(@PathVariable String studname, @PathVariable int age){
		return new ResponseEntity<>(service.getStudentNameAndAge(studname, age),HttpStatus.OK);
	}
 
    @GetMapping("/studgt/{age}")
	public ResponseEntity<List<Integer>> getStudentBYNameAndAgegt(@PathVariable int age){
		return new ResponseEntity<>(service.getStudentNameAndAgeGt(age),HttpStatus.OK);
	}
	
}
