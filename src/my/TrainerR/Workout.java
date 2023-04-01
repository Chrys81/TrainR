/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.TrainerR;

/**
 * Class for workouts, will be expanded on to provide lists to display on the 
 * workout page based on user goal.
 * @author aidan
 */

import java.util.LinkedList;
        
public class Workout {
        // Fields
        private String name;
        private int size;
        private String goal;
        private LinkedList<Exercise> list;
        private double workoutCalories = 0;
        
        // Constructors
        public Workout() {
            name = "N/A";
            workoutCalories = 0;
            size = 0;
            list = new LinkedList<Exercise>();
        }

        public Workout(String n, int s) {
            name = n;
            size = s;
            list = new LinkedList<>();
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
        public String getGoal ()
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
        public void setGoal (String g)
        {
            goal = g;
        }
        
        // Linked List accesibility
        public void AddExercise (Exercise e)
        {
            list.add(e);
            size++;
            workoutCalories += e.exerciseCals;
        }
        
        public void clearWorkout ()
        {
            list.clear();
        }
        
        public double getWorkCalories () {
            workoutCalories = 0;
            for (Exercise exercise : list) {
                workoutCalories += exercise.exerciseCals;
            }
            return workoutCalories;
        }
        
        public String loopThroughWorkout() {
            String listWorkout = "";
            for (Exercise listElement : list) {
                Exercise e = listElement;
                listWorkout += e.getName()+ "\n";
                //System.out.print("a");
            }
            return listWorkout;
        }
        // Misc functions
    }
