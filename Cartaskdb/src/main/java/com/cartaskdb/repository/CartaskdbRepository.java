package com.cartaskdb.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cartaskdb.model.*;
@Repository
public interface CartaskdbRepository extends JpaRepository<Laptop,Long> {

	//Optional<CartaskdbModel> findByColor(String string); 

}
