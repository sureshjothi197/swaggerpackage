package com.cartaskdb.controller;


import java.util.List;
import java.util.Optional;

import javax.naming.InvalidNameException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cartaskdb.model.Student;
import com.cartaskdb.model.Laptop;
import com.cartaskdb.service.CartaskdbService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;



@RestController

@RequestMapping("car")
@Api(value="online book",description="operation to be performed")
public class CartaskdbController {
	@Autowired
	CartaskdbService service;
	@ApiOperation(value="view list of options",response=Iterable.class)
	@ApiResponses(value= {
			   @ApiResponse(code = 200, message = "Successfully retrieved list"),

	            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),

	            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),

	            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
	})
   
	@PostMapping("insert")
	private Laptop insert(@RequestBody Laptop a)  {
		return service.insert(a);
	}
	
	@PostMapping("newinsert")
	private Student newinsert(@RequestBody Student b)  {
		return service.newinsert(b);
	}
	@RequestMapping(value="getall",method=RequestMethod.GET,produces="application/json")
	@GetMapping("getall")
	private List<Laptop> getall() {
		return service.getall();
	}

	@GetMapping("getbyid/{id}")
	private Optional<Laptop> getbyid(@PathVariable long a) {
		return service.getbyid(a);
	}

	@DeleteMapping("delete/{id}")
	private Laptop delete(@PathVariable long id, Laptop a) {
		

		return service.delete(a);
	}

	@DeleteMapping("deleteall")
	private void deleteall() {
		service.deleteall();
	}

	@PutMapping("update/{id}")
	private Laptop update(@PathVariable long id, @RequestBody Laptop a) throws  InvalidNameException  {

		return service.update(id, a);
	}
}
