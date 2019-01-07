<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	response.setStatus(HttpServletResponse.SC_OK);
	/*
		현재 페이지가 정상적으로 응답되는 페이지임을 지정하는 코드,
		이 코드가 생략되면 웹 브라우저는 자체적으로 제공하는 화면을 표시함
	*/
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>500에러 페이지</title>
</head>
<body>
<p>
서비스 사용에 불편을 끼쳐드려서 대단히 죄송합니다.<br>
빠른 시간내에 문제를 해결하겠습니다.
</p>

</body>
</html>