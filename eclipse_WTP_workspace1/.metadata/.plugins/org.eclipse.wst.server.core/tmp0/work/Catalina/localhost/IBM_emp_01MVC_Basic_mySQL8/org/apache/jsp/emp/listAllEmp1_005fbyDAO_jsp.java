/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.65
 * Generated at: 2024-01-19 07:53:54 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.emp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.emp.model.*;

public final class listAllEmp1_005fbyDAO_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("jar:file:/C:/THA105_WebApp/eclipse_WTP_workspace1/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/IBM_emp_01MVC_Basic_mySQL8/WEB-INF/lib/standard.jar!/META-INF/c.tld", Long.valueOf(1054243570000L));
    _jspx_dependants.put("/WEB-INF/lib/standard.jar", Long.valueOf(1704358531007L));
    _jspx_dependants.put("/emp/page1.file", Long.valueOf(1704358531090L));
    _jspx_dependants.put("/emp/page2.file", Long.valueOf(1704358530983L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("com.emp.model");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems_005fend_005fbegin;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems_005fend_005fbegin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems_005fend_005fbegin.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	EmpDAO dao = new EmpDAO();
    List<EmpVO> list = dao.getAll();       // 此行的list變數(物件)將提供page1.file的第11行取得查詢到的總筆數，再由page1.file進行分頁的需要
    pageContext.setAttribute("list",list); // 將上一行的list變數(物件)存入當前頁面pageContext，再由底下的第73行由JSTL的forEach列印出結果

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>所有員工資料 - listAllEmp1_byDAO.jsp</title>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("  table#table-1 {\r\n");
      out.write("	background-color: #CCCCFF;\r\n");
      out.write("    border: 2px solid black;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("  }\r\n");
      out.write("  table#table-1 h4 {\r\n");
      out.write("    color: red;\r\n");
      out.write("    display: block;\r\n");
      out.write("    margin-bottom: 1px;\r\n");
      out.write("  }\r\n");
      out.write("  h4 {\r\n");
      out.write("    color: blue;\r\n");
      out.write("    display: inline;\r\n");
      out.write("  }\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("  table {\r\n");
      out.write("	width: 800px;\r\n");
      out.write("	background-color: white;\r\n");
      out.write("	margin-top: 5px;\r\n");
      out.write("	margin-bottom: 5px;\r\n");
      out.write("  }\r\n");
      out.write("  table, th, td {\r\n");
      out.write("    border: 1px solid #CCCCFF;\r\n");
      out.write("  }\r\n");
      out.write("  th, td {\r\n");
      out.write("    padding: 5px;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("  }\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body bgcolor='white'>\r\n");
      out.write("\r\n");
      out.write("<h4>此頁練習採用 EL 的寫法取值:</h4>\r\n");
      out.write("<table id=\"table-1\">\r\n");
      out.write("	<tr><td>\r\n");
      out.write("		 <h3>所有員工資料 - listAllEmp1_byDAO.jsp</h3>\r\n");
      out.write("		 <h4><a href=\"select_page.jsp\"><img src=\"images/back1.gif\" width=\"100\" height=\"32\" border=\"0\">回首頁</a></h4>\r\n");
      out.write("	</td></tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("<table>\r\n");
      out.write("	<tr>\r\n");
      out.write("		<th>員工編號</th>\r\n");
      out.write("		<th>員工姓名</th>\r\n");
      out.write("		<th>職位</th>\r\n");
      out.write("		<th>雇用日期</th>\r\n");
      out.write("		<th>薪水</th>\r\n");
      out.write("		<th>獎金</th>\r\n");
      out.write("		<th>部門</th>\r\n");
      out.write("	</tr>\r\n");
      out.write("	");
      out.write('\r');
      out.write('\n');
  int rowsPerPage = 3;  //每頁的筆數    
    int rowNumber=0;      //總筆數
    int pageNumber=0;     //總頁數      
    int whichPage=1;      //第幾頁
    int pageIndexArray[]=null;
    int pageIndex=0; 

      out.write("\r\n");
      out.write("\r\n");
  
    rowNumber=list.size();
    if (rowNumber%rowsPerPage !=0)
         pageNumber=rowNumber/rowsPerPage + 1;
    else pageNumber=rowNumber/rowsPerPage;    

    pageIndexArray=new int[pageNumber]; 
    for (int i=1 ; i<=pageIndexArray.length ; i++)
         pageIndexArray[i-1]=i*rowsPerPage-rowsPerPage;

      out.write("\r\n");
      out.write("\r\n");
  try {
       whichPage = Integer.parseInt(request.getParameter("whichPage"));
       pageIndex=pageIndexArray[whichPage-1];
    } catch (NumberFormatException e) { //第一次執行的時候
       whichPage=1;
       pageIndex=0;
    } catch (ArrayIndexOutOfBoundsException e) { //總頁數之外的錯誤頁數
         if (pageNumber>0){
              whichPage=pageNumber;
              pageIndex=pageIndexArray[pageNumber-1];
         }
    } 

      out.write("\r\n");
      out.write("\r\n");
if (pageNumber>0){
      out.write("\r\n");
      out.write("  <b><font color=red>第");
      out.print(whichPage);
      out.write('/');
      out.print(pageNumber);
      out.write("頁</font></b>\r\n");
}
      out.write("\r\n");
      out.write("\r\n");
      out.write("<b>●符 合 查 詢 條 件 如 下 所 示: 共<font color=red>");
      out.print(rowNumber);
      out.write("</font>筆</b>");
      out.write(" \r\n");
      out.write("	");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems_005fend_005fbegin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      boolean _jspx_th_c_005fforEach_005f0_reused = false;
      try {
        _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
        _jspx_th_c_005fforEach_005f0.setParent(null);
        // /emp/listAllEmp1_byDAO.jsp(73,1) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_c_005fforEach_005f0.setVar("empVO");
        // /emp/listAllEmp1_byDAO.jsp(73,1) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
        // /emp/listAllEmp1_byDAO.jsp(73,1) name = begin type = int reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_c_005fforEach_005f0.setBegin(pageIndex);
        // /emp/listAllEmp1_byDAO.jsp(73,1) name = end type = int reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_c_005fforEach_005f0.setEnd(pageIndex+rowsPerPage-1);
        int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
        try {
          int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
          if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("		<tr>\r\n");
              out.write("			<td>");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empVO.empno}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("</td>\r\n");
              out.write("			<td>");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empVO.ename}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("</td>\r\n");
              out.write("			<td>");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empVO.job}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("</td>\r\n");
              out.write("			<td>");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empVO.hiredate}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("</td>\r\n");
              out.write("			<td>");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empVO.sal}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("</td>\r\n");
              out.write("			<td>");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empVO.comm}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("</td>\r\n");
              out.write("			<td>");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empVO.deptno}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("</td>\r\n");
              out.write("		</tr>\r\n");
              out.write("	");
              int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            return;
          }
        } catch (java.lang.Throwable _jspx_exception) {
          while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
            out = _jspx_page_context.popBody();
          _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
        } finally {
          _jspx_th_c_005fforEach_005f0.doFinally();
        }
        _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems_005fend_005fbegin.reuse(_jspx_th_c_005fforEach_005f0);
        _jspx_th_c_005fforEach_005f0_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
      }
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  ");
if (rowsPerPage<rowNumber) {
      out.write("\r\n");
      out.write("    ");
if(pageIndex>=rowsPerPage){
      out.write("\r\n");
      out.write("        <A href=\"");
      out.print(request.getRequestURI());
      out.write("?whichPage=1\">至第一頁</A>&nbsp;\r\n");
      out.write("        <A href=\"");
      out.print(request.getRequestURI());
      out.write("?whichPage=");
      out.print(whichPage-1);
      out.write("\">上一頁 </A>&nbsp;\r\n");
      out.write("    ");
}
      out.write("\r\n");
      out.write("  \r\n");
      out.write("    ");
if(pageIndex<pageIndexArray[pageNumber-1]){
      out.write("\r\n");
      out.write("        <A href=\"");
      out.print(request.getRequestURI());
      out.write("?whichPage=");
      out.print(whichPage+1);
      out.write("\">下一頁 </A>&nbsp;\r\n");
      out.write("        <A href=\"");
      out.print(request.getRequestURI());
      out.write("?whichPage=");
      out.print(pageNumber);
      out.write("\">至最後一頁</A>&nbsp;\r\n");
      out.write("    ");
}
      out.write("\r\n");
      out.write("  ");
}
      out.write("  \r\n");
      out.write("\r\n");
      out.write("<br><br>\r\n");
      out.write("\r\n");
      out.write("  ");
if (pageNumber>1) {
      out.write("\r\n");
      out.write("    <FORM METHOD=\"post\" ACTION=\"");
      out.print(request.getRequestURI());
      out.write("\">   \r\n");
      out.write("       <select size=\"1\" name=\"whichPage\">\r\n");
      out.write("         ");
for (int i=1; i<=pageNumber; i++){
      out.write("\r\n");
      out.write("            <option value=\"");
      out.print(i);
      out.write("\">跳至第");
      out.print(i);
      out.write("頁\r\n");
      out.write("         ");
}
      out.write(" \r\n");
      out.write("       </select>\r\n");
      out.write("       <input type=\"submit\" value=\"確定\" >  \r\n");
      out.write("    </FORM>\r\n");
      out.write("  ");
}
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}