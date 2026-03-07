package Task_One;

public class Department {
	private int deptId;
    private String deptName;
    private Student[] students;

    public Department() {}

    public Department(int deptId, String deptName, Student[] students) {
        this.deptId = deptId;
        this.deptName = deptName;
        this.students = students;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public void display() {

        System.out.println("Department ID: " + deptId);
        System.out.println("Department Name: " + deptName);

        if (students != null) {
            for (Student s : students) {
                if (s != null)
                    s.display();
            }
        }
    }
}
