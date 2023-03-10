/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.TrainerR;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author criiz
 */
public class Main {
    int x = 69;
    public void setX(int num){
        x = num;
    }
    public static String[] workouts(String[] args) {
        // Create a new HashMap to store the data
        Map<String, String[]> workoutMap = new HashMap<>();

        // Add the keys and empty string arrays as values
        workoutMap.put("Lose Weight", new String[]{"Burpees", "Jumping Jacks", "Squats", "Push-Ups"});
        workoutMap.put("Gain muscle", new String[]{"Bench Presses", "Deadlifts", "Pull-Ups", "Curls"});
        workoutMap.put("Stamina", new String[]{"Planks", "Mountain Climbers", "Lunges",  "Crunches"});

        // Print the map to check the result
        return workoutMap.get(arg);
    }
}
