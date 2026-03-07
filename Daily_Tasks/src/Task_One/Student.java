package Task_One;

public class Student {
	private int studentId;
    private String studentName;
    private String email;
    private long contactNumber;
    private Project[] projects;

    public Student() {}
 
    public Student(int studentId, String studentName, String email , long cn, Project[] projects) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.email = email;
        this.contactNumber = cn;
        this.projects = projects;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    
    

    public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public Project[] getProjects() {
        return projects;
    }

    public void setProjects(Project[] projects) {
        this.projects = projects;
    }

    public void display() {

        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Student Email: " + email);
        System.out.println("Student Contact Number: " + contactNumber);
        if (projects != null) {
            for (Project p : projects) {
                if (p != null)
                    p.display();
            }
        }
    }
}
