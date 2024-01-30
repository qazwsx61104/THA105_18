/* 測試檔案位置: src\main\webapp\images\tomcat.gif (1.txt) (1.pdf)
   測試URL1:   	
   測試URL2:   http://localhost:8081/SL314/ViewFile/images/1.txt
   測試URL3:   http://localhost:8081/SL314/ViewFile/images/1.pdf
   
   應注意(※1): 注意當有用到【額外路徑資訊】時必須使用【前置路徑對應】的設定
   應注意(※2): web.xml內的<url-pattern>是<url-pattern>/ViewFile/*</url-pattern>               
*/

package servlet_examples;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ViewFile extends HttpServlet {

  public void doGet(HttpServletRequest req, HttpServletResponse res)
                               throws ServletException, IOException {
    
    // Use a ServletOutputStream because we may pass binary information
    ServletOutputStream out = res.getOutputStream();

    // Get the file to view
    String file = req.getPathTranslated();
    
    System.out.println("file =" + file);

    // No file, nothing to view
    if (file == null) {
      out.println("No file to view");
      return;
    }

    // Get and set the type of the file
    String contentType = getServletContext().getMimeType(file);
    System.out.println("contentType=" + contentType);
//    res.setContentType(contentType);
    res.setContentType("application/force-download");


    // Return the file
    FileInputStream in = null;
	  try {
		  in = new FileInputStream(file);
		  byte[] buf = new byte[in.available()]; // buffer
		  in.read(buf);
		  out.write(buf);
	  } catch (FileNotFoundException e) {
		  out.println("File not found");
	  } catch (IOException e) {
		  out.println("Problem sending file: " + e.getMessage());
	  } finally {
		  if (in != null)
			  in.close();
	  }
  }
}