import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.annotation.MultipartConfig;

@WebServlet("/uploadServlet3_simple.do")
@MultipartConfig
public class UploadTest_Servlet3_Simple extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		
			Part part = req.getPart("	upfile1");
			String dir = getServletContext().getRealPath("/images_uploaded");
			String filename = part.getSubmittedFileName();
			part.write(dir + "/" + filename);
			
			//���n����k
			req.getPart("upfile1").write(getServletContext().getRealPath("/images_uploaded")+"/"+req.getPart("upfile1").getSubmittedFileName());		
		
//		req.getPart("upfile1").write(getServletContext().getRealPath("/images_uploaded")+"/file.gif");

	}
}