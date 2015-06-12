<%@page import="java.util.ArrayList"%>
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
<s:iterator value="SetofRows"><tr>
<td><s:property value ="FirstName"/></td><td><s:property value ="LastName"/></td><td><s:property value ="Address"/></td><td><s:property value ="City"/></td><td><s:property value ="State"/></td><td><s:property value ="Zip"/></td><td><s:property value ="Tel"/></td><td><s:property value ="Email"/></td><td><s:property value ="Day"/></td><td><s:property value ="Month"/></td><td><s:property value ="Year"/></td><td><s:property value ="Likes"/></td><td><s:property value ="Recommend"/></td><td><s:property value ="Raffle"/></td><td><s:property value ="Comments"/></td>
<td><s:form action="RAFRemove" >
<s:hidden name="IdToRemove" value="%{Email}" />
 <s:submit value="Delete" /> 
</s:form></td></tr></s:iterator>
</table>
</body>
</html>