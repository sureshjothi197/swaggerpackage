package com.cartaskdb.interfacee;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.naming.InvalidNameException;

import com.cartaskdb.model.Student;
import com.cartaskdb.model.Laptop;

public interface CartaskdbInterfacee {
	
	public Laptop insert(Laptop a) ;
	public List<Laptop> getall();
	public Optional<Laptop> getbyid(long id);
	public Laptop delete(Laptop a);
	public void deleteall();
	public Laptop update(long id,Laptop a) throws InvalidNameException;
	public Student newinsert(Student b);
	

}
