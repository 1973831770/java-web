<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <link rel="stylesheet" href="css/css.css">
</head>
<body>

<%--//①列表效果如图展示信息,样式可以不一样（5分）--%>
<form action="Tj">

    直播间名称:<input type="text" name="name" value="${name}">
    开播状态：<input type="radio" ${status.equals("0")?'checked':''} name="status" value="0">待直播
    <input type="radio" ${status.equals("1")?'checked':''} name="status" value="1">已直播

<%--    ⑦多个条件可以组合查询（3分）--%>
    <input type="submit" value="搜索">

</form>
<table>
    <tr>
        <td>编号</td>
        <td>直播间名称</td>
        <td>直播间内容</td>
        <td>开播时间</td>
        <td>开播状态</td>
        <td>播主编号</td>
        <td>播主</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${list}" var="e">

        <tr>
            <td>${e.id}</td>
            <td>${e.name}</td>
            <td>${e.content}</td>
            <td>${e.start_time}</td>
            <td>${e.status==0?'待直播':'已直播'}</td>
            <td>${e.bid}</td>
            <td>${e.bname}</td>
<%--            ①每一条数据后有一个删除超链接,点击删除,成功删除此数据(5分）--%>
            <td><a href="FindByid?id=${e.id}">修改</a> <a href="DelterId?id=${e.id}">删除</a></td>
        </tr>

    </c:forEach>
</table>
<%--①点击列表中数据后的添加按钮,跳转到添加页面( 2分）--%>
<a href="FindAllBloger">超级添加</a>

</body>
</html>