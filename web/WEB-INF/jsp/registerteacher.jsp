<%--
  Created by IntelliJ IDEA.
  User: l
  Date: 2021/1/16
  Time: 16:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html lang="zxx">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">


    <title>注册</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/core.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/menu.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/amazeui.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/component.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/page/form.css" />
    <!-- Mobile Specific Meta-->
    <meta name="viewport" content="width=device-width, initial-scale=1">

</head>

<body style="background-image:url(${pageContext.request.contextPath}/static/images/background.jpg)">

<div class="account-pages">
    <div class="wrapper-page">
        <div class="text-center">
            <a href="${pageContext.request.contextPath}/Users/register" class="logo"><span>学生注册<span>前往</span></span></a>
        </div>
        <div class="m-t-40 card-box">
            <div class="text-center">
                <h4 class="text-uppercase font-bold m-b-0">注册</h4>
            </div>
            <div class="panel-body">
                <form class="am-form" action="${pageContext.request.contextPath}/Users/registerIn" method="post">
                    <div class="am-g">
                        <div class="am-form-group">
                            用户名:<input type="text" class="am-radius"  placeholder="账号" name="username"/>
                        </div>

                        <div class="am-form-group form-horizontal m-t-20">
                            密码:<input type="password" class="am-radius"  placeholder="密码" name="password"/>
                        </div>

                        <div class="am-form-group form-horizontal m-t-20">
                            教工号:<input type="text" class="am-radius"  placeholder="教工号" name="classes"/>
                        </div>

                        <div class="am-form-group form-horizontal m-t-20">
                            姓名:<input type="text" class="am-radius"  placeholder="姓名" name="age"/>
                        </div>

                        <div class="am-form-group ">
                            <input type="submit" class="am-btn am-btn-primary am-radius"  value="注册" style="width: 100%;height: 100%;"/>
                        </div>

                        <div class="am-form-group ">
                            <a href="${pageContext.request.contextPath}/Users/login" type="button" class="am-btn am-btn-primary am-radius" style="width: 100%;height: 100%;">登录</a>
                        </div>

                    </div>

                </form>

            </div>
        </div>
    </div>
</div>

    ${alert}
</body>
</html>
