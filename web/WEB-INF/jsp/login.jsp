<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: l
  Date: 2021/1/16
  Time: 15:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zxx">
<head>

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Login</title>
    <script src="${pageContext.request.contextPath}/static/js/jquery-1.11.3.min.js"></script>

    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/core.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/menu.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/amazeui.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/component.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/page/form.css" />


</head>

<body style="background-image:url(${pageContext.request.contextPath}/static/images/background.jpg)">

<div class="account-pages">
    <div class="wrapper-page">
        <div class="text-center">
            <a href="${pageContext.request.contextPath}/Users/index" class="logo"><span>Admin<span>to</span></span></a>
        </div>
        <div class="m-t-40 card-box">
            <div class="text-center">
                <h4 class="text-uppercase font-bold m-b-0">登录</h4>
            </div>
            <div class="panel-body">
                <form class="am-form" action="${pageContext.request.contextPath}/Users/loginIn" method="post">
                    <div class="am-g">
                        <div class="am-form-group">
                            <input type="text" class="am-radius"  placeholder="账号" name="username">
                        </div>

                        <div class="am-form-group form-horizontal m-t-20">
                            <input type="password" class="am-radius"  placeholder="密码" name="password">
                        </div>

                        <div class="am-form-group ">
                            <label style="font-weight: normal;color: #999;">
                                <input type="checkbox" class="remeber"> 记住密码
                            </label>
                        </div>

                        <div class="am-form-group ">
                            <input type="submit" class="am-btn am-btn-primary am-radius"  value="登录" style="width: 100%;height: 100%;"/>
                        </div>

                        <div class="am-form-group ">
                            <a href="${pageContext.request.contextPath}/Users/register" type="button" class="am-btn am-btn-primary am-radius" style="width: 100%;height: 100%;">注册</a>
                        </div>

                        <div class="am-form-group ">
                            <a href="page-recoverpw.html" class="text-muted"><i class="fa fa-lock m-r-5"></i> 忘记密码?</a>
                        </div>
                    </div>

                </form>

            </div>
        </div>
    </div>
</div>




       ${alert}
       <a href="${pageContext.request.contextPath}/Users/index">回首页</a>
</body>
</html>
