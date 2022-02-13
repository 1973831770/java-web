<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <link rel="stylesheet" href="css/css.css">
</head>
<body>

  <form action="UpdateNews">
      新闻编号：<input   type="text"   name="newsId"  value="${n.newsId}"><br>
      新闻标题：<input   type="text"  name="newsTitle" value="${n.newsTitle}"><br>
      新闻作者：<input   type="text"  name="newsAuthor" value="${n.newsAuthor}"><br>
          <input  type="submit" value="修改新闻信息">
  </form>
</body>
</html>