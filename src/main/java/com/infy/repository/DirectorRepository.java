package com.infy.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infy.entity.Director;


@Repository("directorRepository")
public interface DirectorRepository  extends JpaRepository<Director,Integer>{

	
	  public Optional<Director> findByFirstName(String name);
	  
}
