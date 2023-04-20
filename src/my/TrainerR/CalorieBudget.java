/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.TrainerR;

/**
 * Manages the calorie budget data and calculations for the user.
 * @author alexa
 */
public class CalorieBudget {
    double cMaintain;
    double cBudget;
    
    /**
     * Initiates CalorieBudget object with initial values of zero.
     */
    public CalorieBudget() {
        this.cMaintain = 0;
        this.cBudget = 0;
    }
    
    /**
     * Calculates the base maintenance calories for the user based on their information.
     * Serves as starting point for the calorie budget
     * @param age The age of the user. 
     * @param weight The weight of the user.
     * @param height The height of the user
     * @param sex The sex of the user
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
     * @param cWorkout Double representing the calories burned during a workout.
     * @return A value for the new calorie budget post-workout.
     */
    public double addWorkout(double cWorkout)
    {
        cBudget += cWorkout;
        return cBudget;
    }
    
    /**
     * Returns the current calorie budget.
     * @return A value for the current calorie budget.
     */
    public double getBudget()
    {
        return cBudget;
    }
}
