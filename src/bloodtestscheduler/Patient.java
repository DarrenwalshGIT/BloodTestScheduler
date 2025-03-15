/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler;

/**
 * 14 - 16 March 2025
 * @author Darren Walsh x23140003
 * Data Structures & Algorithms CA1
 */

public class Patient {

    //Assigned Variables
    private final String name;
    private final int age;
    private final String priority;
    private final boolean fromWard;
    private final String gpDetails;

    //test comment for practice purposes
    //patient constructor with all neccessery details
    public Patient(String name, int age, String priority, boolean fromWard, String gpDetails) {
        this.name = name;
        this.age = age;
        this.priority = priority;
        this.fromWard = fromWard;
        this.gpDetails = gpDetails;
    }

    //Get methods to retieve info from text fields & buttons
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPriority() {
        return priority;
    }

    public boolean isFromWard() {
        return fromWard;
    }

    public String getGpDetails() {
        return gpDetails;
    }

    //toString method 
    //(Updated to read properly)
    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Priority: " + priority
                + ", From Ward: " + (fromWard ? "Yes" : "No") + ", GP Details: " + gpDetails;
    }

}
