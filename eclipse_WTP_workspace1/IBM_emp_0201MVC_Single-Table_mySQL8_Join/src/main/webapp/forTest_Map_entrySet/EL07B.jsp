<%@ page contentType="text/html; charset=Big5" pageEncoding="Big5"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.util.*"%>
<%
	Map<String, String> map = new LinkedHashMap<String, String>();
	map.put("1", "peter1@foo.com");
	map.put("2", "peter2@qoo.com");
	pageContext.setAttribute("map", map);
%>
<html>
<head><title>EL07B</title></head>
<body>
	
	<c:forEach var="message" items="${map}">
		<li>${message.key}:${message.value}</li>
	</c:forEach>
	
	<br>----------------------------------------
	
	<c:forEach var="message" items="${map.entrySet()}">
		<li>${message.key}:${message.value}</li>
	</c:forEach>
	
<!-- �ɥR����: -->
<!-- java.util.Map ��  entrySet()��k�A�Ǧ^ Set<Map.Entry<K,V>> -->
<!-- Set<Map.Entry<K,V>> entrySet() -->

</body>
</html>
