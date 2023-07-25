<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2>전체게시글 조회</h2>

	<!-- 5번 반복 0~4 -->

	<%-- <c:forEach begin="0" end="4"> --%>

	<table>
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>글쓴이</th>
			<th>등록일</th>
		</tr>
		<c:forEach items="${ boardList }" var="board">
		<tr></tr>
		<td>${ board.no }</td>
		<td>
		<a href="${pageContext.request.contextPath }/board/detail?no=${ board.no }" >${ board.title }
		<c:if test="${ board.replyCnt ne 0 }">
					[${ board.replyCnt }]
				</c:if>
		</a>
		
		</td>
		<td>${ board.writer }</td>
		<td>${ board.regDate }</td>
	

		</c:forEach>
	</table>
</body>
</html>