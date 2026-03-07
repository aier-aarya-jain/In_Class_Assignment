package Task_One;

public class College {
	 private int collegeId;
	    private String collegeName;
	    private Department[] departments;

	    public College() {}

	    public College(int collegeId, String collegeName, Department[] departments) {
	        this.collegeId = collegeId;
	        this.collegeName = collegeName;
	        this.departments = departments;
	    }

	    public int getCollegeId() {
	        return collegeId;
	    }

	    public void setCollegeId(int collegeId) {
	        this.collegeId = collegeId;
	    }

	    public String getCollegeName() {
	        return collegeName;
	    }

	    public void setCollegeName(String collegeName) {
	        this.collegeName = collegeName;
	    }

	    public Department[] getDepartments() {
	        return departments;
	    }

	    public void setDepartments(Department[] departments) {
	        this.departments = departments;
	    }

	    public void display() {

	        System.out.println("College ID: " + collegeId);
	        System.out.println("College Name: " + collegeName);

	        if (departments != null) {
	            for (Department d : departments) {
	                if (d != null)
	                    d.display();
	            }
	        }
	    }
}
