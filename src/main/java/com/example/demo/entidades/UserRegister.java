package com.example.demo.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "userregister")
public class UserRegister {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column (name = "nombre")
	private String nombre;
	@Column (name = "email")
	private String email;
	@Column (name = "clave")
	private int clave;
	
	public UserRegister() {
		
	}
	
	public UserRegister(String nombre, String email, int clave) {
		super();
		this.nombre = nombre;
		this.email = email;
		this.clave = clave;
	}
	
	protected Long getId() {
		return id;
	}
	
	protected void setId(Long id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getClave() {
		return clave;
	}
	
	public void setClave(int clave) {
		this.clave = clave;
	}
}