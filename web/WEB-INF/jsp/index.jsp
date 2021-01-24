<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2021/1/16
  Time: 13:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zxx">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>首页</title>


    <script language="javascript" type="text/javascript">
        function game()
        {
            window.location.href="${pageContext.request.contextPath}/Users/game";
        }
    </script>
</head>

<body>
    ${alert}
    <a href="${pageContext.request.contextPath}/Users/login">注销</a>


</body>
</html>
