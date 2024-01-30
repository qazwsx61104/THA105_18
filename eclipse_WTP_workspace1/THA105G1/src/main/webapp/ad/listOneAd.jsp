<%@ page contentType="text/html; charset=UTF-8" pageEncoding="Big5"%>
<%@ page import="com.ad.model.*"%>
<%-- 此頁暫練習採用 Script 的寫法取值 --%>

<%
// AdServlet 75~77行 setAttribute("adVO",adVO)後再forward到listOneEmp.jsp頁面取值
  AdVO adVO = (AdVO) request.getAttribute("adVO"); //adServlet.java(Concroller), 存入req的adVO物件
%>

<html>
<head>
<title>員工資料 - listOneAd.jsp</title>

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

<h4>此頁暫練習採用 Script 的寫法取值:</h4>
<table id="table-1">
	<tr><td>
		 <h3>員工資料 - listOneEmp.jsp</h3>
		 <h4><a href="select_page.jsp"><img src="images/back1.gif" width="100" height="32" border="0">回首頁</a></h4>
	</td></tr>
</table>

<table>
	<tr>
		<th>廣告編號</th>
		<th>賣家ID</th>
		<th>廣告名稱</th>
		<th>廣告網址</th>
		<th>廣告開始時間</th>
		<th>廣告結束時間</th>
		<th>廣告等級</th>
		
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