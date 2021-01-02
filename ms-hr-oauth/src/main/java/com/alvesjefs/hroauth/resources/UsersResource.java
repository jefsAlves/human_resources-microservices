package com.alvesjefs.hroauth.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alvesjefs.hroauth.domain.Users;
import com.alvesjefs.hroauth.services.UsersService;

@RestController
@RequestMapping(value = "api/oauth")
public class UsersResource {

	@Autowired
	private UsersService usersService;

	@GetMapping(value = "/searchEmail")
	public ResponseEntity<Users> findByEmail(@RequestParam String email) {
		Users findEmail = usersService.findByEmail(email);
		return ResponseEntity.ok(findEmail);
	}

}
