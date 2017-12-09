<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<body>
<h2>Hello World!!!</h2>
<a href="${pageContext.request.contextPath}/home.jsp">home1</a>
<a href="/home.jsp">home2</a>
<div>${pageContext.request.contextPath}</div>
"${request.contextPath}"
<a href="${pageContext.request.contextPath}/loginForm1">loginForm1</a>
</body>
</html>