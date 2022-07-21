<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2022/7/21
  Time: 17:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/js/jquery-3.3.1.js"></script>
</head>

<body>
<script>
    var userList = new Array();
    userList.push({name:"黄渤文",age:18})
    userList.push({name:"黄小文",age:17})

    $.ajax({type:"POST",
        url:"${pageContext.request.contextPath}/0/ajax",

        data:JSON.stringify(userList),
        contentType:"application/json;charset=utf-8"}

    );
</script>
</body>
</html>
