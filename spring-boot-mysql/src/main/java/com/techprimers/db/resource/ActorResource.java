package com.techprimers.db.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techprimers.db.model.actor;
import com.techprimers.db.repository.ActorRepository;





@RestController
@RequestMapping(value="/rest/actors")
public class ActorResource {
	
	@Autowired
	ActorRepository actorsRepository;
	
	@GetMapping(value = "/all")
	public List<actor> getAll(){
		return actorsRepository.findAll();
		
		
	}
	
	
	
	@PostMapping
	public List<actor> persist(@RequestBody final actor actors){
		actorsRepository.save(actors);
		return actorsRepository.findAll();
	}
	
	

}
