/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.65
 * Generated at: 2024-01-29 09:28:09 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.ad.Test;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.ad.model.*;

public final class addAd2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/standard.jar", Long.valueOf(1704358531007L));
    _jspx_dependants.put("jar:file:/C:/THA105_WebApp/eclipse_WTP_workspace1/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/THA105G1/WEB-INF/lib/standard.jar!/META-INF/c.tld", Long.valueOf(1054243570000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("com.ad.model");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

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
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
 //見com.emp.controller.EmpServlet.java第238行存入req的empVO物件 (此為輸入格式有錯誤時的empVO物件)
   AdVO adVO = (AdVO) request.getAttribute("AdVO");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\"/>\r\n");
      out.write("<title>廣告新增 - addAd.jsp</title>\r\n");
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
      out.write("	width: 450px;\r\n");
      out.write("	background-color: white;\r\n");
      out.write("	margin-top: 1px;\r\n");
      out.write("	margin-bottom: 1px;\r\n");
      out.write("  }\r\n");
      out.write("  table, th, td {\r\n");
      out.write("    border: 0px solid #CCCCFF;\r\n");
      out.write("  }\r\n");
      out.write("  th, td {\r\n");
      out.write("    padding: 1px;\r\n");
      out.write("  }\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body bgcolor='white'>\r\n");
      out.write("\r\n");
      out.write("<table id=\"table-1\">\r\n");
      out.write("	<tr><td>\r\n");
      out.write("		 <h3>廣告資料新增 - addEmp.jsp</h3></td><td>\r\n");
      out.write("		 <h4><a href=\"select_page.jsp\"><img src=\"images/tomcat.png\" width=\"100\" height=\"100\" border=\"0\">回首頁</a></h4>\r\n");
      out.write("	</td></tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("<h3>資料新增:</h3>\r\n");
      out.write("\r\n");
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("<FORM METHOD=\"post\" ACTION=\"ad.do\" name=\"form1\" enctype=\"multipart/form-data\">\r\n");
      out.write("<table>\r\n");
      out.write("	\r\n");
      out.write("	<tr>\r\n");
      out.write("		<td>賣家ID:</td>\r\n");
      out.write("		<td><input type=\"TEXT\" name=\"sellerId\" value=\"");
      out.print( (adVO==null)? "" :adVO.getSellerId());
      out.write("\" size=\"45\"/></td>\r\n");
      out.write("	</tr>\r\n");
      out.write("	\r\n");
      out.write("	<tr>\r\n");
      out.write("		<td>廣告名稱:</td>\r\n");
      out.write("		<td><input type=\"TEXT\" name=\"adName\"   value=\"");
      out.print( (adVO==null)? "" :adVO.getAdName());
      out.write("\" size=\"45\"/></td>\r\n");
      out.write("	</tr>\r\n");
      out.write("		\r\n");
      out.write("	<tr>\r\n");
      out.write("		<td>廣告網址url:</td>\r\n");
      out.write("		<td><input type=\"TEXT\" name=\"adUrl\"   value=\"");
      out.print( (adVO==null)? "" :adVO.getAdUrl());
      out.write("\" size=\"45\"/></td>\r\n");
      out.write("	</tr>\r\n");
      out.write("	\r\n");
      out.write("	<tr>\r\n");
      out.write("		<td>廣告圖片:</td>\r\n");
      out.write("		<td><input type=\"file\" name=\"adImg\" accept=\"image/*\" /></td> <!-- 上傳圖片的輸入欄位 -->\r\n");
      out.write("	</tr>\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	<tr>\r\n");
      out.write("		<td>廣告開始時間:</td>\r\n");
      out.write("		<td><input name=\"adStartTime\" id=\"f_date1\" type=\"text\" ></td>\r\n");
      out.write("	</tr>\r\n");
      out.write("	\r\n");
      out.write("		<tr>\r\n");
      out.write("		<td>廣告結束時間:</td>\r\n");
      out.write("		<td><input name=\"adEndTime\" id=\"f_date2\" type=\"text\" ></td>\r\n");
      out.write("	</tr>\r\n");
      out.write("	\r\n");
      out.write("	<tr>\r\n");
      out.write("		<td>廣告等級:</td>\r\n");
      out.write("		<td><input type=\"TEXT\" name=\"adLv\"   value=\"");
      out.print( (adVO==null)? "" : adVO.getAdLv());
      out.write("\" size=\"45\"/></td>\r\n");
      out.write("	</tr>\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	<tr>\r\n");
      out.write("		<td>廣告備註:</td>\r\n");
      out.write("		<td><input type=\"TEXT\" name=\"adMemo\"   value=\"");
      out.print( (adVO==null)? "" : adVO.getAdMemo() );
      out.write("\" size=\"45\"/></td>\r\n");
      out.write("	</tr>\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("     <tr>\r\n");
      out.write("		<td>廣告審核:</td>\r\n");
      out.write("		<td><input type=\"TEXT\" name=\"isAdConfirm\"   value=\"");
      out.print( (adVO==null)? "" : adVO.getAdMemo() );
      out.write("\" size=\"45\"/></td>\r\n");
      out.write("	</tr>\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	  <tr>\r\n");
      out.write("		<td>廣告狀態]:</td>\r\n");
      out.write("		<td><input type=\"TEXT\" name=\"isEnabled\"   value=\"");
      out.print( (adVO==null)? "" : adVO.getAdMemo() );
      out.write("\" size=\"45\"/></td>\r\n");
      out.write("	</tr>\r\n");
      out.write("	\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- 	<tr> -->\r\n");
      out.write("<!-- 		<td>部門:<font color=red><b>*</b></font></td> -->\r\n");
      out.write("<!-- 		<td><select size=\"1\" name=\"deptno\"> -->\r\n");
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<!-- 		</select></td> -->\r\n");
      out.write("<!-- 	</tr> -->\r\n");
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("<br>\r\n");
      out.write("<input type=\"hidden\" name=\"action\" value=\"insert\">\r\n");
      out.write("<input type=\"submit\" value=\"送出新增\">\r\n");
      out.write("</FORM>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- =========================================以下為 datetimepicker 之相關設定========================================== -->\r\n");
      out.write("\r\n");
 
 java.sql.Timestamp adStartTimeTimestamp = null;
  try {
	  adStartTimeTimestamp = adVO.getAdStartTime();
   } catch (Exception e) {
	   adStartTimeTimestamp = new java.sql.Timestamp(System.currentTimeMillis());
   }

      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath());
      out.write("/datetimepicker/jquery.datetimepicker.css\" />\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/datetimepicker/jquery.js\"></script>\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/datetimepicker/jquery.datetimepicker.full.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("  .xdsoft_datetimepicker .xdsoft_datepicker {\r\n");
      out.write("           width:  300px;   /* width:  300px; */\r\n");
      out.write("  }\r\n");
      out.write("  .xdsoft_datetimepicker .xdsoft_timepicker .xdsoft_time_box {\r\n");
      out.write("           height: 151px;   /* height:  151px; */\r\n");
      out.write("  }\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("        $.datetimepicker.setLocale('zh');\r\n");
      out.write("        $('#f_date1').datetimepicker({\r\n");
      out.write("	       theme: '',              //theme: 'dark',\r\n");
      out.write("	       timepicker:false,       //timepicker:true,\r\n");
      out.write("	       step: 1,                //step: 60 (這是timepicker的預設間隔60分鐘)\r\n");
      out.write("	       format:'Y-m-d',         //format:'Y-m-d H:i:s',\r\n");
      out.write("	       value: '");
      out.print( (adVO == null) ? "" : adVO.getAdStartTime() );
      out.write("', \r\n");
      out.write("           //disabledDates:        ['2017/06/08','2017/06/09','2017/06/10'], // 去除特定不含\r\n");
      out.write("           //startDate:	            '2017/07/10',  // 起始日\r\n");
      out.write("           //minDate:               '-1970-01-01', // 去除今日(不含)之前\r\n");
      out.write("           //maxDate:               '+1970-01-01'  // 去除今日(不含)之後\r\n");
      out.write("        });\r\n");
      out.write("        \r\n");
      out.write("        $.datetimepicker.setLocale('zh');\r\n");
      out.write("        $('#f_date2').datetimepicker({\r\n");
      out.write("	       theme: '',              //theme: 'dark',\r\n");
      out.write("	       timepicker:false,       //timepicker:true,\r\n");
      out.write("	       step: 1,                //step: 60 (這是timepicker的預設間隔60分鐘)\r\n");
      out.write("	       format:'Y-m-d',         //format:'Y-m-d H:i:s',\r\n");
      out.write("	       value: '");
      out.print( (adVO == null) ? "" : adVO.getAdEndTime() );
      out.write("',\r\n");
      out.write("           //disabledDates:        ['2017/06/08','2017/06/09','2017/06/10'], // 去除特定不含\r\n");
      out.write("           //startDate:	            '2017/07/10',  // 起始日\r\n");
      out.write("           //minDate:               '-1970-01-01', // 去除今日(不含)之前\r\n");
      out.write("           //maxDate:               '+1970-01-01'  // 去除今日(不含)之後\r\n");
      out.write("        });\r\n");
      out.write("        \r\n");
      out.write("   \r\n");
      out.write("        // ----------------------------------------------------------以下用來排定無法選擇的日期-----------------------------------------------------------\r\n");
      out.write("\r\n");
      out.write("        //      1.以下為某一天之前的日期無法選擇\r\n");
      out.write("        //      var somedate1 = new Date('2017-06-15');\r\n");
      out.write("        //      $('#f_date1').datetimepicker({\r\n");
      out.write("        //          beforeShowDay: function(date) {\r\n");
      out.write("        //        	  if (  date.getYear() <  somedate1.getYear() || \r\n");
      out.write("        //		           (date.getYear() == somedate1.getYear() && date.getMonth() <  somedate1.getMonth()) || \r\n");
      out.write("        //		           (date.getYear() == somedate1.getYear() && date.getMonth() == somedate1.getMonth() && date.getDate() < somedate1.getDate())\r\n");
      out.write("        //              ) {\r\n");
      out.write("        //                   return [false, \"\"]\r\n");
      out.write("        //              }\r\n");
      out.write("        //              return [true, \"\"];\r\n");
      out.write("        //      }});\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        //      2.以下為某一天之後的日期無法選擇\r\n");
      out.write("        //      var somedate2 = new Date('2017-06-15');\r\n");
      out.write("        //      $('#f_date1').datetimepicker({\r\n");
      out.write("        //          beforeShowDay: function(date) {\r\n");
      out.write("        //        	  if (  date.getYear() >  somedate2.getYear() || \r\n");
      out.write("        //		           (date.getYear() == somedate2.getYear() && date.getMonth() >  somedate2.getMonth()) || \r\n");
      out.write("        //		           (date.getYear() == somedate2.getYear() && date.getMonth() == somedate2.getMonth() && date.getDate() > somedate2.getDate())\r\n");
      out.write("        //              ) {\r\n");
      out.write("        //                   return [false, \"\"]\r\n");
      out.write("        //              }\r\n");
      out.write("        //              return [true, \"\"];\r\n");
      out.write("        //      }});\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        //      3.以下為兩個日期之外的日期無法選擇 (也可按需要換成其他日期)\r\n");
      out.write("        //      var somedate1 = new Date('2017-06-15');\r\n");
      out.write("        //      var somedate2 = new Date('2017-06-25');\r\n");
      out.write("        //      $('#f_date1').datetimepicker({\r\n");
      out.write("        //          beforeShowDay: function(date) {\r\n");
      out.write("        //        	  if (  date.getYear() <  somedate1.getYear() || \r\n");
      out.write("        //		           (date.getYear() == somedate1.getYear() && date.getMonth() <  somedate1.getMonth()) || \r\n");
      out.write("        //		           (date.getYear() == somedate1.getYear() && date.getMonth() == somedate1.getMonth() && date.getDate() < somedate1.getDate())\r\n");
      out.write("        //		             ||\r\n");
      out.write("        //		            date.getYear() >  somedate2.getYear() || \r\n");
      out.write("        //		           (date.getYear() == somedate2.getYear() && date.getMonth() >  somedate2.getMonth()) || \r\n");
      out.write("        //		           (date.getYear() == somedate2.getYear() && date.getMonth() == somedate2.getMonth() && date.getDate() > somedate2.getDate())\r\n");
      out.write("        //              ) {\r\n");
      out.write("        //                   return [false, \"\"]\r\n");
      out.write("        //              }\r\n");
      out.write("        //              return [true, \"\"];\r\n");
      out.write("        //      }});\r\n");
      out.write("        \r\n");
      out.write("</script>\r\n");
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /ad/Test/addAd2.jsp(59,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty errorMsgs}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("	<font style=\"color:red\">請修正以下錯誤:</font>\r\n");
          out.write("	<ul>\r\n");
          out.write("		");
          if (_jspx_meth_c_005fforEach_005f0(_jspx_th_c_005fif_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("	</ul>\r\n");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
      // /ad/Test/addAd2.jsp(62,2) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("message");
      // /ad/Test/addAd2.jsp(62,2) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${errorMsgs}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("			<li style=\"color:red\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${message}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</li>\r\n");
            out.write("		");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }
}
