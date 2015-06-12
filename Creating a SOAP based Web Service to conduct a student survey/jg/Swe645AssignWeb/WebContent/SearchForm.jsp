<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix ="s" uri = "/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Survey Form</title>
</head>
<body>

<s:form action="FormSearch">
      <s:textfield name="FirstName" label="First Name" tooltip ="Enter your first name" labelpostition = "left" />
      <s:textfield name="LastName" label="Last Name" tooltip ="Enter your last name" labelpostition = "left" />
      <s:textfield name="City" label="City" tooltip ="Enter the name of the City" labelpostition = "left" />
      <s:textfield name="State" label="State" tooltip ="Enter the name of the State" labelpostition = "left" />
      <s:reset value="clear" />
      <s:submit value="submit" /> 
 </s:form>
</body>
</html>