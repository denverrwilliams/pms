package com.kaizen.pms.service.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kaizen.pms.persistence.model.Foo;
import com.kaizen.pms.service.FooService;



@RestController
@RequestMapping(value = "/")
public class FooController {
	
	@Autowired
	private FooService fooService;
	
	@RequestMapping(value = "/foos")
	public List<Foo> demoFoo() {
		
		Foo foo1 = new Foo("Foo 1");
		Foo foo2 = new Foo("Foo 2");
		
		fooService.create(foo1);		
		fooService.create(foo2);	
		
		return fooService.findAll();

	}

}
