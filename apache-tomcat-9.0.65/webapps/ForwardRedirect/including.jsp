<%@ page contentType="text/html; charset=Big5" pageEncoding="Big5"%>

<html>
<head>
  <title>including.jsp</title>
</head>
<body bgcolor="lightblue">

     <% out.println("有執行, 有看到");%>
     <% request.setAttribute("name1" , "peter1") ; %>    <%--有執行--%>
     <% out.println("有執行, 有看到");%>

<jsp:include page="/select_page_Basic-mySQL.jsp" flush="true">
 <jsp:param name="name0" value="peter0" />
</jsp:include>

     <% out.println("有執行, 有看到");%>
     <% request.setAttribute("name2" , "peter2") ; %>    <%--有執行 , 但included.jsp未取到 , why? include已經執行 , 所以來不及 拿不到--%>
     <% out.println("有執行, 有看到");%>
</body>
</html>