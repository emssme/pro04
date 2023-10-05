<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Springframework Validator - check4.jsp</title>
</head>
<body>
    <div class="container">
        <h2>Springframework Validator를 이용한 폼 유효성 검증</h2>
        <form action="./check4pro" method="post">
            <!-- 영문 소문자와 숫자 조합, 글자길이 5~12글자 사이의 유효성 패턴 -->
            id: <input type="text" name="id" id="id"/><br><br>
            <!-- 영문 소문자, 대문자, 숫자 조합 8~12글자 사이의 유효성 패턴 -->
            pw: <input type="password" name="pw" id="pw"/>
            <button type="submit">확인</button>
        </form>
    </div>
</body>
</html>
