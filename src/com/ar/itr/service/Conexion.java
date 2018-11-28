package com.ar.itr.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.ar.itr.entity.Usuario;

public class Conexion {
	
	public static void main(String[] args) throws SQLException {
		
		Connection con = new Conexion().execute();
		
		System.out.println(new Conexion().leerUsuario(con, "gabriel", "Espina"));
	 
	}
	
	
	public Connection execute() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test?user=root&password=");
			return conn;
			
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}


	public Usuario leerUsuario(Connection con, String nombre, String password) throws SQLException {
		
		Statement st =  con.createStatement();
		 
		String sql = "SELECT * FROM USUARIO WHERE nombre = '" + nombre + "'";
		
		ResultSet rs = st.executeQuery(sql);
	
		while(rs.next())
			if(nombre.equals(rs.getString("nombre")) &&  password.equals(rs.getString("password"))) {
				Usuario usuario = new Usuario(rs.getInt("id"), 
											  rs.getString("nombre"), 
											  rs.getString("password"),
											  rs.getString("role"));
				return usuario;
			}
 
		return null;
		
	}

}
