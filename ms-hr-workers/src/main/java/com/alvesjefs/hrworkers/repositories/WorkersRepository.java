package com.alvesjefs.hrworkers.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alvesjefs.hrworkers.domain.Workers;

public interface WorkersRepository extends JpaRepository<Workers, Long> {

	Workers findByName(String name);

	Workers findByCpf(String cpf);
}
