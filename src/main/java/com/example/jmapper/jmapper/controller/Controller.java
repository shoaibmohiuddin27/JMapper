package com.example.jmapper.jmapper.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jmapper.jmapper.model.Destination;
import com.example.jmapper.jmapper.model.Source;
import com.googlecode.jmapper.JMapper;

@RestController
public class Controller {
	
	@GetMapping("/test")
	public String test() {
		
		JMapper<Destination, Source> mapper = new JMapper<>(Destination.class, Source.class);
		
		Source source = new Source("id", "sourceField", "other");
		Destination destination = mapper.getDestination(source);
		
		System.out.println(destination.toString());
		return "success";
	}

}
