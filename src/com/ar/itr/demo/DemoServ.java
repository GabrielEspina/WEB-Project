package com.ar.itr.demo;

import javax.servlet.http.*;

import com.ar.itr.service.Conexion;

import javax.servlet.*;
import java.io.*;
import java.sql.Connection;
import java.sql.SQLException;

public class DemoServ extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		 
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
		
		Connection con = new Conexion().execute();
		
		out.println("<html>");
        out.println("<head>");
        out.println("<title>Inicio de sesion</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h3>Login</h3>");
        
        out.println("<html><head><title>Inicio de sesion</title></head><body><h3>Login</h3>");
		
		
		
		if( con != null) {
			String name = req.getParameter("name");
			String password = req.getParameter("password");
			try {
				if( new Conexion().leerUsuario( con , name , password ) ) 
					out.println("Usuario Correcto:<br>" + name);
				else 
					out.println("Usuario Incorrecto:<br>" + name);
				
			} catch (SQLException e) {
				
				out.println("Error:<br>" + e.getMessage());
				
				e.printStackTrace();
			}

	        out.println("</body>");
	        out.println("</head>");
	        out.println("</html>");
		}
			
		
		
        
	
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
        
        String name = req.getParameter("name");

	}
}