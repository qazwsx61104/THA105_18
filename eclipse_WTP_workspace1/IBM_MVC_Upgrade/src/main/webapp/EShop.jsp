<%@ page contentType="text/html; charset=UTF-8" pageEncoding="Big5"%>
<html>
<head>
 
 <title>Mode II �d�ҵ{�� - Eshop.jsp</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/ShoppingCart.css">
</head>
<body>
<img src="images/tomcat.gif"> <font size="+3">�����ѩ��G�]EShop.jsp�^</font>
<hr>
<table id="table-1">
  <tr> 
    <th width="200">�ѦW</th><th width="100">�@��</th><th width="100">�X����</th><th width="100">����</th>
    <th width="120">�ƶq</th><th width="120"><img src="images/shopping-cart.png" width="45px" height="35px"></th>
  </tr></table>
 
 <!--  
       �Ĥ@��action�g�k: <form name="shoppingForm" action="Shopping.html" method="POST">
       �ĤG��action�g�k: <form name="shoppingForm" action="/IBM_MVC/Shopping.html" method="POST">
       �ĤT��action�g�k: <form name="shoppingForm" action="<%=request.getContextPath()%>/Shopping.html" method="POST">
 -->
 <!-- 
       ��Y�����i�ন���Qforward��������, �����������Ҧ�html�s�� , �p�G�ĥά۹���|�g�k��, �]���|�Q�[�W���forward�̪����|
       �b�������MVC�[�c��, �W���ĤT�ؼg�k, ���Hrequest.getContextPath()��k, �����o����(Servlet Context)�ؿ����|���g�k,
       �N�O�̨θѨM���
 -->

  <form name="shoppingForm" action="Shopping.html" method="POST">
    <table><tr> 
      <td width="200"><div align="center">���@�˪��i�ͪk</div></td>
      <td width="100"><div align="center">�d�ç�</div></td>
      <td width="100"><div align="center">��p</div></td>
      <td width="100"><div align="center">600</div></td>
      <td width="120"><div align="center">�ƶq�G<input type="text" name="quantity" size="3" value=1></div></td>
      <td width="120"><div align="center">     <input type="submit" class="button" value="��J�ʪ���"> </div></td>
    </tr></table>
      <input type="hidden" name="name" value="���@�˪��i�ͪk">
      <input type="hidden" name="author" value="�d�ç�">
      <input type="hidden" name="publisher" value="��p">
      <input type="hidden" name="price" value="600">
      <input type="hidden" name="action" value="ADD">
  </form>
  
  <form name="shoppingForm" action="Shopping.html" method="POST">
    <table><tr> 
      <td width="200"><div align="center">���Q�i�S-�������]�k��</div></td>
      <td width="100"><div align="center">J.K ù�Y</div></td>
      <td width="100"><div align="center">�ӫa</div></td>
      <td width="100"><div align="center">200</div></td>
      <td width="120"><div align="center">�ƶq�G<input type="text" name="quantity" size="3" value=1></div></td>
      <td width="120"><div align="center">     <input type="submit" class="button" value="��J�ʪ���"> </div></td>
    </tr></table>
      <input type="hidden" name="name" value="���Q�i�S-�������]�k��">
      <input type="hidden" name="author" value="J.K ù�Y">
      <input type="hidden" name="publisher" value="�ӫa">
      <input type="hidden" name="price" value="200">
      <input type="hidden" name="action" value="ADD">
  </form>
  
  <form name="shoppingForm" action="Shopping.html" method="POST">
    <table><tr> 
      <td width="200"><div align="center">�»��k�Юv</div></td>
      <td width="100"><div align="center">���T�T</div></td>
      <td width="100"><div align="center">���w</div></td>
      <td width="100"><div align="center">190</div></td>
      <td width="120"><div align="center">�ƶq�G<input type="text" name="quantity" size="3" value=1></div></td>
      <td width="120"><div align="center">     <input type="submit" class="button" value="��J�ʪ���"> </div></td>
    </tr></table>
      <input type="hidden" name="name" value="�»��k�Юv">
      <input type="hidden" name="author" value="���T�T">
      <input type="hidden" name="publisher" value="���w">
      <input type="hidden" name="price" value="190">
      <input type="hidden" name="action" value="ADD">
  </form>
  
  <form name="shoppingForm" action="Shopping.html" method="POST">
    <table><tr> 
      <td width="200"><div align="center">��ܻ���ߺ�</div></td>
      <td width="100"><div align="center">�B�V</div></td>
      <td width="100"><div align="center">�����N</div></td>
      <td width="100"><div align="center">180</div></td>
      <td width="120"><div align="center">�ƶq�G<input type="text" name="quantity" size="3" value=1></div></td>
      <td width="120"><div align="center">     <input type="submit" class="button" value="��J�ʪ���"> </div></td>
    </tr></table>
      <input type="hidden" name="name" value="��ܻ���ߺ�">
      <input type="hidden" name="author" value="�B�V">
      <input type="hidden" name="publisher" value="�����N">
      <input type="hidden" name="price" value="180">
      <input type="hidden" name="action" value="ADD">
  </form>
  
  <form name="shoppingForm" action="Shopping.html" method="POST">
    <table ><tr> 
      <td width="200"><div align="center">�@�ӤH�t�g</div></td>
      <td width="100"><div align="center">���氷</div></td>
      <td width="100"><div align="center">�p�g</div></td>
      <td width="100"><div align="center">300</div></td>
      <td width="120"><div align="center">�ƶq�G<input type="text" name="quantity" size="3" value=1></div></td>
      <td width="120"><div align="center">     <input type="submit" class="button" value="��J�ʪ���"> </div></td>
    </tr></table>
      <input type="hidden" name="name" value="�@�ӤH�t�g">
      <input type="hidden" name="author" value="���氷">
      <input type="hidden" name="publisher" value="�p�g">
      <input type="hidden" name="price" value="300">
      <input type="hidden" name="action" value="ADD">
  </form>


<p> 
  <jsp:include page="/Cart.jsp" flush="true" />
</body>
</html>