<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@include file="/common/common.jspf"%>

<html>
	<head>
	</head>
	
	<body>
		<form action="supplier/insert.action" method="post">
			供应商名称：<input type="text"	name="supName"><br>
			供应商类型:<select id="cc" class="easyui-combobox" name="supType" style="width:200px;">   
					    <c:forEach items="${applicationScope.sysParam.supType }" var="stype">
					    	<option value='${stype.key }'>${stype.value }</option>
					    </c:forEach>
					</select>  
			 
			<input type="submit" value="ok">
		</form>
	</body>
</html>
