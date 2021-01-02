package com.alvesjefs.hrusers.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alvesjefs.hrusers.domain.Users;

public interface UsersRepository extends JpaRepository<Users, Long> {

	Users findByEmail(String email);

	Users findByName(String name);
}
