/* �����ɮצ�m: src\main\webapp\images\tomcat.gif (1.txt) (1.pdf)
   ����URL1:   	
   ����URL2:   http://localhost:8081/SL314/ViewFile/images/1.txt
   ����URL3:   http://localhost:8081/SL314/ViewFile/images/1.pdf
   
   ���`�N(��1): �`�N���Ψ�i�B�~���|��T�j�ɥ����ϥΡi�e�m���|�����j���]�w
   ���`�N(��2): web.xml����<url-pattern>�O<url-pattern>/ViewFile/*</url-pattern>               
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