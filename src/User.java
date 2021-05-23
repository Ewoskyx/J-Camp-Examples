
public class User {
	private int userId;
	private String contactEmail;
	
	
	//Default Constructor
	public User() {};
	
	//Constructor
	public User(int userId, String contactEmail) {
		
		this.userId = userId;
		this.contactEmail = contactEmail;
	}
	//Get-Set
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}
}
