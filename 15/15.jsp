<!DOCTYPE html>
<html>
<head>
	<title> JSP </title>
</head>
<body>
	<jsp:useBean id="myBean" class="mycom.Operations" scope="page" />
	<jsp:setProperty name="myBean" value="*" />
	<jsp:getProperty name="myBean" property="op1" name="myBean" />
	<jsp:getProperty name="myBean" property="op2" name="myBean" />
	<jsp:getProperty name="myBean" property="op" name="myBean" />
	<jsp:param name="op" value="op" />
	<h3> Result: <%=myBean.performOperation("op")%> </h3>
</body>
</html>