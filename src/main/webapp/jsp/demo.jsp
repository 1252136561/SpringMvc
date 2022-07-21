<%--
  Created by IntelliJ IDEA.
  User: ASUS

  Date: 2022/7/21
  Time: 17:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>

<body>
<form action="${pageContext.request.contextPath}/0/004" method=="post">
<%--    表明是第几个user对象的username--%>
    集合第一元素Name：<input type="text" name="list[0].name"><br/>
<%--    集合中第一个元素封装name--%>
    集合第一元素age： <input type="text" name="list[0].age"><br/>
    集合第二元素Name：<input type="text" name="list[1].name"><br/>
    集合第二元素age：<input type="text" name="list[1].age"><br/>
    <button type="submit">Ok</button>
</form>



</body>
</html>
