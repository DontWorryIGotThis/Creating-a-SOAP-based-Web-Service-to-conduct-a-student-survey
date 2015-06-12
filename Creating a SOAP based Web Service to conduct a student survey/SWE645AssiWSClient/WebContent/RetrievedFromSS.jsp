
<%@page import="java.util.ArrayList" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Queried results</title>
</head>
<body>
<table border="1">
<tr>
<th>First Name</th><th> Last Name</th><th>Address</th><th>City</th><th>State</th><th>Zip</th><th>Telephone</th><th>Email</th><th>Day</th><th>Month</th><th>Year</th><th>Likes</th><th>Recommendations</th><th>Raffle NUmber</th><th>Comments</th>
</tr>
<s:iterator value="SetofRows"><tr >
<td colspan="15"><s:property/></td >
<%-- <td><s:form action="SSRemove" method="Saw">
<s:hidden name="IdToRemove" value="%{Email}" />
<s:hidden name="FirstName" value="%{FirstName}" />
<s:hidden name="LastName" value="%{LastName}" />
<s:hidden name="City" value="%{City}" />
<s:hidden name="State" value="%{State}" />
<s:submit value="Delete" /> 
</s:form></td> --%></tr></s:iterator>
</table>`

</body>
</html>