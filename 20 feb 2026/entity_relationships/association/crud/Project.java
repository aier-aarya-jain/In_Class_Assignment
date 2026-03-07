/**
 * Represents a Project entity used in CRUD operations.
 * 
 * This class contains basic project details such as:
 * - Project ID
 * - Project Name
 * - Project Description
 * 
 * It provides constructors, getter and setter methods,
 * and a utility method to display project details.
 * 
 * @author JECRC
 * @version 1.0
 */
package edu.jecrc.sdt_java.oops.entity_relationships.association.crud;

public class Project {

    /** Unique identifier of the project */
    private int id;

    /** Name of the project */
    private String name;

    /** Brief description of the project */
    private String description;

    /**
     * Default constructor.
     * Initializes a Project object without setting any values.
     */
    public Project() {
    }

    /**
     * Parameterized constructor to initialize project details.
     *
     * @param id          Unique project identifier
     * @param name        Name of the project
     * @param description Description of the project
     */
    public Project(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    /**
     * Returns the project ID.
     *
     * @return project ID
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the project ID.
     *
     * @param id project ID to be assigned
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Returns the project name.
     *
     * @return project name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the project name.
     *
     * @param name project name to be assigned
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the project description.
     *
     * @return project description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the project description.
     *
     * @param description project description to be assigned
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Displays the project details in a formatted structure.
     * This method prints project information to the console.
     */
    public void displayProjectDetails() {
        System.out.println("----- Project Details -----\n");
        System.out.println("Project ID           : " + id);
        System.out.println("Project Name         : " + name);
        System.out.println("Project Description  : " + description);
        System.out.println("----------------------------\n\n");
    }
}