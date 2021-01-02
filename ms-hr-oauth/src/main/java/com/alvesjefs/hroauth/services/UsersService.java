package com.alvesjefs.hroauth.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.alvesjefs.hroauth.domain.Users;
import com.alvesjefs.hroauth.feignclients.UsersFeignClients;
import com.alvesjefs.hroauth.services.exceptions.ObjectNotFoundException;

@Service
public class UsersService implements UserDetailsService {

	@Autowired
	private UsersFeignClients usersFeignClient;

	public Users findByEmail(String email) {
		Users findEmail = usersFeignClient.findByEmail(email).getBody();
		if (findEmail == null) {
			throw new ObjectNotFoundException("Email not found!");
		}

		return findEmail;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Users findEmail = usersFeignClient.findByEmail(username).getBody();
		if (findEmail == null) {
			throw new UsernameNotFoundException("Email not found");
		}

		return findEmail;
	}
}
