package com.alvesjefs.hrworkers.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alvesjefs.hrworkers.domain.Workers;
import com.alvesjefs.hrworkers.services.WorkersService;

@RestController
@RequestMapping(value = "api/workers")
public class WorkersResource {

	@Autowired
	private WorkersService workersService;

	@GetMapping(value = "/{id}")
	public ResponseEntity<Workers> findById(@PathVariable Long id) {
		Workers workers = workersService.findById(id);
		return ResponseEntity.ok().body(workers);
	}

	@GetMapping
	public ResponseEntity<List<Workers>> findAll(Workers workers) {
		List<Workers> find = workersService.findAll(workers);
		return ResponseEntity.ok().body(find);
	}

	@GetMapping(value = "/search")
	public ResponseEntity<Workers> findByName(@RequestParam String name) {
		Workers findName = workersService.findByName(name);
		return ResponseEntity.ok().body(findName);
	}

	@GetMapping(value = "/find")
	public ResponseEntity<Workers> findByCpf(@RequestParam String cpf) {
		Workers findCpf = workersService.findByCpf(cpf);
		return ResponseEntity.ok().body(findCpf);
	}

}
