<%@ page contentType="text/html; charset=UTF-8" pageEncoding="Big5"%>
<%@ page import="java.util.* , shopping.BOOK" %>
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <title>Mode II �d�ҵ{��  - Cart.jsp</title>
</head>
<body bgcolor="#FFFFFF">

<%Vector<BOOK> buylist = (Vector<BOOK>) session.getAttribute("shoppingcart");%>
<%if (buylist != null && (buylist.size() > 0)) {%>

<img src="images/tomcat.gif"> <font size="+3">�ثe�z�ʪ��������e�p�U�G</font><p>

<table border="1" width="740">
	<tr bgcolor="#999999">
		<th width="200">�ѦW</th><th width="100">�@��</th><th width="100">�X����</th><th width="100">����</th>
		<th width="120">�ƶq</th><th width="120"></th>
	</tr>
	
	<%
	 for (int index = 0; index < buylist.size(); index++) {
		BOOK order = buylist.get(index);
	%>
	<tr>
		<td width="200"><div align="center"><b><%=order.getName()%></b></div></td>
		<td width="100"><div align="center"><b><%=order.getAuthor()%></b></div></td>
		<td width="100"><div align="center"><b><%=order.getPublisher()%></b></div></td>
		<td width="100"><div align="center"><b><%=order.getPrice()%></b></div></td>
		<td width="100"><div align="center"><b><%=order.getQuantity()%></b></div></td>
		
		<td width="100"><div align="center">
          <form name="deleteForm" action="Shopping.html" method="POST">
              <input type="hidden" name="action" value="DELETE">
              <input type="hidden" name="del" value="<%= index %>">
              <input type="submit" value="�R��"></div>
        </td></form>
	</tr>
	<%}%>
</table>
<p>
          <form name="checkoutForm" action="Shopping.html" method="POST">
              <input type="hidden" name="action"	value="CHECKOUT"> 
              <input type="submit" value="�I�ڵ��b">
          </form>
<%}%>
</body>
</html>