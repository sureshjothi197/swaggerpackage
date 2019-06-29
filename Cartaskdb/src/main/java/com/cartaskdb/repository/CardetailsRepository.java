package com.cartaskdb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cartaskdb.model.Student;

public interface CardetailsRepository extends JpaRepository<Student,Long> {

}
