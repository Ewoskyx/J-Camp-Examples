
public class Instructor extends User {
	private int instructorId;
	private String firstName;
	private String lastName;

	// Default Constructor
	public Instructor() {
	};

	// Constructor
	public Instructor(int instructorId, String firstName, String lastName) {
		super();
		this.instructorId = instructorId;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	// Get-Set
	public int getInstructorId() {
		return instructorId;
	}

	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	

}
