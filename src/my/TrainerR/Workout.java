/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.TrainerR;

import java.util.LinkedList;

/**
 * Holds the different exercises and their information in a list.
 * @author aidan
 * @see Exercise
 * @see Goal
 */
public class Workout {
        // Fields
        private String name;
        private int size;
        private LinkedList<Exercise> list;
        private double workoutCalories = 0;

        String[] ArrayList;
        // ----------------
        
        /**
         * Initializes a workout with default info.
         */
        public Workout() {
            name = "N/A";
            workoutCalories = 0;
            size = 0;
            list = new LinkedList<Exercise>();
        }
        
        /**
         * Initializes workout with specified info.
         * @param n
         * @param s 
         */
        public Workout(String n, int s) {
            name = n;
            size = s;
            list = new LinkedList<>();
        }
        
        
        
        /**
         * Adds an exercise to the workout.
         * @param e 
         */
        public void AddExercise (Exercise e)
        {
            list.add(e);
            size++;
            workoutCalories += e.exerciseCals;
        }
        
        /**
         * Empties the workout list.
         */
        public void clearWorkout ()
        {
            list.clear();
        }
        
        /**
         * Returns how many calories the workout burns.
         * @return workoutCalories
         */
        public double getWorkCalories () {
            workoutCalories = 0;
            for (Exercise exercise : list) {
                workoutCalories += exercise.exerciseCals;
            }
            return workoutCalories;
        }
        
        /**
         * Returns a string with all of the names of the exercises in the workout.
         * @return listWorkout
         */
        public String loopThroughWorkout() {
            String listWorkout = "";
            for (Exercise listElement : list) {
                Exercise e = listElement;
                listWorkout += e.getName()+ "\n";
                //System.out.print("a");
            }
            return listWorkout;
        }
        
        /**
         * Splits the the list of exercises into an array of strings.
         * @param StrWorkout
         * @return ArrayList
         */
        public String[] ArrayWorkout(String StrWorkout) {
            String[] ArrayList = StrWorkout.split("\n");
            return ArrayList;
        }
        // ----------------
    }
