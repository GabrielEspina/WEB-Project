package com.ar.itr.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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


	public boolean leerUsuario(Connection con, String nombre, String password) throws SQLException {
		
		Statement st =  con.createStatement();
		 
		String sql = "SELECT * FROM USUARIO WHERE nombre = '" + nombre + "'";
		
		ResultSet rs = st.executeQuery(sql);
	
		while(rs.next())
			if(nombre.equals(rs.getString("nombre")) &&  password.equals(rs.getString("password")))
				return true;
		
		return false;
		
	}

}
