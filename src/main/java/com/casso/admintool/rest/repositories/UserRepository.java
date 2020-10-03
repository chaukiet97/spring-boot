package com.casso.admintool.rest.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

import com.casso.admintool.rest.entities.User;


public interface UserRepository extends PagingAndSortingRepository<User, Long> {
  List<User> findAll();
  User findByEmail(String email);
  User findById(Integer id);
  User saveAndFlush(User user);
  @Query("SELECT e FROM Customer e WHERE e.name = :name AND e.address = :address")
  List<User> login(@Param("name") String name, @Param("address") String address);
  // User findByPasswordHash(String passwordHash);
}
