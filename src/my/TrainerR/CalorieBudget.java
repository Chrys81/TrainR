/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.TrainerR;

/**
 *
 * @author alexa
 */
public class CalorieBudget {
    //For men: 66.47 + (6.24 × weight in pounds) + (12.7 × height in inches)
    //− (6.75 × age in years) . 
    //For women: BMR = 65.51 + (4.35 × weight in pounds) + (4.7 × height in inches)
    // - (4.7 × age in years)
    
    double cMaintain;
    double cBudget;
    
    public void getMaintenance(int age, int weight, int height, String sex)
    {
        if (sex.equals("male"))
        {
            cMaintain = 66.47 + (6.24 * weight) + (12.7 * height) - (6.75 * age);
        }
        else if (sex.equals("female"))
        {
            cMaintain = 65.51 + (4.35 * weight) + (4.7 * height) - (4.7 * age);
        }
        
        cBudget += cMaintain;
    }
    
    public double addWorkout(double cWorkout)
    {
        cBudget += cWorkout;
        return cBudget;
    }
    
    public double getBudget()
    {
        return cBudget;
    }
}
