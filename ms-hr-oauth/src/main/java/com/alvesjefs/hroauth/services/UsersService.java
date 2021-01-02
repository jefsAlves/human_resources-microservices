package com.alvesjefs.hroauth.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alvesjefs.hroauth.domain.Users;
import com.alvesjefs.hroauth.feignclients.UsersFeignClients;
import com.alvesjefs.hroauth.services.exceptions.ObjectNotFoundException;

@Service
public class UsersService {

	@Autowired
	private UsersFeignClients usersFeignClient;

	public Users findByEmail(String email) {
		Users findEmail = usersFeignClient.findByEmail(email).getBody();
		if (findEmail == null) {
			throw new ObjectNotFoundException("Email not found!");
		}

		return findEmail;
	}
}
