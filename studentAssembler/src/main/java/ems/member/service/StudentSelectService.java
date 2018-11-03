package ems.member.service;

import ems.member.Student;

public class StudentSelectService {
	
	private StudentDao studentDao;
	
	public StudentSelectService(StudentDao studentDao) {
		this.studentDao = studentDao;
	}
	
	public void select(Student student) {
		if(verify(student.getsNum())){
			return studentDao.select(student.getsNum());
		} else {
			System.out.println("Student information is not available.");
		}
		  
		return null;
	}
	
	public boolean verify(String sNum) {
		Student student = studentDao.select(sNum);
		return student != null ? true : false;
	}

}
