/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.TrainerR;

/**
 *
 * @author alexa
 */
public class Goal {
    String listWorkout;
    
    Workout strength1 = new Workout();
    Workout endurance1 = new Workout();
    Workout loseweight1 = new Workout();
    
    Exercise benchPress = new Exercise();
    Exercise inclinePress = new Exercise();
    Exercise tricepPulldown = new Exercise();
    Exercise chestFly = new Exercise();
    Exercise pushUps = new Exercise();
    
    Exercise run = new Exercise();
    Exercise jumpingJacks = new Exercise();
    Exercise crunches = new Exercise();
    
    Exercise squat = new Exercise();
    Exercise bike = new Exercise();
    
    public void initWorkout() {
        benchPress.setName("Bench Press 3x10");
        benchPress.setCals(100);
        inclinePress.setName("Incline Press 3x8");
        inclinePress.setCals(90);
        tricepPulldown.setName("Tricep Pulldown 3x12");
        tricepPulldown.setCals(70);
        chestFly.setName("Chest Fly 3x10");
        chestFly.setCals(80);
        pushUps.setName("Push Ups 3x15");
        pushUps.setCals(150);
        run.setName("Run 30 Minutes");
        run.setCals(300);
        jumpingJacks.setName("Jumping Jacks 2x30");
        jumpingJacks.setCals(180);
        crunches.setName("Crunches 3x30 seconds");
        crunches.setCals(120);
        squat.setName("squat 4x8");
        squat.setCals(100);
        bike.setName("Bike 30 Minutes");
        bike.setCals(200);
        
        strength1.AddExercise(benchPress);
        strength1.AddExercise(inclinePress);
        strength1.AddExercise(tricepPulldown);
        strength1.AddExercise(chestFly);
        strength1.AddExercise(pushUps);
        
        endurance1.AddExercise(run);
        endurance1.AddExercise(crunches);
        endurance1.AddExercise(pushUps);
        endurance1.AddExercise(bike);
        
        loseweight1.AddExercise(squat);
        loseweight1.AddExercise(benchPress);
        loseweight1.AddExercise(jumpingJacks);
        loseweight1.AddExercise(bike);
    }
    
    public void clearWorkout() {
        strength1.clearWorkout();
        endurance1.clearWorkout();
        loseweight1.clearWorkout();
    }
    public String printWorkout(UserProfile user1) {
        
        
        if (user1.getGoal() == "Build Muscle") {
            listWorkout = strength1.loopThroughWorkout();
        }
        else if (user1.getGoal() == "Increase Endurance") {
            listWorkout = endurance1.loopThroughWorkout();
        }
        else {
            listWorkout = loseweight1.loopThroughWorkout();
        }
        return listWorkout;
    }
    
    public double getWorkoutCals(UserProfile user1) {
        double calsburned = 0;
        if (user1.getGoal() == "Build Muscle") {
            calsburned = strength1.getWorkCalories();
        }
        else if (user1.getGoal() == "Increase Endurance") {
            calsburned = endurance1.getWorkCalories();
        }
        else {
            calsburned = loseweight1.getWorkCalories();
        }
        return calsburned;
    }
}
