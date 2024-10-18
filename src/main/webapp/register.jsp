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
        <s:select list="{'USA','Canada','UK','Australia'}" name="country" headerKey="None" headerValue="Select a country" label="Country"/>
        <s:textarea name="address" cols="30" rows="7" label="Address"/>
        <s:select list="colors" name="selectedColor" headerKey="None" headerValue="Select a color" label="Favourite Color"/>   
        <s:checkbox name="subscription" value="true" label="Subscribe to our newsletter"/>
        <s:checkboxlist list="hobbies" name="seletectedHobbies" label="Hobbies"/>    
        <s:reset value="Reset"/>
        <s:submit value="Register"/> 
    </s:form>
    <table border="1" width="300">
        <tr>
            <th>Product ID</th>
            <th>Product Name</th>
            <th>Product Price</th>
        </tr>
        <s:iterator value="products" var="product">
            <tr>
                <td>
                    <s:property value="#product.productId"/>
                </td>
                <td>
                    <s:property value="#product.productName"/>
                </td>
                <td>
                    <s:property value="#product.productPrice"/>
                </td>
            </tr>
        </s:iterator>   
    </table>
</body>
</html>