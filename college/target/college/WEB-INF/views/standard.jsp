<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<body>
		<div>
			<form:form method="POST" action="/college/standard" modelAttribute="college" >
				<table>
        			<tr>
        				<td>Name</td>
        				<td><form:input type="text" path="name"/></td>
        			</tr>
        			<tr>
        				<td>id</td>
        				<td><form:input type="text" path="id"/> </td>
        			</tr>
        			<tr>
        			<td>Location</td>
        			<td><form:input type="text" path="location"/></td>
        			</tr>
        			<tr>
        				<td colspan=2><input type="submit" value="Save"> </td>
        			</tr>
        		</table>
			</form:form>
		</div>
	</body>
</html>