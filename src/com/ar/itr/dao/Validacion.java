package com.ar.itr.dao;

import java.sql.Connection;
import java.sql.SQLException;

import com.ar.itr.entity.Usuario;
import com.ar.itr.service.Conexion;

public class Validacion {
	
	public Usuario validarSesion(String usr, String pass) {
		
		Connection con = new Conexion().execute();
		
		try {
			Usuario usuario;
			
			if( (usuario =  new Conexion().leerUsuario(con, usr, pass)) != null) {
				
				return usuario;
			}
			 
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		}
	 
		return null;
		
	}

}
