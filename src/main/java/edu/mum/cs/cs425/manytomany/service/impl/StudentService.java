package edu.mum.cs.cs425.manytomany.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.cs.cs425.manytomany.model.Student;
import edu.mum.cs.cs425.manytomany.repository.StudentRepository;
import edu.mum.cs.cs425.manytomany.service.IStudentService;

@Service
public class StudentService implements IStudentService {
	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void saveStudent(List<Student> students) {
		if(students != null)
			studentRepository.saveAll(students);
	}
}
