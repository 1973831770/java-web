<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>

</head>
<body>
<input type="button" onclick="x()"  value="按钮">
</body>

<script>

    function x() {

        console.log("按钮上发生的事件类型"+event.type);
    }



</script>
</html>