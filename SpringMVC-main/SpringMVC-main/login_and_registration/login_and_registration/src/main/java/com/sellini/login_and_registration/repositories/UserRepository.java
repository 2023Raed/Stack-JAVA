package com.sellini.login_and_registration.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sellini.login_and_registration.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
List<User>findAll();
	
	Optional<User> findByEmail(String email);
}
