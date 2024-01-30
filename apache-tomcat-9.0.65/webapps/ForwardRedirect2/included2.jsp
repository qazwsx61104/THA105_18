<%@ page contentType="text/html; charset=Big5" pageEncoding="Big5"%>

<html>
<head>
  <title>included2.jsp</title>
</head>
<body bgcolor="orange">
<hr color=blue>
§Ú¬O included2.jsp
<br>
Hello!
<br>
       <% out.println("nameXX= "+request.getParameter("nameXX"));%>
<br>
       <% out.println("name0= "+request.getParameter("name0"));%>
<br>
       <% out.println("name1= "+request.getAttribute("name1"));%>
<br>
       <% out.println("name2= "+request.getAttribute("name2"));%>
<hr color=blue>
</body>
</html>