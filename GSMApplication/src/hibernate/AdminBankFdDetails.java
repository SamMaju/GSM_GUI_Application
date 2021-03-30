package hibernate;

public class AdminBankFdDetails {
	private long bank_id;
	private String bankName;
	private int interestRate;
	private String updatedDate;
	private String UpdatedBy;
	private int months;
	
	
	/********getter and setter****************/
	public long getBank_id() {
		return bank_id;
	}
	public void setBank_id(long bank_id) {
		this.bank_id = bank_id;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public int getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(int interestRate) {
		this.interestRate = interestRate;
	}
	public String getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(String updatedDate) {
		this.updatedDate = updatedDate;
	}
	public String getUpdatedBy() {
		return UpdatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		UpdatedBy = updatedBy;
	}
	public int getMonths() {
		return months;
	}
	public void setMonths(int months) {
		this.months = months;
	}
	
	

}
