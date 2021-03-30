package adminManagement;

import hibernate.AdminBankRdDetails;
//import hibernate.AdminBankFdDetailsBO;
//import hibernate.AdminBankRdDetails;
import hibernate.AdminBankRdDetailsBO;
//import hibernate.Admin_bankInfoFd_BO;

import java.io.IOException;
//import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AdminManage
 */
public class RD_AdminManage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       public static String idS=null;
       public static String pass=null;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RD_AdminManage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
			/*String ids=(String)request.getAttribute("adminIdServlet");
			String passKeys=(String)request.getAttribute("passIdServlet");
			System.out.println(ids);
			System.out.println(passKeys);*/

		
		
			/*try{
				AdminBankFdDetailsBO.myMethod();
			}
			catch(Exception e){}*/
		
		
		
			
			System.out.println("done");
			try{
				List<AdminBankRdDetails> bankDetail=AdminBankRdDetailsBO.bankDetails();
				ArrayList<String> bankName=new ArrayList<String>();
				ArrayList<String> updatedOn=new ArrayList<String>();
				ArrayList<String> updatedBy=new ArrayList<String>();
				ArrayList<Integer> interestRate=new ArrayList<Integer>();
				ArrayList<Integer> months=new ArrayList<Integer>();

				for(Iterator<AdminBankRdDetails> it = bankDetail.iterator();it.hasNext();){
					AdminBankRdDetails ob = (AdminBankRdDetails) it.next();
					System.out.println("ID: " + ob.getBank_id());
					System.out.println("Name: " + ob.getBankName());
					bankName.add(ob.getBankName());
					updatedBy.add(ob.getUpdatedBy());
					updatedOn.add(ob.getUpdatedDate());
					interestRate.add(ob.getInterestRate());
					months.add(ob.getMonths());
					
				}
				
				request.setAttribute("BankName",bankName);
				request.setAttribute("InterestRate",interestRate);
				request.setAttribute("UpdatedOn", updatedOn);
				request.setAttribute("UpdatedBy", updatedBy);
				request.setAttribute("Months", months);
				RequestDispatcher view = request.getRequestDispatcher("AdminRDdetails.jsp");
				view.forward(request, response);
				
				
			}
			catch(Exception e){}
			
			
		
		
		
		
		
	}

}
