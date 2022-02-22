<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <link rel="stylesheet" href="css/css.css">
</head>
<body>
<textarea rows="5" cols="40" id="lsp" placeholder="最多可输入十个字符" onkeyup="x()"></textarea><span id="lspp">0</span>/10<br>
<span id="ww"></span>
</body>

<script>
    function x() {


        var s= document.getElementById("lsp");
        var len=s.value.length;

        var lspp=document.getElementById("lspp");
        lspp.innerHTML=len;
        if(len>10){
            s.disabled=true;
            var sw=document.getElementById("ww");
            sw.innerHTML='[禁止输入]'
        }



    }




</script>
</html>