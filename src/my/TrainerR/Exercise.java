/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.TrainerR;

/**
 * Class for creating exercises that stores the name and calories for an exercise.
 * @author criiz
 */
public class Exercise {
    String name = "";
    double exerciseCals = 0;
    
    /**
     * Sets the name of the exercise.
     * @param newname Name of the exercise.
     */
    public void setName(String newname){
        name = newname; // include reps in name
    }
    
    /**
     * Sets how many calories the exercise burns.
     * @param calories Number of calories burned during the exercise.
     */
    public void setCals(double calories){
        exerciseCals = calories;
    }
    
    /**
     * Returns the name of the exercise.
     * @return name of the exercise.
     */
    public String getName() {
        return name;
    }
    
}
