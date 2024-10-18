<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>pagina success</title>
</head>
<body>
    <h2>Welcome</h2>
     <s:label value="First Name:"/>
     <s:property value="firstName"/><br/>  
     <s:label value="Last Name:"/>
     <s:property value="lastName"/><br/>  
     <s:label value="Gender:"/>
     <s:property value="gender"/><br/> 
     <s:label value="Age:"/>
     <s:property value="age"/><br/>  
     <s:label value="Email:"/>
     <s:property value="email"/><br/>  
     <s:label value="Address:"/>
     <s:property value="address"/><br/> 
     <s:label value="Country:"/>
     <s:property value="country"/><br/> 
     <s:label value="Favourite Color:"/>
     <s:property value="selectedColor"/><br/>
     <s:label value="Hobbies: "/>
     <s:property value="seletectedHobbies"/>
     <s:if test="%{subscription == true}" >
        <div>You are a subscriber</div>
    </s:if>
    <s:else>
         <div>You NOT a subscriber</div>
    </s:else>

</body>
</html>