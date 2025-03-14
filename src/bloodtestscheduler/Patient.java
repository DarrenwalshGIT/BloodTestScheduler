/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler;

/**
 *
 * @author Darren
 */
public class Patient {

    //Assigned Variables
    String name;
    int age;
    String priority;
    boolean fromWard;
    String gpDetails;

    //patient constructor with all neccessery details
    public Patient(String name, int age, String priority, boolean fromWard, String gpDetails) {
        this.name = name;
        this.age = age;
        this.priority = priority;
        this.fromWard = fromWard;
        this.gpDetails = gpDetails;
    }

}
