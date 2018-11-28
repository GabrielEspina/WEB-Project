<%
	if(!request.getAttribute("error").equals("OK")){
		response.sendRedirect("/login.jsp");
		
		
	}
%>