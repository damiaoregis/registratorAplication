<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Form</title>
</head>
<body>
    <h2>Registration Form</h2>
    <s:form action="registerAction">
        <s:textfield name="firstName" label="First Name"/> 
        <s:textfield name="lastName" label="Last Name"/> 
        <s:radio name="gender" list="{'Male','Female'}" label="Gender"/>
        <s:textfield name="age" label="Age"/> 
        <s:textfield name="email" label="Email"/>
        <s:submit value="Register"/> 
    </s:form>
</body>
</html>