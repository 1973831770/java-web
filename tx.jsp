<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>

</head>
<body>

<input type="text" onkeyup="up()">
<input type="text" onkeydown="down()">
<input type="text" onkeypress="press()">

<input type="text" onblur="brul()">
<input type="text" onfocus="focu1()">

<script>
    function down() {
        alert("按下")
    }
    function press() {
        alert("按下但是没有完全按下")
    }
    function up() {
        alert("抬起")
    }

    function brul() {
        alert("失去焦点")
    }
    function focu() {
        alert("获得焦点")
    }
</script>

</body>
</html>