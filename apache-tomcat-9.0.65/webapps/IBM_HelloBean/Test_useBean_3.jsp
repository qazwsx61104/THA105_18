<%@ page contentType="text/html; charset=UTF-8" pageEncoding="Big5"%>

<jsp:useBean id="customer" scope="session" class="com.customer.model.Customer" />


<html>
<head><title>Test_useBean3.jsp</title></head>
<body>

<h3>&lt;jsp:getProperty&gt; ����</h3>
�m�W�G<jsp:getProperty name="customer" property="username"/><br>
�a�}�G<jsp:getProperty name="customer" property="addr"/>
<br>
<br>
<br>

<h3>&lt;%=bean.getXxxx()%&gt; ����</h3>
�m�W�G<%=customer.getUsername()%><br>
�a�}�G<%=customer.getAddr()%>
<br>
<br>
<br>
<h3>\${customer.username}����</h3>

�m�W�G${customer.username}<br>
�a�}�G${customer.addr}
</body>
</html>