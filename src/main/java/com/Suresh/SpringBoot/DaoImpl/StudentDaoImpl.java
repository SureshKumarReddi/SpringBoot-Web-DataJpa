package com.Suresh.SpringBoot.DaoImpl;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Suresh.SpringBoot.Dao.StudentDao;
import com.Suresh.SpringBoot.Dto.StudentDto;
import com.Suresh.SpringBoot.Models.Student;
import com.Suresh.SpringBoot.Repository.StudentRepository;

@Component
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private StudentRepository repository;
	@Autowired
	private EntityManager entityManager;
	
	public Student getStudent(Integer sid) {
		Optional<Student> findById = repository.findById(sid);
		Student student_dtls = findById.get();
		 
		return student_dtls;
	}
	
	public Iterable<Student> getAllStudents() {
		
		Iterable<Student> findAll = repository.findAll();
		return findAll;
		
	}
	
	public List<Student> getStudentNameAndAge(String studname,int age){
		return repository.findByStudNameAndStudAge(studname, age);
	}
	
	public List<Integer> getStudentNameAndAgeGt(int age){
		return repository.getStudPhoneBystudAgeGreaterThan(age);
	}
	
	public List<StudentDto> getAllStudentsByCriteriaBuilder(){
		
		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		
		CriteriaQuery<StudentDto> query = cb.createQuery(StudentDto.class);
		
		Root<Student> root = query.from(Student.class);
		
		query.select(cb.construct(StudentDto.class, root.get("studId"),root.get("studName"),
		root.get("studName"),
		root.get("studphone")));
		
		TypedQuery<StudentDto> typedQuery = entityManager.createQuery(query);
		List<StudentDto> resultList = typedQuery.getResultList();
		
		return resultList;
	}
}
