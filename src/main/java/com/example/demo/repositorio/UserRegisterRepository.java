package com.example.demo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entidades.UserRegister;

public interface UserRegisterRepository extends JpaRepository<UserRegister, Long>{

}