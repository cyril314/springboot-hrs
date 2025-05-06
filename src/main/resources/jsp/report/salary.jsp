<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
	<!-- <a href="emp_report.action?empId=0007" target="_blank">report</a>
	<form action="emp_report.action" method="post">
        <input type="text" name="empId" value="${empId}"/>
        <input type="submit" value="确定"/>
    </form>-->
	<script type="text/javascript">
		var salaryPanel = new SalaryPanel();
		var w = Ext.getCmp('mainTab').getActiveTab().getInnerWidth();
		var h = Ext.getCmp('mainTab').getActiveTab().getInnerHeight();
		var activeTab = Ext.getCmp('salaryPanelId');
		if(activeTab){
			activeTab.setHeight(h);
			activeTab.setWidth(w);
		}
		activeTab.render('salaryDiv');
	</script>
	<div id="salaryDiv"></div>
</body>
</html>
 