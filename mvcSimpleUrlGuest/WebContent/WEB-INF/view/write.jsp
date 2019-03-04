<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<c:set var="root" value="${pageContext.request.contextPath}"/>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>방명록 쓰기</title>
<link href="${root}/css/guest/style.css" rel="stylesheet" type="text/css"/>
<script type="text/javascript" src="${root}/css/guest/script.js"></script>
</head>
<body>
	<div align="center">
		<div align="center">		
		페이지당 게시물수:${guestList.size()}
		전체 레코드수:${count}
		게시물 사이즈:${boardSize}
		요청페이지:${currentPage}<br>
		</div>
		<br>
			<c:if test="${count == 0 || currentPage ==1}">
				<form id="guestForm" class="form_style" action="${root}/guest/writeOk.do" method="post" onsubmit="return formCheck()">
					<div class="title">
						<label>이름</label>
						<input type="text" name="name" size="12"/>&nbsp;&nbsp;
						
						<label>비밀번호</label>
						<input type="password" name="password"/>
					</div>
					
					<div class="content">
						<textarea rows="5" cols="55" name="message"></textarea>
					</div>
					
					<div class="title" style="text-align:right;" >
						<input type="submit" value="확인"/>
						<input type="reset" value="취소"/>
					</div>
				</form>
			</c:if>
			
			<c:if test="${count>0}">
				<c:forEach var="guest" items="${guestList}">
					<div class="form_style" style="height:130px">
						<div class="disp" style="border-width: 1px">
							${guest.name} &nbsp;&nbsp;&nbsp;
							<fmt:formatDate value="${guest.writeDate}" type="date"/>
							
							
							<a href="${root}/guest/update.do?num=${guest.num}&pageNumber=${currentPage}">수정</a>
							<a href="javascript:deleteCheck('${root}/guest/delete.do?num=${guest.num}&pageNumber=${currentPage}')">삭제</a>
						</div>
												
						<div class="disp-content">
							${guest.message}
						</div>
					</div>
					<br><br>
				</c:forEach>		
			</c:if>
		</div>
		
		<center>
		<!-- 페이지번호 -->
		<c:set var="pageBlock" value="${3}"/>
		<fmt:parseNumber var="rs" value="${(currentPage-1)/pageBlock}" integerOnly="true"/>
		<c:set var="startPage" value="${rs * pageBlock+1}"/>
		<c:set var="endPage" value="${startPage+pageBlock-1}"/>
		<c:set var="pageCount" value="${count/boardSize+(count%boardSize == 0 ? 0:1)}"/>
		<c:if test="${endPage > pageCount}">
			<c:set var="endPage" value="${pageCount}"/>
		</c:if>
		
		<c:if test="${startPage > pageBlock}">
			<a href="${root}/guest/write.do?pageNumber=${startPage-pageBlock}">[이전]</a>
		</c:if>
		
		<c:forEach var="i" begin="${startPage}" end="${endPage}">
			<a href="${root}/guest/write.do?pageNumber=${i}">[${i}]</a>		
		</c:forEach>
		
		<c:if test="${endPage < pageCount}">
			<a href="${root}/guest/write.do?pageNumber=${startPage+pageBlock}">[다음]</a>
		</c:if>
		
		</center>
		
		
</body>
</html>











