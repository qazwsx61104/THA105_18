<%@ page contentType="text/html; charset=UTF-8" pageEncoding="Big5"%>




<html>
<head><title>Test_useBean4.jsp</title></head>
<body>

<h3>&lt;jsp:getProperty&gt; 取值</h3>
姓名：<br>
地址：
<br>
<br>
<br>
<h3>&lt;%=bean.getXxxx()%&gt; 取值</h3>
姓名：<br>
地址：
<br>
<br>
<br>
<h3>\${customer.username}取值</h3
姓名：${customer.username}--${customer.getUsername() }<br>
地址：${customer.addr}--${customer.getAddr()}
</body>
</html>