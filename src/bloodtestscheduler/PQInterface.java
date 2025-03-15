/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler;

/**
 * 14 - 16 March 2025
 *
 * @author Darren Walsh x23140003 Data Structures & Algorithms CA1
 */

public interface PQInterface {

    void enqueue(Patient patient); // Match your usage
    int size();
    Patient dequeue();
    String printPQueue();
}
