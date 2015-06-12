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

<s:form action="FormSubmit">
      <s:textfield name="FirstName" label="First Name" tooltip ="Enter your first name" labelpostition = "left" />
      <s:textfield name="LastName" label="Last Name" tooltip ="Enter your last name" labelpostition = "left" />
      <s:textfield name="SAddress" label="Street Address" tooltip ="Enter Street Address" labelpostition = "left" />
      <s:textfield name="City" label="City" tooltip ="Enter the name of the City" labelpostition = "left" />
      <s:textfield name="State" label="State" tooltip ="Enter the name of the State" labelpostition = "left" />
      <s:textfield name="ZIP" label="ZIP" tooltip ="Enter the ZIP Code" labelpostition = "left" maxlength ="5" size ="5" />
      <s:textfield name="Tel" label="Tel" tooltip ="Enter the Telephone Number" labelpostition = "left" maxlength ="10" size ="10" />
      <s:textfield name="Email" label="Email" tooltip ="Enter the Email Address" labelpostition = "left" />
      <s:textfield name="Day" label = "Day" tooltip ="Please enter the current day using 2 digits" labelposition = "left" maxlength ="2" size ="2" />
      <s:textfield name="Month" label = "Month" tooltip ="Please enter the current month using 2 digits" labelposition = "left" maxlength ="2" size ="2" />
      <s:textfield name="Year" label = "Year" tooltip ="Please enter the current year using 4 digits" labelposition = "left" maxlength ="4" size ="4" />
      <s:checkboxlist  name="Liked" label="Most liked about campus" list="{'students', 'location', 'campus', 'atmosphere', 'dorm rooms', 'sports'}" labelposition ="left"/>
      <s:radio  name="Recommend" label="Likelyhood to recommend this school" list="{'Very Likely','Likely','Unlikely'}" />
      <s:textfield name="Raffle" label = "Raffle" tooltip ="Please enter the 10 2 digit raffle numbers separated by commas" labelposition = "left" maxlength ="29" size ="29" />
      <s:textfield name="Comments" label="Comments" tooltip ="Enter Additional Comments" labelpostition = "left" maxlength = "50" size="50" />
      <s:textfield name="ECName1" label="Emergency Contact Name1" tooltip ="Enter the name of your first Emergency Contact" labelpostition = "left" />
      <s:textfield name="ECTel1" label="Emergency Contact Tel1" tooltip ="Enter his Telephone Number" labelpostition = "left" maxlength ="10" size ="10" />
      <s:textfield name="ECName2" label="Emergency Contact Name2" tooltip ="Enter the name of your second Emergency Contact" labelpostition = "left" />
      <s:textfield name="ECTel2" label="Emergency Contact Tel2" tooltip ="Enter his Telephone Number" labelpostition = "left" maxlength ="10" size ="10" />
      <s:reset value="clear" />
      <s:submit value="submit" /> 
 </s:form>
</body>
</html>