<%@ page contentType="text/html; charset=UTF-8" pageEncoding="Big5"%>




<html>
<head><title>Test_useBean4.jsp</title></head>
<body>

<h3>&lt;jsp:getProperty&gt; ����</h3>
�m�W�G<br>
�a�}�G
<br>
<br>
<br>
<h3>&lt;%=bean.getXxxx()%&gt; ����</h3>
�m�W�G<br>
�a�}�G
<br>
<br>
<br>
<h3>\${customer.username}����</h3
�m�W�G${customer.username}--${customer.getUsername() }<br>
�a�}�G${customer.addr}--${customer.getAddr()}
</body>
</html>