package edu.mum.cs.cs425.manytomany.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Table(name = "students")
@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long studentId;
	private String studentName;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(
		name = "student_classroom",
		joinColumns = {@JoinColumn(name = "student_id", referencedColumnName = "studentId")},
		inverseJoinColumns = {@JoinColumn(name = "classroom_id", referencedColumnName = "classroomId")})
	private List<Classroom> classrooms;
	public Student() {}
	public Student(String studentName, List<Classroom> classrooms) {
		super();
		this.studentName = studentName;
		this.classrooms = classrooms;
	}
	public long getStudentId() {
		return studentId;
	}
	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public List<Classroom> getClassrooms() {
		return classrooms;
	}
	public void setClassrooms(List<Classroom> classrooms) {
		this.classrooms = classrooms;
	}
}
