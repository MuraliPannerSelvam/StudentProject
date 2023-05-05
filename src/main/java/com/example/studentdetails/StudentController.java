package com.example.studentdetails;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.studentdetails.exception.StudentNotFoundAgeException;


@RestController
public class StudentController {
	@Autowired
	StudentService studSer;
	
	@PostMapping(value="/addStudentMurali")
	public String addStudent(@RequestBody Student stud) throws StudentNotFoundAgeException {
		return studSer.addStudent(stud);
	}
	
	@GetMapping(value="/getStudent/{id}")
	public Student getStudent(@PathVariable int id) {
		return studSer.getStudent(id);
	}
	
	@PutMapping(value="/updateStudent/{id}")
	public String updateStudent(@RequestBody Student id) {
		return studSer.updateStudent(id);
	}
	
	@DeleteMapping(value="/deletStudent/{id}")
	public String deleteStudent(@PathVariable int id) {
		return studSer.deleteStudent(id);
	}
	
	@PostMapping(value="/addStudentList")
	public String addStudentList(@RequestBody List<Student> stud) {
		return studSer.addStudentList(stud);
	}
	
	@GetMapping(value="/getStudentList") 
	public List<Student> getStudentList() {
		return studSer.getStudentList();
	}
	
	@GetMapping(value="/getStudentName/{number}")
	public String getStudentName(@PathVariable int number) {
		return studSer.getStudentName(number);
	}
	
	@GetMapping(value="/getAttendance/{number}")
	public int getAttendance(@PathVariable int number) {
		return studSer.getAttendance(number);
	}
	
	@GetMapping(value="/getStudentList1/{number}")
	public Student getStudentList1(@PathVariable int number) {
		return studSer.getStudentList1(number);
	}
	
	@GetMapping("/getRoll")
	public List<Integer> getRoll() {
		return studSer.getRoll();
	}

}
