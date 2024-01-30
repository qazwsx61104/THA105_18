package servlet_examples;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/DBGifReader2")  // 取代web.xml 403行 更新 
public class DBGifReader2 extends HttpServlet {

	Connection con;

	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		//讀取圖片時必要兩行
		res.setContentType("image/gif");
		ServletOutputStream out = res.getOutputStream();

		try {
			Statement stmt = con.createStatement();
			String id = req.getParameter("id");
			ResultSet rs = stmt.executeQuery(
					
//				"SELECT IMAGE FROM PICTURES WHERE PID = " + req.getParameter("PID")
					"select pic from club where id= "+ id
				);

			if (rs.next()) {
				BufferedInputStream in = new BufferedInputStream(rs.getBinaryStream("pic"));
				byte[] buf = new byte[4 * 1024]; // 4K buffer
				int len;
				while ((len = in.read(buf)) != -1) {
					out.write(buf, 0, len);
				}
				in.close();
			} else {
				res.sendError(HttpServletResponse.SC_NOT_FOUND);
			}
			rs.close();
			stmt.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void init() throws ServletException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBCSample?serverTimezone=Asia/Taipei", "root", "123456");
		} catch (ClassNotFoundException e) {
			throw new UnavailableException("Couldn't load JdbcOdbcDriver");
		} catch (SQLException e) {
			throw new UnavailableException("Couldn't get db connection");
		}
	}

	public void destroy() {
		try {
			if (con != null) con.close();
		} catch (SQLException e) {
			System.out.println(e);
		}
	}

}