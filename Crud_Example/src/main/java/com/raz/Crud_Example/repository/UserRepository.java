package com.raz.Crud_Example.repository;


import com.raz.Crud_Example.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
