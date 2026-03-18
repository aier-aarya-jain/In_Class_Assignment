/**
 * Represents a Student entity in the system.
 *
 * This class maintains student details and demonstrates
 * association with the Project class.
 *
 * It also provides basic CRUD operations for managing
 * the associated Project object.
 *
 * @author JECRC
 * @version 1.0
 */
package edu.jecrc.sdt_java.oops.entity_relationships.association.crud;

public class Student {

    /** Unique identifier of the student */
    private int id;

    /** Name of the student */
    private String name;

    /** Email address of the student */
    private String mailId;

    /** Contact number of the student */
    private long contactNumber;

    /** Associated project assigned to the student */
    private Project project;

    /**
     * Parameterized constructor to initialize student details.
     *
     * @param id            Unique student identifier
     * @param name          Name of the student
     * @param mailId        Email address of the student
     * @param contactNumber Contact number of the student
     */
    public Student(int id, String name, String mailId, long contactNumber) {
        this.id = id;
        this.name = name;
        this.mailId = mailId;
        this.contactNumber = contactNumber;
    }

    /**
     * Returns the student ID.
     *
     * @return student ID
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the student ID.
     *
     * @param id student ID to be assigned
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Returns the student name.
     *
     * @return student name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the student name.
     *
     * @param name student name to be assigned
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the student's email address.
     *
     * @return email address
     */
    public String getMailId() {
        return mailId;
    }

    /**
     * Sets the student's email address.
     *
     * @param mailId email address to be assigned
     */
    public void setMailId(String mailId) {
        this.mailId = mailId;
    }

    /**
     * Returns the student's contact number.
     *
     * @return contact number
     */
    public long getContactNumber() {
        return contactNumber;
    }

    /**
     * Sets the student's contact number.
     *
     * @param contactNumber contact number to be assigned
     */
    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }

    /**
     * Returns the associated project of the student.
     *
     * @return Project object
     */
    public Project getProject() {
        return project;
    }

    /**
     * Assigns a project to the student.
     *
     * @param project Project to be associated
     */
    public void setProject(Project project) {
        this.project = project;
    }

    /**
     * Displays student details in a formatted structure.
     */
    public void displayStudentDetails() {
        System.out.println("------ Student Details ------\n");
        System.out.println("ID          : " + getId());
        System.out.println("Name        : " + getName());
        System.out.println("Email       : " + getMailId());
        System.out.println("Contact No  : " + getContactNumber());
        System.out.println("------------------------------\n\n");
    }

    /**
     * Creates and assigns a project to the student.
     *
     * Validates that project details are not null or invalid
     * before assignment.
     *
     * @param project Project object to be created and assigned
     */
    public void createProject(Project project) {
        if (project != null) {
            if (project.getId() != 0 &&
                project.getName() != null &&
                project.getDescription() != null) {

                this.project = project;
                System.out.println("Project Created!");
                System.out.println("------------------------------\n\n");
            }
        } else {
            System.out.println("Project Already Exists!");
            System.out.println("------------------------------\n\n");
        }
    }

    /**
     * Reads and displays the associated project details.
     */
    public void readProject() {
        if (this.project != null) {
            this.project.displayProjectDetails();
        } else {
            System.out.println("No Project Assigned.");
            System.out.println("------------------------------\n\n");
        }
    }

    /**
     * Updates the associated project details.
     *
     * @param id          Project ID
     * @param name        Updated project name
     * @param description Updated project description
     */
    public void updateProject(int id, String name, String description) {
        if (id != 0 && name != null && description != null) {
            if (this.getProject() != null &&
                this.getProject().getId() == id) {

                this.getProject().setName(name);
                this.getProject().setDescription(description);
                System.out.println("Project Updated!");
                System.out.println("------------------------------\n\n");
            } else {
                System.out.println("Project not Updated!");
                System.out.println("------------------------------\n\n");
            }
        }
    }

    /**
     * Deletes the associated project if the ID matches.
     *
     * @param id Project ID to be deleted
     */
    public void deleteProject(int id) {
        if (id != 0) {
            if (this.getProject() != null &&
                this.getProject().getId() == id) {

                this.project = null;
                System.out.println("Project Deleted!");
                System.out.println("------------------------------\n\n");
            } else {
                System.out.println("Project not Deleted!");
                System.out.println("------------------------------\n\n");
            }
        }
    }
}