<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix ="s" uri = "/struts-tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Index Page</title>
</head>
<body>
<a href="Form.jsp">Please click here to fill the form.</br></a>
<a href="SearchForm.jsp">Please click here to fill the search form.</br></a>
<a href="<s:url action="GetAllForms"/>">Please click here to list the surveys</a>
</body>
</html>