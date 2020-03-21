package edu.mum.cs.cs425.manytomany.service;

import java.util.List;

import edu.mum.cs.cs425.manytomany.model.Student;

public interface IStudentService {
	public void saveStudent(List<Student> students);
}
