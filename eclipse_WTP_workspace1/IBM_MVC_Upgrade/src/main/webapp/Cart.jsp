<%@ page contentType="text/html; charset=UTF-8" pageEncoding="Big5"%>
<%@ page import="java.util.* , shopping.BOOK" %>
<html>
<head>
 <title>Mode II �d�ҵ{��  - Cart.jsp</title>
 <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/ShoppingCart.css">
</head>
<body><br>
   <% @SuppressWarnings("unchecked")
   Vector<BOOK> buylist = (Vector<BOOK>) session.getAttribute("shoppingcart");%>
<%if (buylist != null && (buylist.size() > 0)) {%>

<img src="images/tomcat.gif"> <font size="+3">�ثe�ʪ��������e�p�U�G�]Cart.jsp�^</font>

<table id="table-1">
    <tr> 
      <th width="200">�ѦW</th><th width="100">�@��</th><th width="100">�X����</th><th width="100">����</th>
      <th width="120">�ƶq</th><th width="120"><img src="images/view-cart.png"></th>
    </tr></table><table>

	<%
	 for (int index = 0; index < buylist.size(); index++) {
		BOOK order = buylist.get(index);
	%>
	<tr>
		<td width="200"><%=order.getName()%>     </td>
		<td width="100"><%=order.getAuthor()%>   </td>
		<td width="100"><%=order.getPublisher()%></td>
		<td width="100"><%=order.getPrice()%>    </td>
		<td width="120"><%=order.getQuantity()%> </td>
		
        <td width="120">
          <form name="deleteForm" action="Shopping.html" method="POST">
              <input type="hidden" name="action"  value="DELETE">
              <input type="hidden" name="del" value="<%= index %>">
              <input type="submit" value="�R ��" class="button">
          </form></td>
	</tr>
	<%}%>
</table>
<p>
          <form name="checkoutForm" action="Shopping.html" method="POST">
              <input type="hidden" name="action"  value="CHECKOUT"> 
              <input type="submit" value="�I�ڵ��b" class="button">
          </form>
<%}%>
</body>
</html>