<%@ page contentType="text/html; charset=UTF-8" pageEncoding="Big5"%>
<%@ page import="com.ad.model.*"%>
<%-- �����Ƚm�߱ĥ� Script ���g�k���� --%>

<%
// AdServlet 75~77�� setAttribute("adVO",adVO)��Aforward��listOneEmp.jsp��������
  AdVO adVO = (AdVO) request.getAttribute("adVO"); //adServlet.java(Concroller), �s�Jreq��adVO����
%>

<html>
<head>
<title>���u��� - listOneAd.jsp</title>

<style>
  table#table-1 {
	background-color: #CCCCFF;
    border: 2px solid black;
    text-align: center;
  }
  table#table-1 h4 {
    color: red;
    display: block;
    margin-bottom: 1px;
  }
  h4 {
    color: blue;
    display: inline;
  }
</style>

<style>
  table {
	width: 600px;
	background-color: white;
	margin-top: 5px;
	margin-bottom: 5px;
  }
  table, th, td {
    border: 1px solid #CCCCFF;
  }
  th, td {
    padding: 5px;
    text-align: center;
  }
</style>

</head>
<body bgcolor='white'>

<h4>�����Ƚm�߱ĥ� Script ���g�k����:</h4>
<table id="table-1">
	<tr><td>
		 <h3>���u��� - listOneEmp.jsp</h3>
		 <h4><a href="select_page.jsp"><img src="images/back1.gif" width="100" height="32" border="0">�^����</a></h4>
	</td></tr>
</table>

<table>
	<tr>
		<th>�s�i�s��</th>
		<th>��aID</th>
		<th>�s�i�W��</th>
		<th>�s�i���}</th>
		<th>�s�i�}�l�ɶ�</th>
		<th>�s�i�����ɶ�</th>
		<th>�s�i����</th>
		
	</tr>
	<tr>
		<td><%=adVO.getAdId()%></td>
		<td><%=adVO.getSellerId()%></td>
		<td><%=adVO.getAdName()%></td>
		<td><%=adVO.getAdUrl()%></td>
		<td><%=adVO.getAdStartTime()%></td>
		<td><%=adVO. getAdEndTime()%></td>
		<td><%=adVO.getAdLv()%></td>
	</tr>
</table>

</body>
</html>