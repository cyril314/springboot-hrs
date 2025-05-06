<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="${ctx}">
    <link rel="stylesheet" type="text/css" href="/static/css/common.css"/>
</head>
<body style="background-color: #dfe8f6;">
<div id="first_content" style="width: 100%; height: 100%; ">
    <table class="fristTable">
        <tr>
            <td style="width: 50%" rowspan="2">
                <div class="title"><img src="/static/img/user.png"/>用户信息</div>
                <div class="userContent">
                    欢迎用户: <b>${user.userName}</b><br/><br/>
                    角色：${role.roleName}<br/><br/>
                    工号：${employee.id}<br/><br/>
                    姓名：${employee.empName}<br/><br/>
                    上次登录IP：${user.userLastIp}<br/><br/>
                    上次登录时间: ${user.userLastTime}
                </div>
            </td>
            <td style="width: 50%;">
                <div class="title"><img src="/static/img/instruction.gif"/>系统介绍</div>
                <div class="content">
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;本系统实现了企业人力资源管理的信息化，对企业人员的各种相关信息进行整合、提取，
                    有效的减小了人员信息的查询力度，提高员工的工作效率，同时也能提高企业的管理水平，
                    提供员工公平的竞升机会。系统主要分为部门管理、职员管理、培训管理、奖惩管理、
                    薪资管理、报表管理、系统管理七大管理模块，从各个方面记录、整合企业人员的信息。
                </div>
            </td>
        </tr>
        <tr>
            <td>
                <div class="title"><img src="/static/img/developer.png"/>开发者</div>
                <div class="content">
                    Fit<br/><br/>
                </div>
            </td>
        </tr>
    </table>
</div>
</body>
</html>