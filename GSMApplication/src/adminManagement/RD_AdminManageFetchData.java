package adminManagement;

//import hibernate.AdminBankFdDetailsBO;
import hibernate.AdminBankRdDetailsBO;

import java.io.IOException;

//import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AdminManageFetchData
 */
public class RD_AdminManageFetchData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RD_AdminManageFetchData() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		/************for Adding data into Database**********/
try{
			
			
			System.out.println("gautamRD....");
			String bankId=(String)request.getParameter("BankId");

			String bankName=(String)request.getParameter("Bank");
			String updatedBy=(String)request.getParameter("Updatename");
			int interest=(int)Integer.parseInt(request.getParameter("Interest"));
			int months= (int)Integer.parseInt(request.getParameter("Month"));
			String updatedOn=(String)request.getParameter("UpdateDate");
			System.out.println(bankName);
			System.out.println(updatedBy);
			System.out.println(interest);
			System.out.println(updatedOn);
			//request.setAttribute("adminIdServlet","gautam");
			//request.setAttribute("passIdServlet", "gautam89");
			
			/*RequestDispatcher view = request.getRequestDispatcher("AdminManage");
			view.forward(request, response);*/
			
				AdminBankRdDetailsBO.myMethod(bankId,bankName,interest,months,updatedBy,updatedOn);
				
				//AdminManage.idS="gautam";
				//AdminManage.pass="gautam89";
				new RD_AdminManage().doPost(request, response);
				
				
		}
			catch(Exception e){}
			
			
			
		}

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
doGet(request, response);
		
	}
		
}
