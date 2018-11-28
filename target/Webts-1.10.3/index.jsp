<%@ page language='java' contentType='text/html;charset=iso-8859-1'%>
<%@ page import='com.ar.itr.entity.Usuario' %>
<%Usuario usuario = (Usuario)request.getAttribute("usuario"); %>

<html>
  <head>
    <title>Inicio</title>
  </head>
  <body>
  	<p>Bienvenido</p> <br/>
  	<p>ID:			<%= usuario.getId() %></p><br/>
  	<p>Usuario:		<%= usuario.getNombre() %></p><br/>
  	<p>Password:	<%= usuario.getPass() %></p><br/>
  	<p>Rol:			<%= usuario.getRole() %></p><br/>
  </body>
</html>