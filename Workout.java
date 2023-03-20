/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.TrainerR;

/**
 *
 * @author aidan
 */

import java.util.LinkedList;
        
public class Workout {
        // Fields
        private String name;
        private int size;
        private char goal;
        private LinkedList list;
        
        // Constructors
        public Workout() {
            name = "N/A";
            size = 0;
            list = new LinkedList<Exercise>();
        }

        public Workout(String n, int s) {
            name = n;
            size = s;
            list = new LinkedList<Exercise>();
        }
        
        // Get functions
        public String getName ()
        {
            return name;
        }
        public int getSize ()
        {
            return size;
        }
        public char getGoal ()
        {
            return goal;
        }
        
        // Set functions
        public void setName (String n)
        {
            name = n;
        }
        public void setSize (int s)
        {
            size = s;
        }
        public void setGoal (char g)
        {
            goal = g;
        }
        
        // Linked List accesibility
        public void AddExercise (Exercise e)
        {
            list.add(size + 1, e);
            size++;
        }
        
        // Misc functions
    }
