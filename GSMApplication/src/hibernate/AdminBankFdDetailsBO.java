package hibernate;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AdminBankFdDetailsBO {
	public static void myMethod(String bankId,String bankName,int interestrate,int months,String updatedBy, String updatedDate) 
	{
		Session session = null;
		
		

		
			long bankID=Long.parseLong(bankId);
			// This step will read hibernate.cfg.xml and prepare hibernate for use
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			 session =sessionFactory.openSession();
			 
			 org.hibernate.Transaction tx = session.beginTransaction();
				//Create new instance of Contact and set values in it by reading them from form object
			 	System.out.println("Inserting Record");
				AdminBankFdDetails bankDetail = new AdminBankFdDetails();
				bankDetail.setBank_id(bankID);
				bankDetail.setBankName(bankName);
				bankDetail.setInterestRate(interestrate);
				bankDetail.setMonths(months);
				bankDetail.setUpdatedBy(updatedBy);
				bankDetail.setUpdatedDate(updatedDate);
				
				//}
				
				
				session.save(bankDetail);
				System.out.println("Done");
				tx.commit();
		//}catch(Exception e){
		//	System.out.println(e.getMessage());
		//}finally{
			// Actual contact insertion will happen at this step
			session.flush();
			session.close();

			//}
		
	}
	
	public static List<AdminBankFdDetails> bankDetails(){
		Session session = null;
		
		
			// This step will read hibernate.cfg.xml and prepare hibernate for
			// use
			SessionFactory sessionFactory = new Configuration().configure()
					.buildSessionFactory();
			session = sessionFactory.openSession();
			//Criteria Query Example
			Criteria crit = session.createCriteria(AdminBankFdDetails.class);
			List<AdminBankFdDetails> bankDetail = crit.list();
			/*for(Iterator<AdminBankFdDetails> it = bankDetail.iterator();it.hasNext();){
				AdminBankFdDetails ob = (AdminBankFdDetails) it.next();
				System.out.println("ID: " + ob.getBank_id());
				System.out.println("Name: " + ob.getBankName());
				
			}*/
			
			session.close();
			
		return bankDetail;

		
	}
	
	
	

}
