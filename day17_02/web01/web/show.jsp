<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <link rel="stylesheet" href="css/css.css">
</head>
<body>
    <%-- 向容器里面取值 --%>
    <table>
        <tr>
              <td>新闻编号</td>
            <td>新闻标题</td>
            <td>新闻作者</td>
            <td>操作</td>
        </tr>
        <%-- c:forEach 主要喜欢变量域里面变量集合
           items: 告诉 foreach的集合是什么
           var: 给每个元素起个名字  方便我们操作
           forEach：会把你循环遍历的每个元素存入到  域里面  名字   a---一个一个迭代的元素

           --%>
        <c:forEach  items="${list}" var="a">
            <tr>
                 <td>${a.newsId}</td>
                <td>${a.newsTitle}</td>
                <td>${a.newsAuthor}</td>
                <%--
                1.点击修改  跳转到修改页面

                2.突然发现  你这样非常不友好   容易遭到举报

                3. 我们要点击那一行修改   我们要在页面上显示那一行信息

                4. 点击那一行 我传递那一行id到后台  让他查询去根据id查询个人信息

                5. 把个人信息存储到域里面  转发到修改页面进行展示
                --%>
                <td><a href="FindById?newsId=${a.newsId}">修改</a></td>
            </tr>

        </c:forEach>
    </table>
</body>
</html>