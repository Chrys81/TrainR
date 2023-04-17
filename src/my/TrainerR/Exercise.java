/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.TrainerR;

/**
 * Holds the data and name for an exercise.
 * Will be expanded on and work closely with the workout class to provide custom workouts based on user goals.
 * @author criiz
 * @see Workout
 */
public class Exercise {
    String name = "";
    double exerciseCals = 0;
    
    /**
     * Sets the name of the exercise.
     * @param newname 
     */
    public void setName(String newname){
        name = newname; // include reps in name
    }
    
    /**
     * Sets how much calories the exercise burns.
     * @param calories 
     */
    public void setCals(double calories){
        exerciseCals = calories;
    }
    
    /**
     * Returns the name of the exercise.
     * @return name
     */
    public String getName() {
        return name;
    }
    
}
