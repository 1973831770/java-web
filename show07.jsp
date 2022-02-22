<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <link rel="stylesheet" href="css/css.css">
</head>
<body>

<textarea cols="40" rows="5" id="lsp" placeholder="最多可输入10个字符"  onkeyup="x()"> </textarea><span id="sss">0</span>/10

</body>

<script>

    function x() {

        var s=document.getElementById("lsp")
        var len=s.value.length;

        var s=document.getElementById("sss");
        s.innerHTML=len;



    }


</script>
</html>