package com.example.studentdetails;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {
	@Autowired
	StudentRepository studRepo;
	
	public String addStudent(Student stud) {
		studRepo.save(stud);
		return "Succesfully Saved";
	}

	public Student getStudent(int id) {
		return studRepo.findById(id).get();
	}

	public String updatStudent(Student id) {
		studRepo.save(id);
		return "Successfully Updated";
	}

	public String deleteStudent(int id) {
		studRepo.deleteById(id);
		return "Successfully Deleted";
	}

	public String addStudentList(List<Student> stud) {
		studRepo.saveAll(stud);
		return "Successfully Saved By List";
	}

	public List<Student> getStudentList() {
		return studRepo.findAll();
	}
	
	public String getStudentName(int number) {
		return studRepo.getStudentName(number);
	}
	
	public int getAttandance(int number) {
		return studRepo.getAttendance(number);
	}
	
	public Student getStudentList1(int number) {
		return studRepo.getStudentList1(number);
	}

	public List<Integer> getRoll() {
		
		return studRepo.getRoll();
	}

}
