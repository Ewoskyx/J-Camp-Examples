
public class Student extends User{
	private int studentId;
	private String firstName;
	private String lastName;
	
	//Default Constructor
		public Student() {};
	
	//Constructor
	public Student(int userId, String contactEmail, int studentId, String firstName, String lastName) {
		super(userId, contactEmail);
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	//Get-Set
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
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
