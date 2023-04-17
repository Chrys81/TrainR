/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.TrainerR;

/**
 * Manages the calorie budget data and calculations for the user.
 * Contains methods for calculating maintenance budget, and adding calories burned from workouts.
 * @author alexa
 */
public class CalorieBudget {
    /*  Maintinence Calories Calculator
        For men: 66.47 + (6.24 × weight in pounds) + (12.7 × height in inches) − (6.75 × age in years) . 
        For women: BMR = 65.51 + (4.35 × weight in pounds) + (4.7 × height in inches) - (4.7 × age in years)
    */
    
    double cMaintain;
    double cBudget;
    
    /**
     * Initiates class object with default values.
     */
    public CalorieBudget() {
        this.cMaintain = 0;
        this.cBudget = 0;
    }
    
    /**
     * Calculates the base maintenance calories for the user based on their info.
     * Serves as starting point for the calorie budget
     * @param age
     * @param weight
     * @param height
     * @param sex 
     */
    public void getMaintenance(int age, int weight, int height, String sex)
    {
        if (sex.equals("Male"))
        {
            cMaintain = 66.47 + (6.24 * weight) + (12.7 * height) - (6.75 * age);
        }
        else if (sex.equals("Female"))
        {
            cMaintain = 65.51 + (4.35 * weight) + (4.7 * height) - (4.7 * age);
        }
        
        cBudget = cMaintain;
    }
    
    /**
     * Adds the calories of a workout to the calorie budget.
     * @param cWorkout
     * @return cBudget
     */
    public double addWorkout(double cWorkout)
    {
        cBudget += cWorkout;
        return cBudget;
    }
    
    /**
     * Returns the current calorie budget.
     * @return cBudget
     */
    public double getBudget()
    {
        return cBudget;
    }
}
