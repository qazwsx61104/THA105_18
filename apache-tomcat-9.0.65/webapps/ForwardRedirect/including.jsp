<%@ page contentType="text/html; charset=Big5" pageEncoding="Big5"%>

<html>
<head>
  <title>including.jsp</title>
</head>
<body bgcolor="lightblue">

     <% out.println("������, ���ݨ�");%>
     <% request.setAttribute("name1" , "peter1") ; %>    <%--������--%>
     <% out.println("������, ���ݨ�");%>

<jsp:include page="/select_page_Basic-mySQL.jsp" flush="true">
 <jsp:param name="name0" value="peter0" />
</jsp:include>

     <% out.println("������, ���ݨ�");%>
     <% request.setAttribute("name2" , "peter2") ; %>    <%--������ , ��included.jsp������ , why? include�w�g���� , �ҥH�Ӥ��� ������--%>
     <% out.println("������, ���ݨ�");%>
</body>
</html>