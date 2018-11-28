<%@ page language='java' contentType='text/html;charset=iso-8859-1'%>
<%@ page import='com.ar.itr.entity.Usuario' %>
<%Usuario usuario = (Usuario)request.getAttribute("usuario");%>

<html>
  <head>
    <title>Inicio</title>
  </head>
  <body>
  	<p>Menu Administrador</p>  
  	<p>ID:			<%= usuario.getId() %></p> 
  	<p>Usuario:		<%= usuario.getNombre() %></p> 
  	
  	<header><h1>Transaccion</h1></header>
 
 	<form action="/demo" method="post">
 		<label>Banco Debito</label>
 		<select>
 			<%
	 			for(int i=0;i<4;i++){
	 				%>
	 				<option> <%="Banco " + i %>  </option>
	 				<%
	 			}
 			%>
 		</select> <br/>
 		
 		<label>Banco Credito</label>
 		<select>
 			<%
	 			for(int i=0;i<4;i++){
	 				%>
	 				<option> <%="Banco " + i %>  </option>
	 				<%
	 			}
 			%>
 		</select> <br/>
 		
 		<input type="submit" name="Realizar Transaccion"></input>
 		<input type="text" name="nombre" value=<%=usuario.getNombre() %> disabled hidden>
 	</form>
  	 
  	
  </body>
</html>