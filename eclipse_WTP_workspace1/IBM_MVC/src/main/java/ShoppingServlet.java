import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import shopping.BOOK;

public class ShoppingServlet extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {

		req.setCharacterEncoding("UTF-8");
		// res.setContentType("text/html; charset=UTF-8");
		// PrintWriter out = res.getWriter();

		HttpSession session = req.getSession();
		Vector<BOOK> buylist = (Vector<BOOK>) session.getAttribute("shoppingcart");
		String action = req.getParameter("action");

		if (!action.equals("CHECKOUT")) {

			// �R���ʪ����������y
			if (action.equals("DELETE")) {
				String del = req.getParameter("del");
				int d = Integer.parseInt(del);
				buylist.removeElementAt(d);
			}
			// �s�W���y���ʪ�����
			else if (action.equals("ADD")) {
				boolean match = false;

				// ���o��ӷs�W�����y
				BOOK abook = getBook(req);

				// �s�W�Ĥ@�����y���ʪ�����
				if (buylist == null) {
					buylist = new Vector<BOOK>();
					buylist.add(abook);
				} else {
					for (int i = 0; i < buylist.size(); i++) {
						BOOK book = buylist.get(i);

						// ���Y�s�W�����y�M�ʪ��������y�@�ˮ�
						if (book.getName().equals(abook.getName())) {
							book.setQuantity(book.getQuantity()
									+ abook.getQuantity());
							buylist.setElementAt(book, i);
							match = true;
						} // end of if name matches
					} // end of for

					// ���Y�s�W�����y�M�ʪ��������y���@�ˮ�
					if (!match)
						buylist.add(abook);
				}
			}

			session.setAttribute("shoppingcart", buylist);
			String url = "/EShop.jsp";
			RequestDispatcher rd = req.getRequestDispatcher(url);
			rd.forward(req, res);
		}

		// ���b�A�p���ʪ������y�����`��
		else if (action.equals("CHECKOUT")) {
			float total = 0;
			for (int i = 0; i < buylist.size(); i++) {
				BOOK order = buylist.get(i);
				float price = order.getPrice();
				int quantity = order.getQuantity();
				total += (price * quantity);
			}

			String amount = String.valueOf(total);
			req.setAttribute("amount", amount);
			String url = "/Checkout.jsp";
			RequestDispatcher rd = req.getRequestDispatcher(url);
			rd.forward(req, res);
		}
	}

	private BOOK getBook(HttpServletRequest req) {

		String quantity = req.getParameter("quantity");
		String name = req.getParameter("name");
		String author = req.getParameter("author");
		String publisher = req.getParameter("publisher");
		String price = req.getParameter("price");

		BOOK bk = new BOOK();

		bk.setName(name);
		bk.setAuthor(author);
		bk.setPublisher(publisher);
		bk.setPrice((new Float(price)).floatValue());
		bk.setQuantity((new Integer(quantity)).intValue());
		return bk;
	}
}
