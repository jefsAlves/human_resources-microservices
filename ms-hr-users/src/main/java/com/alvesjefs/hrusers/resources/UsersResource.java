package com.alvesjefs.hrusers.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alvesjefs.hrusers.domain.Users;
import com.alvesjefs.hrusers.services.UsersService;

@RestController
@RequestMapping(value = "api/users")
public class UsersResource {

	@Autowired
	private UsersService usersService;

	@GetMapping(value = "/{id}")
	public ResponseEntity<Users> findById(@PathVariable Long id) {
		Users findId = usersService.findById(id);
		return ResponseEntity.ok(findId);
	}

	@GetMapping
	public ResponseEntity<List<Users>> findAll(Users users) {
		List<Users> findId = usersService.findAll(users);
		return ResponseEntity.ok(findId);
	}

	@GetMapping(value = "/searchName")
	public ResponseEntity<Users> findByName(@RequestParam String name) {
		Users findName = usersService.findByName(name);
		return ResponseEntity.ok(findName);
	}

	@GetMapping(value = "/searchEmail")
	public ResponseEntity<Users> findByEmail(@RequestParam String email) {
		Users findEmail = usersService.findByEmail(email);
		return ResponseEntity.ok(findEmail);
	}
}
