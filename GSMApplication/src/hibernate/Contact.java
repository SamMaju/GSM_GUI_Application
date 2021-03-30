package hibernate;

/**
 * http://www.roseindia.net
 * Java Class to map to the database Contact Table
 */
public class Contact {
	private String name;
	//private String lastName;
	private String email;
	private long phone_number;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(long phone_number) {
		this.phone_number = phone_number;
	}

	
}
