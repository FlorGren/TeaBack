package com.example.demo.controlador;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entidades.UserRegister;
import com.example.demo.servicio.impl.UserRegisterServiceImpl;

@RestController
@RequestMapping("/userRegister")
@CrossOrigin
public class UserRegisterController {
	@Autowired
	private UserRegisterServiceImpl servicio;
	
	@GetMapping("/")
	public List<UserRegister> getCuentas() {
		List<UserRegister> listaCuentas = new ArrayList<UserRegister>();
		listaCuentas = servicio.getAll();
		return listaCuentas;
	}
	
	@PostMapping("/userCreated")
	public void userCreated(@RequestBody UserRegister cuenta) {
		servicio.UserCreated(cuenta);
	}
}