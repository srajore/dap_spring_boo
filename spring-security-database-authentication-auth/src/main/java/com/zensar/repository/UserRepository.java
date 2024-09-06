package com.zensar.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zensar.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	List<User> findByUserName(String userName);

}
