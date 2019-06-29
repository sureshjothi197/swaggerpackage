package com.cartaskdb.model;


import java.util.List;
import javax.persistence.JoinColumn ;
import javax.persistence.JoinTable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity

public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private Long rollno;
	private String name;
	private int mark;
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name="student_rollno")
	
	 @ManyToMany(fetch=FetchType.LAZY,cascade = {CascadeType.ALL})
	 @JoinTable(name = "laptop_student")
    
	private List<Laptop> laptop;
	public Long getRollno() {
		return rollno;
	}
	public void setRollno(Long rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	public List<Laptop> getLaptop() {
		return laptop;
	}
	
	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", mark=" + mark + "]";
	}
	
	
}
