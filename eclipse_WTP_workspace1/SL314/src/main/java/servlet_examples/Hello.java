package servlet_examples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Hello extends HttpServlet {

  public void doGet(HttpServletRequest req, HttpServletResponse res)
                               throws ServletException, IOException {
	    req.setCharacterEncoding("Big5");
        res.setContentType("text/html; charset=Big5");
        PrintWriter out = res.getWriter();

        String name = req.getParameter("name");
        
        System.out.println(name == null);
        System.out.println("-------------------------------------");
        
   if( name != null )  {
        System.out.println(name.trim().length() == 0);
        System.out.println(name.trim().isEmpty());
        System.out.println(name.trim().equals(""));
   }
   
   
        
        out.println("<HTML>");
        out.println("<HEAD><TITLE>Hello, " + name + "</TITLE></HEAD>");
        out.println("<BODY>");
        out.println("Hello, §A¦n: " + name);
        out.println("</BODY></HTML>");
        
        System.out.println(req.getRequestURI() ); // p109 , 500 -> method 8 ( /SL314/Hello )
  }
  
  public String getServletInfo() {
    return "A servlet that knows the name of the person to whom it's" + 
           "saying hello";
  }
}
