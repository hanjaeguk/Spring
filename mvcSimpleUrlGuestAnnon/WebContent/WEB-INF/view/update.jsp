<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<c:set var="root" value="${pageContext.request.contextPath}"/>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>방명록 수정</title>
<link href="${root}/css/guest/style.css" rel="stylesheet" type="text/css"/>
</head>
<body>
	<div align="center">
		<form class="form_style" action="${root}/guest/updateOk.do"  
			 method="post" onsubmit="return formCheck()">
			<input type="hidden" name="num" value="${guestDto.num}"/>
			<input type="hidden" name="pageNumber" value="${pageNumber}"/>
			<div class="title">
				<label>이름</label>
				<input type="text" name="name" size="15" value="${guestDto.name}" disabled="disabled"/>

				<label>비밀번호</label>
				<input type="password" name="password"  value="${guestDto.password}"/>
			</div>
			
			<div class="content">
				<textarea rows="5" cols="55" name="message">${guestDto.message}</textarea>
			</div>
			
			<div class="title" style="text-align:right;" >
				<input type="submit" value="수정"/>
				<input type="reset" value="취소"/>
			</div>
		</form>
	</div>
</body>
</html>