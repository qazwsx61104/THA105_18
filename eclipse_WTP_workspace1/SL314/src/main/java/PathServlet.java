/*
    測試:   http://localhost:8081/SL314/PathServlet/1.txt?name1=peter1&name2=peter2
    應注意     (※1)注意當有用到【額外路徑資訊】時必須使用【前置路徑對應】的設定
    同時注意(※2)web.xml內的<url-pattern>是<url-pattern>/PathServlet/*</url-pattern>                               
*/

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class PathServlet extends HttpServlet {
  public void doGet(HttpServletRequest req, HttpServletResponse res)
                               throws ServletException, IOException {
   
    res.setContentType("text/plain; charset=Big5");
    PrintWriter out = res.getWriter();

out.println("====================================context物件 - 路徑資訊及檔案服務===================================="); 
    
    out.println("1) req.getScheme()= "+req.getScheme());
    out.println("2) req.getServerName()= "+req.getServerName());
    out.println("3) req.getServerPort()= "+req.getServerPort());
    out.println("4) req.getContextPath()= "+req.getContextPath());
    out.println("5) req.getServletPath()= "+req.getServletPath());
    out.println("6) req.getPathInfo()= "+req.getPathInfo() );
    out.println("7) req.getPathTranslated()= "+req.getPathTranslated());
    out.println("8) req.getRequestURI()= "+req.getRequestURI());
    out.println("   【相當於req.getContextPath() + req.getServletPath() + req.getPathInfo()】");
    out.println("9) req.getQueryString()= "+req.getQueryString());
out.println();
out.println();  
    out.println("10) req.getMethod()= "+req.getMethod());
    out.println("11) req.getProtocol()= "+req.getProtocol());
out.println();
    out.println("12) req.getHeader(\"Content-Type\")= "+req.getHeader("Content-Type"));
    out.println("13) req.getContentType()= "+req.getContentType());
    out.println("14) req.getContentLength()= "+req.getContentLength());
out.println();
    out.println("15) req.getRequestURL()= "+req.getRequestURL());
    out.println("    【StringBuffer】");
out.println(); 

out.println("====================================context物件 - 路徑資訊及檔案服務====================================");    
    
    out.println("16) getServletContext().getRealPath(\"/xxx.gif\")= "+getServletContext().getRealPath("/xxx.gif"));
    out.println();
    out.println("※※ ServletContext context = getServletContext();");
    ServletContext context = getServletContext();
    out.println("context.getMimeType(\"/xxx.gif\")= "+context.getMimeType("/xxx.gif"));
    out.println("context.getMimeType(\"/xxx.jpg\")= "+context.getMimeType("/xxx.jpg"));
    out.println("context.getMimeType(\"/xxx.pdf\")= "+context.getMimeType("/xxx.pdf"));
    out.println("context.getMimeType(\"/xxx.doc\")= "+context.getMimeType("/xxx.doc"));
    out.println("context.getMimeType(\"/xxx.mp3\")= "+context.getMimeType("/xxx.mp3"));
    out.println("context.getMimeType(\"/xxx.mp4\")= "+context.getMimeType("/xxx.mp4"));
    out.println("context.getMimeType(\"/xxx.avi\")= "+context.getMimeType("/xxx.avi"));

out.println("======================================================================================================");
    
     
    }
	 
    
    public void doPost(HttpServletRequest req, HttpServletResponse res)
                               throws ServletException, IOException {
      doGet(req,res);
    }
}
