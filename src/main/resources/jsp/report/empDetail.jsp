<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html >
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
    <%--<form action="emp_report.action" method="post">
        <input type="text" name="empId" value="${empId}"/>
        <input type="submit" value="确定"/>
    </form>--%>
	<script type="text/javascript">
		var empDetailPanel = new EmpDetailPanel();
		var w = Ext.getCmp('mainTab').getActiveTab().getInnerWidth();
		var h = Ext.getCmp('mainTab').getActiveTab().getInnerHeight();
		var activeTab = Ext.getCmp('empDetailPanelId');
		if(activeTab){
			activeTab.setHeight(h);
			activeTab.setWidth(w);
		}
		activeTab.render('empDetail');
	</script>
	<div id="empDetail"></div>
</body>
</html>
 