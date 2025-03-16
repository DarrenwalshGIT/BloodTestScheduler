/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler;

import java.util.ArrayList;
import java.util.*;

/**
 * 14 - 16 March 2025
 * @author Darren Walsh x23140003
 * Data Structures & Algorithms CA1
 */

public class PatientPQ implements PQInterface{

    //List to store Patients
    private final List<Patient> queue= new ArrayList<>();

    public PatientPQ() {
    }

    @Override
    public int size() {
        return queue.size();
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }
 
    //Enqueue method to insert patient in correct priority order
    @Override
    public void enqueue(Patient patient) {
        queue.add(patient);
        queue.sort((p1, p2) -> {
            int priorityDiff = getPriorityValue(p1.getPriority()) - getPriorityValue(p2.getPriority());
            if (priorityDiff != 0) { //If priority is not equal then sort by priority
                return priorityDiff; //The lower the priority Value goes first
            }

            int ageDiff = p2.getAge() - p1.getAge(); //Comparing ages
            if (ageDiff != 0) { //If age diff is not 0, the older goes first
                return ageDiff;
            }

            if (p2.isFromWard() && !p1.isFromWard()) { //If only p2 is from Ward, it goes first
                return 1;
            }
            if (p1.isFromWard() && !p2.isFromWard()) { //If only p1 is from Ward, it goes first
                return -1;
            }
            return 0;
        });
    }

    //Givings each case a value
    private int getPriorityValue(String priority) {
        switch (priority) {
            case "Urgent":
                return 1; //High priority
            case "Medium":
                return 2; //Middle priority
            case "Low":
                return 3; //Low priority
            default:
                return Integer.MAX_VALUE;
        }
    }
    
    //Dequeue method to remove and return the highest priority patient
    public Patient dequeue() {
        if (queue.isEmpty()) {
            return null; 
        }
        return queue.remove(0); //Remove and return the first patient (highest priority)
    }

    //Method to get the current patient queue
    public List<Patient> getQueue() {
        return queue;
    }
    
    public String printPQueue() {
        return printPQueueRecursive(0); //Starts recursion at index 0
    }

    private String printPQueueRecursive(int index) {
        if (index >= queue.size()) { //Checks is at end of Queue
            return "";
        }
        return queue.get(index).toString() + "\n" + printPQueueRecursive(index + 1); //Gets Patient from first index, adds new line, calls next index
    }
}