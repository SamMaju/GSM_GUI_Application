package adminManagement;

import hibernate.AdminBankFdDetails;
import hibernate.AdminBankFdDetailsBO;
//import hibernate.Admin_bankInfoFd_BO;

import java.io.IOException;
import java.io.PrintWriter;
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
public class AdminManage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       public static String idS=null;
       public static String pass=null;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminManage() {
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
		try{
			/*String ids=(String)request.getAttribute("adminIdServlet");
			String passKeys=(String)request.getAttribute("passIdServlet");
			System.out.println(ids);
			System.out.println(passKeys);*/

			
		String id=(String)request.getParameter("adminId");
		String passKey=(String)request.getParameter("pass");
		if(idS!=null && pass!=null)
		{
			passKey=pass;
			id=idS;
		}
		System.out.println(id);
		System.out.println(passKey);
		
		
			/*try{
				AdminBankFdDetailsBO.myMethod();
			}
			catch(Exception e){}*/
		
		
		if((id.equals("gautam") )&& (passKey.equals("gautam89"))){
			
			System.out.println("done");
			try{
				List<AdminBankFdDetails> bankDetail=AdminBankFdDetailsBO.bankDetails();
				ArrayList<String> bankName=new ArrayList<String>();
				ArrayList<String> updatedOn=new ArrayList<String>();
				ArrayList<String> updatedBy=new ArrayList<String>();
				ArrayList<Integer> interestRate=new ArrayList<Integer>();
				ArrayList<Integer> months=new ArrayList<Integer>();

				for(Iterator<AdminBankFdDetails> it = bankDetail.iterator();it.hasNext();){
					AdminBankFdDetails ob = (AdminBankFdDetails) it.next();
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
				RequestDispatcher view = request.getRequestDispatcher("AdminFddetails.jsp");
				view.forward(request, response);
				
				
			}
			catch(Exception e){}
			
			
		}
		else
		{
			System.out.println("error");
			/*response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			out.println("wrong Credentials</b>");
			out.println("please conact Saumabha/gautam</b>");*/
			
			response.sendRedirect("http://localhost:8080/GSMApplication/logInFailed.jsp");
			
		}
			
	
		}
		catch(Exception e){}
		
		
		
	}

}
