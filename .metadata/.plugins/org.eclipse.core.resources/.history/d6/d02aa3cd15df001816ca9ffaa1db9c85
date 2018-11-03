package ems.member.service;

import ems.member.Student;

public class StudentAllSelectService {
	
	private StudentDao studentDao;
	
	public StudentAllSelectService(StudentDao studentDao) {
		this.studentDao = studentDao;
	}
	
	public Mapo<String, Student> allSelect(){
		return studentDao.getStudentDB();
	}

}
