<%@ page contentType="text/html; charset=UTF-8" pageEncoding="Big5"%>

<jsp:useBean id="customer" scope="session" class="com.customer.model.Customer" />


<html>
<head><title>Test_useBean2.jsp</title></head>
<body>

<h3>&lt;jsp:getProperty&gt; 取值</h3>
姓名：<jsp:getProperty name="customer" property="username"/><br>
地址：<jsp:getProperty name="customer" property="addr"/>
<br>
<br>
<br>
<h3>&lt;%=bean.getXxxx()%&gt; 取值</h3>
姓名：<%=customer.getUsername()%><br>
地址：<%=customer.getAddr()%>
</body>
</html>