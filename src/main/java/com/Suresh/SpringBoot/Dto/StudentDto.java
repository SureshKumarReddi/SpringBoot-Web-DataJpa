package com.Suresh.SpringBoot.Dto;

public class StudentDto {

	private int studId;
	private String studName;
	private int studAge;
	private int studphone;
	
	public StudentDto() {
		// TODO Auto-generated constructor stub
	}

	public StudentDto(int studId, String studName, int studAge, int studphone) {
		super();
		this.studId = studId;
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
		return "StudentDto [studId=" + studId + ", studName=" + studName + ", studAge=" + studAge + ", studphone="
				+ studphone + "]";
	}
	
	
}
