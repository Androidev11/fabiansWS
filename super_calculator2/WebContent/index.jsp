<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Calculator</title>
</head>
<body>
	<form id="myForm" action="MyServlet" method="post">
		<input id="number1" name="number1" placeholder="Number1"
		title="Number1" type="text" value="" size="4"/>
		<input id="operator" name="operator" placeholder="Operator"
		title="Operator" type="text" value="" size="4"/>
		<input id="number2" name="number2" placeholder="Number2"
		title="Number2" type="text" value="" size="4"/>
		<br>
		<br>
		<input id="calculate" name="accion" type="submit" value="calculate">
		<br>
		<br>
		<span class="result">${result1}</span>
		<br>
		<br>
		<span class="result">${result2}</span>
	</form>
		
		<br><b><a style="color:red"><%= request.getParameter("result1")!=null?request.getParameter("result1"):""%></a></b>
</body>
</html>