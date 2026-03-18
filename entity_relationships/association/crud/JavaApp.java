/**
 * 
 */
package edu.jecrc.sdt_java.oops.entity_relationships.association.crud;

/**
 * 
 */
public class JavaApp {
	public static void execution() {
		Student student = new Student(1,"Raja","raja@gmail.com",9560034879L);
		student.displayStudentDetails();
		
		Project project=new Project(1,"Flight Reservation System","A Java based Application");
		
		student.createProject(project);
		student.readProject();
		
		student.updateProject(1, "Train Reservation System", "Spring AI based Java Web App");
		student.readProject();
		
		student.deleteProject(1);
		student.readProject();
	}
}
