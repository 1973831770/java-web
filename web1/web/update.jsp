<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <link rel="stylesheet" href="css/css.css">
</head>
<body>
<form action="Update">
    <input type="hidden" name="id" value="${l.id}"><br>
    直播间名称:<input type="text" name="name" value="${l.name}"><br>
    直播间内容:<input type="text" name="content" value="${l.content}"><br>
    开播时间:<input type="date" name="start_time" value="${l.start_time}"><br>
    开播状态：<input type="radio" ${l.status==0?'checked':''} name="name" value="0">待直播
    <input type="radio" ${l.status==1?'checked':''} name="name" value="1">已直播<br>
    博主: <select name="bid">
    <c:forEach items="${arr}" var="w">
        <option ${l.bid==w.bid?'selected':''} value="${w.bid}" > ${w.bname}</option>
    </c:forEach>
</select><br>
    <input type="submit" value="提交">

</form>



</body>
</html>