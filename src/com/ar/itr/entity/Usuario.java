package com.ar.itr.entity;

public class Usuario implements IEntidad{
	private Integer id;
	private String nombre;
	private String pass;
	private String role;
	
	public Usuario() {
		
	}
	
	public Usuario(Integer id, String nombre, String pass, String role) {
		super();
		this.setId(id);
		this.setNombre(nombre);
		this.setPass(pass);
		this.setRole(role);
	}
	
	public String toString() {
		return getId()+ "\t" + getNombre();
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
 
	
	

}
