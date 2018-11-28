package com.ar.itr.demo;

import javax.servlet.http.*;

import com.ar.itr.dao.Validacion;
import com.ar.itr.entity.Usuario;

import javax.servlet.*;
import java.io.*;

public class DemoServ extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		Validacion valid = new Validacion();
		
		String usr = request.getParameter("name");
		String pass = request.getParameter("password");
		
		Usuario user ;
 
		if( (user = valid.validarSesion(usr, pass)) != null ) {
			request.setAttribute( "error" , "OK");
			request.setAttribute("usuario", user);
			
			request.getRequestDispatcher("/menu"+user.getRole()+".jsp").forward(request, response);

		}else {
			
			request.setAttribute( "error" , "Error en login");
			
			

			request.getRequestDispatcher("/login.jsp").forward(request, response);
			
			
		}
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
        
        String name = req.getParameter("name");

	}
}