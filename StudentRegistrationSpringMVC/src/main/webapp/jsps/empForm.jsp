<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="t"%>
<!DOCTYPE html>
<html>
	<head>
			<meta charset="ISO-8859-1">
			<title>Employee Form</title>
	</head>
	<body>
		<a href="changeLocale.htm?lang=en">English</a>
		&nbsp;&nbsp;
		<a href="changeLocale.htm?lang=es">Spanish</a>
<%-- 		<form method="post" action="saveemp.htm">
			<br>
			ID: <input type="text" name="id"/> <br>
			FirstName: <input type="text" name="fname"/> <br>
			Age: <input type="text" name="age"/> <br>
			Mobile: <input type="text" name="mobile"/> <br>
			Address: <input type="text" name="address"/> <br>
			<input type="submit" value="submit"/> <br>
		</form> --%>
		<table border=1px align="center">
		<f:form method="POST" action="saveemp.htm" modelAttribute="emp">
		<div class="container">
			<tr>
					<td class="table-warning" colspan="2">
	                    Registration Form.
					</td>
	        </tr> 
	        <tr>
			<td class="table-warning" colspan="2">
			<t:message code="emp.id"></t:message><f:input path="id"/><f:errors path="id"></f:errors><br>
			</td>
	        </tr> 
			<tr>
			<td class="table-warning" colspan="2">	
			<t:message code="emp.fname"></t:message><f:input path="fname"/><f:errors path="fname"></f:errors><br>
			</td>
	        </tr>
	        <tr>
			<td class="table-warning" colspan="2">
			<t:message code="emp.age"></t:message><f:input path="age"/><f:errors path="age"></f:errors><br>
			</td>
	        </tr>
	        <tr>
			<td class="table-warning" colspan="2">
			<t:message code="emp.mobile"></t:message><f:input path="mobile"/><f:errors path="mobile"></f:errors><br>
			</td>
	        </tr>
	        <tr>
			<td class="table-warning" colspan="2">
			<t:message code="emp.address"></t:message><f:input path="address"/><f:errors path="address"></f:errors><br>
			</td>
	        </tr>
	        <tr>
			<td align="center" class="table-warning"> 
			<input type="submit" value="Submit"/> <br/>
			</td>		
			<td align="center" class="table-warning"> 
			<button class="btn btn-primary"><span class="fa fa-refresh"/><input type="Reset" value='Reset'/></span>
            </button>
			</td>
			</tr>
		</div>
		</f:form>
		</table>
	</body>
</html>