package com.alvesjefs.hrworkers.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alvesjefs.hrworkers.domain.Workers;
import com.alvesjefs.hrworkers.repositories.WorkersRepository;
import com.alvesjefs.hrworkers.services.exceptions.ObjectNotFoundException;

@Service
public class WorkersService {

	@Autowired
	private WorkersRepository workersRepository;

	public Workers findById(Long id) {
		Optional<Workers> worker = workersRepository.findById(id);
		return worker.orElseThrow(() -> new ObjectNotFoundException("Sorry, id not found!"));
	}

	public Workers findByName(String name) {
		Workers findName = workersRepository.findByName(name);
		return findName;
	}

	public List<Workers> findAll(Workers workers) {
		return workersRepository.findAll();
	}

	public Workers findByCpf(String cpf) {
		Workers findCpf = workersRepository.findByCpf(cpf);
		return findCpf;
	}
}
