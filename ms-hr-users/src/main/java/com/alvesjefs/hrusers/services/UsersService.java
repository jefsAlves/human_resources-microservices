package com.alvesjefs.hrusers.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alvesjefs.hrusers.domain.Users;
import com.alvesjefs.hrusers.repositories.UsersRepository;
import com.alvesjefs.hrusers.services.exceptions.ObjectNotFoundException;

@Service
public class UsersService {

	@Autowired
	private UsersRepository usersRepository;

	public Users findById(Long id) {
		Optional<Users> findId = usersRepository.findById(id);
		return findId.orElseThrow(() -> new ObjectNotFoundException("Id not found!"));
	}

	public List<Users> findAll(Users users) {
		return usersRepository.findAll();
	}

	public Users findByEmail(String email) {
		Users findEmail = usersRepository.findByEmail(email);
		return findEmail;
	}

	public Users findByName(String name) {
		Users findName = usersRepository.findByName(name);
		return findName;
	}

}
