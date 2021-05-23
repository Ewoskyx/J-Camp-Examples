
public class Main {

	public static void main(String[] args) {
		
		//Create a student
		Student student1 = new Student();
		student1.setUserId(001);
		student1.setStudentId(01);
		student1.setFirstName("Evren");
		student1.setLastName("Ersoy");
		student1.setContactEmail("e.ersoy@something.com");
		
		//Create an Instructor
		Instructor instructor1 = new Instructor();
		instructor1.setUserId(002);
		instructor1.setInstructorId(01);
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demirog");
		instructor1.setContactEmail("e.demirog@something.com");
		
		
		//Add method overridden - Delete method from base class
		UserManager userManager = new StudentManager();
		userManager.add(student1);
		userManager.delete(student1);
		UserManager userManager2 = new InstructorManager();
		userManager2.add(instructor1);
		userManager2.delete(instructor1);
		
		
	}

}
