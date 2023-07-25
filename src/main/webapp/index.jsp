<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="${ pageContext.request.contextPath }/board">게시판</a>
	<a href="${ pageContext.request.contextPath }/board/write">글쓰기</a>
	<c:if test="${ empty userVO }"> <!-- 공유영역에 userVO객체가 없다면 이라는 뜻 empty sessionScope.userVO 라고 써도 됨 -->
	<a href="${ pageContext.request.contextPath }/login">로그인</a>
	</c:if>
	<c:if test="${ not empty userVO }">
	<a href="${ pageContext.request.contextPath }/logout">로그아웃</a>
	</c:if>
	
	
	
	
</body>
</html>
