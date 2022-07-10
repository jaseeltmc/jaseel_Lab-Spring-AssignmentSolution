package com.greatlearning.studentmanagement.service;

import java.util.List;

import com.greatlearning.studentmanagement.model.Student;

public interface StudentService {
	
	public List<Student> findAllStudens();
	public Student findById(int id);
	public Student save(Student student);
	public void deleteById(int id);

}
