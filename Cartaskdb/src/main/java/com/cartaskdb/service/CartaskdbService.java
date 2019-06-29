package com.cartaskdb.service;

import java.util.List;
import java.util.Optional;

import javax.naming.InvalidNameException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cartaskdb.interfacee.CartaskdbInterfacee;
import com.cartaskdb.model.Laptop;
import com.cartaskdb.model.Student;
import com.cartaskdb.repository.CardetailsRepository;
import com.cartaskdb.repository.CartaskdbRepository;


@Component
public class CartaskdbService implements CartaskdbInterfacee
{
	
	@Autowired
	CartaskdbRepository repository;
	@Autowired
	CardetailsRepository Repository;
	
	
	public Laptop insert(Laptop a)  {
		return repository.save(a);
	}
	
	public Student newinsert(Student b)  {
		
		return Repository.save(b);
	}
	public List<Laptop> getall() {
		return repository.findAll();
		 
	}
	public Optional<Laptop> getbyid( long id){
		return  repository.findById(id);
	}
	public Laptop delete(Laptop a) {
		
		
		repository.delete(a);
		return a;
	}
	public void deleteall() {
		repository.deleteAll();
	}
	
	@Override
	public Laptop update( long id,Laptop a) throws  InvalidNameException {
if(a.getLname().equals("bmw")) {
	throw new InvalidNameException("BMW not allowed");
}
else {
	System.out.println("your entering the correct brand");
}
return repository.save(a);
		
	}
	 
	
	
	}


