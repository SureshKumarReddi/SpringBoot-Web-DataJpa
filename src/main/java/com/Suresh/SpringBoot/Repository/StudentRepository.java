package com.Suresh.SpringBoot.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.Suresh.SpringBoot.Models.Student;
import java.lang.String;
import java.util.List;

public interface StudentRepository extends CrudRepository<Student, Integer>{

 List<Student> findByStudNameAndStudAge(String studname,int age);
 
 @Query("SELECT s.studphone FROM Student s WHERE s.studAge >:age")
 List<Integer> 	getStudPhoneBystudAgeGreaterThan(int age);
	 
 
 	
}
