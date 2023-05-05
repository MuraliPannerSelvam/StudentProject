package com.example.studentdetails;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.studentdetails.exception.StudentNotFoundAgeException;


@Service
public class StudentService {
	@Autowired
	StudentDao studDao;
	
	public String addStudent(Student stud) throws StudentNotFoundAgeException {
			if(stud.getAge()<18) {
				throw new StudentNotFoundAgeException();
			}
			else {
				return studDao.addStudent(stud);
			}
		}

	public Student getStudent(int id) {
		return studDao.getStudent(id);
	}

	public String updateStudent(Student id) {
		return studDao.updatStudent(id);
	}

	public String deleteStudent(int id) {
		return studDao.deleteStudent(id);
	}

	public String addStudentList(List<Student> stud) {
		return studDao.addStudentList(stud);
	}

	public List<Student> getStudentList() {
		return studDao.getStudentList();
	}
	
	public String getStudentName(int number) {
		return studDao.getStudentName(number);
	}
	
	public int getAttendance(int number) {
		return studDao.getAttandance(number);
	}
	
	public Student getStudentList1(int number) {
		return studDao.getStudentList1(number);
	}

	public List<Integer> getRoll() {
		
		return studDao.getRoll();
	}

}
