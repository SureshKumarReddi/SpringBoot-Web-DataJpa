package com.Suresh.SpringBoot.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENT_DTLS")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int studId;
	private String studName;
	private int studAge;
	private int studphone;
	
	
	public Student() {
	}

	public Student(String studName, int studAge, int studphone) {
		this.studName = studName;
		this.studAge = studAge;
		this.studphone = studphone;
	}

	public int getStudId() {
		return studId;
	}


	public void setStudId(int studId) {
		this.studId = studId;
	}


	public String getStudName() {
		return studName;
	}


	public void setStudName(String studName) {
		this.studName = studName;
	}


	public int getStudAge() {
		return studAge;
	}


	public void setStudAge(int studAge) {
		this.studAge = studAge;
	}


	public int getStudphone() {
		return studphone;
	}


	public void setStudphone(int studphone) {
		this.studphone = studphone;
	}

	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studName=" + studName + ", studAge=" + studAge + ", studphone="
				+ studphone + "]";
	}

}
