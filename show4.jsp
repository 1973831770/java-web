<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <link rel="stylesheet" href="css/css.css">
</head>
<body ondblclick="x()">
<textarea cols="40" rows="5" id="lsp" placeholder="最多可输入10个字" onkeypress="lsp()"></textarea><span id="ssp">0</span>/10<br>
<span id="lso" style="color: red"></span>
</body>
<script>

    function lsp() {

        var s= document.getElementById("lsp")
        var val = s.value;
        var len=val.length;

        var sp=document.getElementById("ssp");
        sp.innerHTML=len;

        if(len>10){

            s.disabled=true;

            var s =  document.getElementById("lso")

            s.innerHTML="[已经输入10个字符，禁止输入]";

        }



    }

    function x() {
        location.reload()
    }

</script>
</html>