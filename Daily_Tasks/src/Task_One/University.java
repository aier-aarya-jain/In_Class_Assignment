package Task_One;

public class University {
	private int universityId;
    private String universityName;
    private College[] colleges;

    public University() {}

    public University(int universityId, String universityName, College[] colleges) {
        this.universityId = universityId;
        this.universityName = universityName;
        this.colleges = colleges;
    }

    public int getUniversityId() {
        return universityId;
    }

    public void setUniversityId(int universityId) {
        this.universityId = universityId;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public College[] getColleges() {
        return colleges;
    }

    public void setColleges(College[] colleges) {
        this.colleges = colleges;
    }

    public void display() {

        System.out.println("University ID: " + universityId);
        System.out.println("University Name: " + universityName);

        if (colleges != null) {
            for (College c : colleges) {
                if (c != null)
                    c.display();
            }
        }
    }
}
