<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>Spring Mvc Start!</h3>
	<c:set var="root" value="${pageContext.request.contextPath}"/>
	<a href="${root}/hello.do?su=10&value=20">연습입니다.</a>
	
	<a href="${root}/aa/bb/cc/apple.do?str=banana">사과입니다.</a>
</body>
</html>