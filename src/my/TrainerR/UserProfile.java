/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
package my.TrainerR;

/**
 *
 * @author NX1
 */
public class UserProfile {
    private String user;
    private String password;
    private int age;
    private int height;
    private int weight;
    private String sex;
    private String goal;
    
    // Constructor to initialize all fields
    public UserProfile() {
        this.user = "blank";
        this.password = "password";
        this.age = 0;
        this.height = 0;
        this.weight = 0;
        this.sex = "Male";
        this.goal = "Build Muscle";
    }
    
    // Getters and Setters for all fields
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(String ageS) {
        this.age = Integer.parseInt(ageS);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(String weightS) {
        this.weight = Integer.parseInt(weightS);
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }
    
    public void saveProfile() { // function that saves the table to a file
        String fileName = "user_profiles.txt";
        String lineSeparator = System.getProperty("line.separator"); 

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true))) {
            bw.write(user + "," + password + "," + age + "," + height + "," + weight + "," + sex + "," + goal); //writes fields to file with commas sepreating them
            bw.write(lineSeparator); // starts new line
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

