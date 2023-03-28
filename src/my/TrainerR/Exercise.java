/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.TrainerR;

/**
 * Class for exercises. Will be expanded on and work closely with the
 * workout class to provide custom workouts based on user goals.
 * @author criiz
 */
public class Exercise {
    String name = "";
    double exerciseCals = 0;
    
    public void setName(String newname){
        name = newname; // include reps in name
    }
    public void setCals(double calories){
        exerciseCals = calories;
    }
    public String getName() {
        return name;
    }
    
}
