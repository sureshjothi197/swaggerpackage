package com.cartaskdb.model;

import java.util.List;

import javax.persistence.CascadeType;
//import javax.persistence.CascadeType;
//import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
//import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import io.swagger.annotations.ApiModelProperty;




@Entity
public class Laptop {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@ApiModelProperty(notes="the database stored id")
	private Long lid;
	@ApiModelProperty(notes="The laptop names")
	private String lname;
	

//	@ManyToOne
//	@JoinColumn(name="student_rollno")
	@ManyToMany(fetch=FetchType.LAZY,cascade= {CascadeType.ALL})
    @JoinTable(name = "laptop_student")
     private List<Student> student;


	public Long getLid() {
		return lid;
	}


	public void setLid(Long lid) {
		this.lid = lid;
	}


	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}


	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", lname=" + lname + "]";
	}


	public List<Student> getStudent() {
		return student;
	}


    public void setStudent(List<Student> student) {
		this.student = student;
	}



	}


	

	


	



	 

	


