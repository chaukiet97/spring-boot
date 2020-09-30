package com.casso.admintool.rest.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.casso.admintool.rest.entities.User;


public interface UserRepository extends PagingAndSortingRepository<User, Integer> {
  Iterable<User> findAll();
}
