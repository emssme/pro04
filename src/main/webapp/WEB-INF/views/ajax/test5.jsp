<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<c:set var="path1" value="${pageContext.servletContext.contextPath}"/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ajax test5</title>
    <script src="http://code.jquery.com/jquery-latest.js"></script>
</head>
<body>
<nav>
    <ul>
        <li><a href="${path1}/ajax/">Home</a></li>
    </ul>
    <button id="btn5" type="button" age="27" name="김보경">Get 전송</button>
    <script>
       $(document).ready(function(){
           $("#btnt5").click(function(){
               var human = {"age":parseInt($(this).attr("age")), "name" : $(this).attr("name")};
               $.ajax({
                   type : "get",
                   url : "${path1}/ajax/test5pro",
                   data:human,
                   success: function (res) {console.log("성공",res)},
                   error: function(err){ console.log("실패", err)}
               })
           })
       })
    </script>
</nav>
</body>
</html>
