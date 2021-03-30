package userdetails;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserInformation
 */
public class UserInformation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UserInformation() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			String name = request.getParameter("name");
			String mail = request.getParameter("email");
			long phone = Long.parseLong(request.getParameter("phone").trim());
			System.out.println("****************************"+phone+"**********");
/*			String exptype[] = request.getParameterValues("exptype");
			for (int x = 0; x < exptype.length; x++) {
				System.out.println(exptype[x]);

			}

			String expamt[] = request.getParameterValues("expamt");
			for (int x = 0; x < expamt.length; x++) {
				System.out.println(expamt[x]);

			}*/
			
			if (name != null && mail != null) {
			
				hibernate.UserInfoBO.myMethod(name,phone,mail);
				request.setAttribute("name", name);
				request.setAttribute("mail", mail);
				request.setAttribute("phone", phone);
			}
			RequestDispatcher view = request
					.getRequestDispatcher("mysavings.jsp");
			view.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
