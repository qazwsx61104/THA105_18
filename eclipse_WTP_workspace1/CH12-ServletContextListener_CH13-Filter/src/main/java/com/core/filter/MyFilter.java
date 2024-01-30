package com.core.filter;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;

@WebFilter("/*") // 註冊Filter過濾器: * 代表全部請求都被此濾器過濾，見Servlet講義 p289 或 p363
public class MyFilter implements Filter {

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			                                                           throws IOException, ServletException {
		res.setContentType("text/html; charset=UTF-8");
		PrintWriter out = res.getWriter();
		
		out.println("<font color=red> MyFilter......開始!</font><br>");
		
		chain.doFilter(req, res);  // 見Servlet講義 p288
                                   // FilterChain 的 doFilter(req, res) 方法，會將程式控制權交給後續的過濾器 
                                   // 如果已沒有後續的過濾器，則是要請求的目標網頁
                                   // (返回後，再繼續原來程式碼)
		
		out.println("<font color=red> MyFilter......結束!</font><br>");
		

		
	}
}
