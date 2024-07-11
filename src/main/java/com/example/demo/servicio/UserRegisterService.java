package com.example.demo.servicio;

import java.util.List;

import com.example.demo.entidades.UserRegister;

public interface UserRegisterService {
	public List<UserRegister> getAll();
	public void UserCreated(UserRegister nuevoRegistro);
}