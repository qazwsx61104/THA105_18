<%@ page contentType="text/html; charset=UTF-8" pageEncoding="Big5"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<title>IBM Emp: Home</title>

<style>
  table#table-1 {
	width: 450px;
	background-color: #CCCCFF;
	margin-top: 5px;
	margin-bottom: 10px;
    border: 3px ridge Gray;
    height: 80px;
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

</head>
<body bgcolor='white'>

<table id="table-1">
   <tr><td><h3>IBM Emp: Home</h3><h4>( MVC )</h4></td></tr>
</table>

<p>This is the Home page for IBM Emp: Home</p>

<h3>��Ƭd��:</h3>
	
<%-- ���~��C --%>
<c:if test="${not empty errorMsgs}">
	<font style="color:red">�Эץ��H�U���~:</font>
	<ul>
		<c:forEach var="message" items="${errorMsgs}">
			<li style="color:red">${message}</li>
		</c:forEach>
	</ul>
</c:if>

<ul>
  <li><a href='listAllEmp1_byDAO.jsp'>List</a> all Emps    <h4>(byDAO).         </h4></li>
  <li><a href='emp.do?action=getAll'> List</a> all Emps    <h4>(getFromSession).</h4> <br><br><br></li>
  
  <li>
    <FORM METHOD="post" ACTION="emp.do" >
        <b>��J���u�s�� (�p7001):</b>
        <input type="text" name="empno">
        <input type="hidden" name="action" value="getOne_For_Display">
        <input type="submit" value="�e�X">                   <h4>(��Ʈ榡����  by Controller ).</h4> 
    </FORM>
  </li>
  
  <li>
    <FORM METHOD="post" ACTION="emp.do" name="form1">
        <b>��J���u�s�� (�p7001):</b>
        <input type="text" name="empno">
        <input type="hidden" name="action" value="getOne_For_Display">
        <input type="button" value="�e�X" onclick="fun1()">  <h4>(��Ʈ榡����  by Java Script).</h4> 
    </FORM>
  </li>

  <jsp:useBean id="dao" scope="page" class="com.emp.model.EmpDAO" />
<%--   <% com.emp.model.EmpDAO dao = new com.emp.model.EmpDAO(); %> <% pageContext.setAttribute("dao", dao); %> --%>
   
  <li>
     <FORM METHOD="post" ACTION="emp.do" >
       <b>��ܭ��u�s��:</b>
       <select size="1" name="empno">
         <c:forEach var="empVO" items="${dao.all}" > 
          <option value="${empVO.empno}">${empVO.empno}
         </c:forEach>   
       </select>
       <input type="hidden" name="action" value="getOne_For_Display">
       <input type="submit" value="�e�X">
    </FORM>
  </li>
  
  <li>
     <FORM METHOD="post" ACTION="emp.do" >
       <b>��ܭ��u�m�W:</b>
       <select size="1" name="empno">
         <c:forEach var="empVO" items="${dao.all}" > 
          <option value="${empVO.empno}">${empVO.ename}
         </c:forEach>   
       </select>
       <input type="hidden" name="action" value="getOne_For_Display">
       <input type="submit" value="�e�X">
     </FORM>
  </li>
</ul>

<script>    
   function fun1(){
      with(document.form1){
         if (empno.value=="") 
             alert("�п�J���u�s��!");
         else if (isNaN(empno.value)) 
             alert("���u�s���榡�����T!");
         else if ((empno.value < 7001) || (empno.value > 7999)) 
             alert("�ж�g����7001�M7999�������ƶq!");
         else
             submit();
      }
   }
</script>

</body>
</html>