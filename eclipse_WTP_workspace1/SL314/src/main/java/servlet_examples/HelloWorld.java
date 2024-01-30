package servlet_examples;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloWorld extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) 
																									throws ServletException, IOException {
		doPost(req, res);
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) 
																									throws ServletException, IOException {
		
		
		//清除快取 , 三個程式碼一起寫
		res.setHeader("Cache-Control","no-store"); //HTTP 1.1
	  	res.setHeader("Pragma","no-cache");        //HTTP 1.0
	 	res.setDateHeader ("Expires", 0);
		

//		res.setContentType("text/html; charset=Big5");
		res.setHeader("content-Type ","text/html; charset=Big5");  //p.135 , p.136
		PrintWriter out = res.getWriter();

		out.println("<HTML>");
		out.println("<HEAD><TITLE>Hello World</TITLE></HEAD>");
		out.println("<BODY>");
		out.println("<BIG>Hello World , 世界你好 !</BIG>");
		out.println("</BODY></HTML>");
		
		System.out.println(getServletContext().getAttribute(ServletContext.TEMPDIR)); // p.97 , p200 
		System.out.println(req.getContextPath()); // p109 , 500 -> method 4      ( /SL314 )
		System.out.println(req.getRequestURI() ); // p109 , 500 -> method 8      ( /SL314/HelloWorld )
		System.out.println(getServletContext().getRealPath("images")); // p110
		
	}
}
