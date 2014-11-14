<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<link  rel="stylesheet" type="text/css"  href="static/css/test.css">
</head>

<body>
	<h2>Customer SignUp Form - JSR303 @Valid example</h2>

	<form:form method="POST" modelAttribute="customer"
		action="customer/signup">
		<form:errors path="*" cssClass="errorblock" element="div" />
		<table>
			<tr>
				<td>Customer Name :</td>
				<td><form:input path="name" /></td>
				<td><form:errors path="name" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Customer Age :</td>
				<td><form:input path="age" /></td>
				<td><form:errors path="age" cssClass="error" /></td>
			</tr>
			<tr>
				<td colspan="3"><input type="submit" /></td>
			</tr>
		</table>
	</form:form>

</body>
</html>