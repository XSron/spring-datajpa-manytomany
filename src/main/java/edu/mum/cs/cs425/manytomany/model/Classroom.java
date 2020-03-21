package edu.mum.cs.cs425.manytomany.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Table(name = "classrooms")
@Entity
public class Classroom {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long classroomId;
	private String classroomNumber;
	private String building;
	@ManyToMany(mappedBy = "classrooms")
	private List<Student> student;
	public Classroom(String classroomNumber, String building) {
		super();
		this.classroomNumber = classroomNumber;
		this.building = building;
	}
	public Classroom(String classroomNumber, String building, List<Student> student) {
		super();
		this.classroomNumber = classroomNumber;
		this.building = building;
		this.student = student;
	}
	public long getClassroomId() {
		return classroomId;
	}
	public void setClassroomId(long classroomId) {
		this.classroomId = classroomId;
	}
	public String getClassroomNumber() {
		return classroomNumber;
	}
	public void setClassroomNumber(String classroomNumber) {
		this.classroomNumber = classroomNumber;
	}
	public String getBuilding() {
		return building;
	}
	public void setBuilding(String building) {
		this.building = building;
	}
	public List<Student> getStudent() {
		return student;
	}
	public void setStudent(List<Student> student) {
		this.student = student;
	}
}
