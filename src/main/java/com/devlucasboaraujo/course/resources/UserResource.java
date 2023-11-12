package com.devlucasboaraujo.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devlucasboaraujo.course.entitties.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
    @GetMapping
	public ResponseEntity<User> findAll() {
		
		User u = new User(1L, "Lucas", "lucasboaraujo@hotmail.com", "71993543702", "desenvolvedor");
		return ResponseEntity.ok().body(u);

	}
}
