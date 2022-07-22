<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2022/7/22
  Time: 14:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/0/0/ups" method="post" enctype="multipart/form-data">
    名称<input type="text" name="name"><br/>
    文件<input type="file" name="uploadfile"><br/>
    文件<input type="file" name="uploadfile"><br/>
    <input type="submit"  value="ok"><br/>
</form>
</body>
</html>
