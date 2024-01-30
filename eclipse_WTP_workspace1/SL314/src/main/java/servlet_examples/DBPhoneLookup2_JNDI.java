package servlet_examples;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.Context;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

@WebServlet("/DBPhoneLookup2_JNDI")
public class DBPhoneLookup2_JNDI extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		res.setContentType("text/html");
		PrintWriter out = res.getWriter();

		try {
			Context ctx = new javax.naming.InitialContext();
			DataSource ds = (DataSource) ctx.lookup("java:comp/env/jdbc/TestDB2");
			con = ds.getConnection();

			// Create a Statement object
			stmt = con.createStatement();

			// Execute an SQL query, get a ResultSet
			rs = stmt.executeQuery("SELECT * FROM emp2");

			// Display the result set as a list
			out.println("<HTML><HEAD><TITLE>Phonebook</TITLE></HEAD>");
			out.println("<BODY>");
			out.println("<UL>");
			while (rs.next()) {
				out.println("<LI>" + rs.getString(1) + " " + rs.getString(2));
			}
			out.println("</UL>");
			out.println("</BODY></HTML>");
		} catch (Exception e) {
			out.println("Exception caught: " + e.getMessage());
		} finally {
			// Always close the database connection.
			try {
				if (con != null)
					con.close();
			} catch (SQLException ignored) {
			}
		}
	}
}
