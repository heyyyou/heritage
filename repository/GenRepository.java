package com.projet.stock.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projet.stock.model.Generaliste;

@Repository
public interface GenRepository extends JpaRepository<Generaliste, Long>{
	
	Optional<Generaliste> findByUsername(String username);

	Boolean existsByUsername(String username);

	Boolean existsByEmail(String email);
	
	
}
