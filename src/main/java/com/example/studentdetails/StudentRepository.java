package com.example.studentdetails;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	@Query(value = "select name from student where roll_number=?", nativeQuery = true)
	public String getStudentName(int number);
	
	@Query(value = "select attendance from student where roll_number=?", nativeQuery = true)
	public int getAttendance(int number);
	
	@Query(value = "select * from student where roll_number=?", nativeQuery = true)
	public Student getStudentList1(int number);

	@Query(value = "select roll_number from student", nativeQuery = true)
	public List<Integer> getRoll();

}
