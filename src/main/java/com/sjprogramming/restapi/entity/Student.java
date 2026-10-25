
package com.sjprogramming.restapi.entity; // Defines the package where the Student class belongs.

// Imports the Column annotation to customize database column names.
import jakarta.persistence.Column;

// Marks this class as a JPA entity that maps to a database table.
import jakarta.persistence.Entity;

// Imports the annotation used to generate primary key values automatically.
import jakarta.persistence.GeneratedValue;

// Imports the strategy options for generating primary key values.
import jakarta.persistence.GenerationType;

// Imports the annotation used to specify the primary key.
import jakarta.persistence.Id;

// Imports the annotation used to specify the database table name.
import jakarta.persistence.Table;

// Marks this class as a database entity.
@Entity

// Maps this class to the database table named "student".
@Table(name = "student")
public class Student { // Declares the Student class.

    @Id // Marks rollNo as the primary key of the table.

    // Automatically generates the primary key using the database's identity mechanism.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rollNo; // Stores the student's unique roll number.

    // Maps the name field to the database column "student_name".
    @Column(name = "student_name")
    private String name; // Stores the student's name.

    // Maps the percentage field to the database column "student_percentage".
    @Column(name = "student_percentage")
    private float percentage; // Stores the student's percentage.

    // Maps the branch field to the database column "student_branch".
    @Column(name = "student_branch")
    private String branch; // Stores the student's branch, such as CSE or IT.

    // Default constructor with no parameters.
    // JPA uses this constructor when it needs to create a Student object.
    public Student() {
    }

    // Parameterized constructor to initialize a student's name, percentage, and branch.
    // rollNo is not included because the database generates it automatically.
    public Student(String name, float percentage, String branch) {
        super(); // Calls the constructor of the parent class, Object.
        this.name = name; // Assigns the parameter name to the object's name field.
        this.percentage = percentage; // Assigns the parameter percentage to the object's percentage field.
        this.branch = branch; // Assigns the parameter branch to the object's branch field.
    }

    // Getter method that returns the student's roll number.
    public int getRollNo() {
        return rollNo; // Returns the current value of rollNo.
    }

    // Setter method that updates the student's roll number.
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo; // Assigns the parameter value to the object's rollNo field.
    }

    // Getter method that returns the student's name.
    public String getName() {
        return name; // Returns the current value of name.
    }

    // Setter method that updates the student's name.
    public void setName(String name) {
        this.name = name; // Assigns the parameter value to the object's name field.
    }

    // Getter method that returns the student's percentage.
    public float getPercentage() {
        return percentage; // Returns the current value of percentage.
    }

    // Setter method that updates the student's percentage.
    public void setPercentage(float percentage) {
        this.percentage = percentage; // Assigns the parameter value to the object's percentage field.
    }

    // Getter method that returns the student's branch.
    public String getBranch() {
        return branch; // Returns the current value of branch.
    }

    // Setter method that updates the student's branch.
    public void setBranch(String branch) {
        this.branch = branch; // Assigns the parameter value to the object's branch field.
    }

    // Overrides the toString() method inherited from the Object class.
    // Provides a readable string representation of the Student object.
    @Override
    public String toString() {
        // Combines the field names and their current values into one string.
        return "Student [rollNo=" + rollNo
                + ", name=" + name
                + ", percentage=" + percentage
                + ", branch=" + branch + "]";
    }

} // Ends the Student class.
