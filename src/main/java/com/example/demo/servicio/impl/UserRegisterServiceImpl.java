package com.example.demo.servicio.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entidades.UserRegister;
import com.example.demo.repositorio.UserRegisterRepository;
import com.example.demo.servicio.UserRegisterService;

@Service
public class UserRegisterServiceImpl implements UserRegisterService {
	@Autowired
	private UserRegisterRepository repo;

	@Override
	@Transactional (readOnly = true)
	public List<UserRegister> getAll() {
		List<UserRegister> listaCuentas = new ArrayList<UserRegister>();
		listaCuentas = repo.findAll();
		return listaCuentas;
	}
	
	@Override
	public void UserCreated(UserRegister nuevoRegistro) {
		repo.save(nuevoRegistro);
	}
}