/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.TrainerR;

/**
 * A goal stores all of the workouts for access by other classes or methods.
 * @author alexa
 * @see Workout
 */
public class Goal {
    private String listWorkout;
    
    private Workout strength1 = new Workout();
    private Workout strength2 = new Workout();
    private Workout strength3 = new Workout();
    private Workout endurance1 = new Workout();
    private Workout endurance2 = new Workout();
    private Workout endurance3 = new Workout();
    private Workout loseweight1 = new Workout();
    private Workout loseweight2 = new Workout();
    private Workout loseweight3 = new Workout();
    
    private Exercise benchPress = new Exercise();
    private Exercise inclinePress = new Exercise();
    private Exercise tricepPulldown = new Exercise();
    private Exercise chestFly = new Exercise();
    private Exercise pushUps = new Exercise();
    
    private Exercise pullups = new Exercise();
    private Exercise barbellDeadlifts = new Exercise();
    private Exercise bentBarbellRows = new Exercise();
    private Exercise rearDeltPull = new Exercise();
    private Exercise barbellCurls = new Exercise();
    
    private Exercise barbellLunges = new Exercise();
    private Exercise calfRaises = new Exercise();
    private Exercise adductor = new Exercise();
    private Exercise legCurls = new Exercise();
    
    private Exercise run = new Exercise();
    private Exercise jumpingJacks = new Exercise();
    private Exercise crunches = new Exercise();
    
    private Exercise swimming = new Exercise();
    private Exercise rowingMachine = new Exercise();
    private Exercise stairmaster = new Exercise();
    
    private Exercise squat = new Exercise();
    private Exercise bike = new Exercise();
    
    /**
     * Initializes all of the workouts with different exercises.
     */
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
        pullups.setName("Pull ups 3x5");
        pullups.setCals(90);
        barbellDeadlifts.setName("Barbell Deadlifts 3x10");
        barbellDeadlifts.setCals(100);
        bentBarbellRows.setName("Bent Barbell Rows 4x8");
        bentBarbellRows.setCals(100);
        rearDeltPull.setName("Rear Delt Pull 3x12");
        rearDeltPull.setCals(80);
        barbellCurls.setName("Barbell Curls 3x10");
        swimming.setName("Swim 20 minutes");
        swimming.setCals(400);
        stairmaster.setName("Stairmaster 20 minutes");
        stairmaster.setCals(200);
        rowingMachine.setName("Rowing Machine 3x3 minutes");
        rowingMachine.setCals(250);
        barbellLunges.setName("Barbell Lunges 4x10");
        barbellLunges.setCals(100);
        calfRaises.setName("Calf Raises 3x30");
        calfRaises.setCals(60);
        adductor.setName("Adductor Machine 3x12");
        adductor.setCals(80);
        legCurls.setName("Leg Curls 4x10");
        legCurls.setCals(70);
        
        strength1.AddExercise(benchPress);
        strength1.AddExercise(inclinePress);
        strength1.AddExercise(tricepPulldown);
        strength1.AddExercise(chestFly);
        strength1.AddExercise(pushUps);
        
        strength2.AddExercise(pullups);
        strength2.AddExercise(barbellDeadlifts);
        strength2.AddExercise(bentBarbellRows);
        strength2.AddExercise(rearDeltPull);
        strength2.AddExercise(barbellCurls);
        
        strength3.AddExercise(squat);
        strength3.AddExercise(calfRaises);
        strength3.AddExercise(adductor);
        strength3.AddExercise(legCurls);
        strength3.AddExercise(barbellLunges);
        
        endurance1.AddExercise(run);
        endurance1.AddExercise(crunches);
        endurance1.AddExercise(pushUps);
        endurance1.AddExercise(bike);
        
        endurance2.AddExercise(jumpingJacks);
        endurance2.AddExercise(swimming);
        endurance2.AddExercise(barbellCurls);
        endurance2.AddExercise(stairmaster);
        
        endurance3.AddExercise(run);
        endurance3.AddExercise(barbellLunges);
        endurance3.AddExercise(crunches);
        endurance3.AddExercise(pushUps);
        endurance3.AddExercise(rowingMachine);
        
        loseweight1.AddExercise(squat);
        loseweight1.AddExercise(benchPress);
        loseweight1.AddExercise(jumpingJacks);
        loseweight1.AddExercise(bike);
        
        loseweight2.AddExercise(run);
        loseweight2.AddExercise(barbellLunges);
        loseweight2.AddExercise(jumpingJacks);
        loseweight2.AddExercise(stairmaster);
        loseweight2.AddExercise(pushUps);
        
        loseweight3.AddExercise(swimming);
        loseweight3.AddExercise(barbellCurls);
        loseweight3.AddExercise(chestFly);
        loseweight3.AddExercise(rowingMachine);
        loseweight3.AddExercise(tricepPulldown);
    }
    
    /**
     * Removes all of the exercises from the workouts.
     */
    public void clearWorkout() {
        strength1.clearWorkout();
        strength2.clearWorkout();
        strength3.clearWorkout();
        endurance1.clearWorkout();
        endurance2.clearWorkout();
        endurance3.clearWorkout();
        loseweight1.clearWorkout();
        loseweight2.clearWorkout();
        loseweight3.clearWorkout();
    }
    
    /**
     * Prints out all of the exercises in the workout.
     * @param user1 User the workouts are being accessed by.
     * @param selectedWorkout Workout selected by user.
     * @return Text of all exercises in the workout based on user.
     * @see Workout
     */
    public String printWorkout(UserProfile user1, String selectedWorkout) {
        
        
        if (user1.getGoal().equals("Build Muscle")) {
            if(selectedWorkout.equals("1"))
            {
                listWorkout = strength1.loopThroughWorkout();
            }
            if(selectedWorkout.equals("2"))
            {
                listWorkout = strength2.loopThroughWorkout();
            }
            if(selectedWorkout.equals("3"))
            {
                listWorkout = strength3.loopThroughWorkout();
            }
        }
        else if (user1.getGoal().equals("Increase Endurance")) {
            if(selectedWorkout.equals("1"))
            {
                listWorkout = endurance1.loopThroughWorkout();
            }
            if(selectedWorkout.equals("2"))
            {
                listWorkout = endurance2.loopThroughWorkout();
            }
            if(selectedWorkout.equals("3"))
            {
                listWorkout = endurance3.loopThroughWorkout();
            }
        }
        else {
            if(selectedWorkout.equals("1"))
            {
                listWorkout = loseweight1.loopThroughWorkout();
            }
            if(selectedWorkout.equals("2"))
            {
                listWorkout = loseweight2.loopThroughWorkout();
            }
            if(selectedWorkout.equals("3"))
            {
                listWorkout = loseweight3.loopThroughWorkout();
            }
        }
        return listWorkout;
    }
    
    /**
     * Returns how many calories a workout burns.
     * @param user1 User currently logged in.
     * @param selectedWorkout workout user has selected.
     * @return Number of calories burned in a workout.
     */
    public double getWorkoutCals(UserProfile user1, String selectedWorkout) {
        double calsburned = 0;
        if (user1.getGoal().equals("Build Muscle")) {
            if (selectedWorkout.equals("1")) {
                calsburned = strength1.getWorkCalories();
            }
            if (selectedWorkout.equals("2")) {
                calsburned = strength2.getWorkCalories();
            }
            if (selectedWorkout.equals("3")) {
                calsburned = strength3.getWorkCalories();
            }
        }
        else if (user1.getGoal().equals("Increase Endurance")) {
            if (selectedWorkout.equals("1")) {
                calsburned = endurance1.getWorkCalories();
            }
            if (selectedWorkout.equals("2")) {
                calsburned = endurance2.getWorkCalories();
            }
            if (selectedWorkout.equals("3")) {
                calsburned = endurance3.getWorkCalories();
            }
        }
        else if (user1.getGoal().equals("Lose Weight")){
            if (selectedWorkout.equals("1")) {
                calsburned = loseweight1.getWorkCalories();
            }
            if (selectedWorkout.equals("2")) {
                calsburned = loseweight2.getWorkCalories();
            }
            if (selectedWorkout.equals("3")) {
                calsburned = loseweight3.getWorkCalories();
            }
        }
        return calsburned;
    }
}
