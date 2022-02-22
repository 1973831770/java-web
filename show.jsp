<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>

</head>
<body ondblclick="sx()" >

<textarea rows="5" cols="40" id="lsp" placeholder="最多可输入100个字" onkeyup="lsp2()"></textarea><span id="lsp3">0</span>/100<br>
<span id="ss" style="color: red"></span>

<script>

    function lsp2() {
       var lsp= document.getElementById("lsp");
       var len=lsp.value.length;

       var sp=document.getElementById("lsp3")
        sp.innerHTML=len;
       if(len>100){
           lsp.disabled=true;
           var ss=document.getElementById("ss")
           ss.innerHTML="[已经输入100个字符，禁止输入]"
       }

    }

    function sx() {

        location.reload()
    }



</script>




</body>
</html>