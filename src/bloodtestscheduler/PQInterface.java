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

    public interface PQInterface {
        public void enqueue(int key, Object element);
        public int size();
        public boolean isEmpty();
        public Object dequeue();
        public String printPQueue();
    }