<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <link rel="stylesheet" href="css/css.css">
</head>
<body>
<form action="Insert">
    直播间名称:<input type="text" name="name" ><br>
    直播间内容:<input type="text" name="content" ><br>
    开播时间:<input type="date" name="start_time" ><br>
<%--    ②博主数据是从后台数据库查询获得的,不可写死,并显示成下拉列表框（5分）--%>
<%--    ⑤可以正确添加博主（3分)--%>
    博主: <select name="bid">
    <c:forEach items="${arr}" var="w">
        <option value="${w.bid}">${w.bname}</option>
    </c:forEach>
</select><br>
<%--    ③直播状态可以编写为静态单选按钮即可（3分)--%>
<%--    ⑥可以正确添加直播状态（3分)--%>
    开播状态：<input type="radio" ${l.status==0?'checked':''} name="name" value="0">待直播
    <input type="radio" ${l.status==1?'checked':''} name="name" value="1">已直播<br>

    <input type="submit" value="添加">

</form>

</body>
</html>