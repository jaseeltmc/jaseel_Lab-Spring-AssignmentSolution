package com.greatlearning.studentmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.studentmanagement.model.Student;
import com.greatlearning.studentmanagement.repository.StudentsRepository;



@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentsRepository studentsRepository;
	
	
	
	@Override
	public List<Student> findAllStudens() {
		return studentsRepository.findAll();
	}

	@Override
	public Student findById(int id) {
		return studentsRepository.findById(id).get();
	}

	@Override
	public Student save(Student student) {
		return studentsRepository.save(student);
	}

	@Override
	public void deleteById(int id) {
		studentsRepository.deleteById(id);
		
	}

}
