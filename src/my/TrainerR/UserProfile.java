package my.TrainerR;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Class for creating a user profile. Contains methods to set and get all
 * relevant traits, as well as a method to add  it to a file for future access.
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
    
    public void setTo(UserProfile user) {
        this.user = user.getUser();
        this.password = user.getPassword();
        this.age = user.getAge();
        this.height = user.getHeight();
        this.weight = user.getWeight();
        this.sex = user.getSex();
        this.goal = user.getGoal();
    }
    
        public void save() { //Saves this UserProfile object using the ProfileSaver class.

        ProfileSaver profileSaver = new ProfileSaver();
        profileSaver.saveProfile(this);

        if (profileSaver.isProfileSaved()) {
            System.out.println("Profile saved successfully in the user's home folder."); //If the file has been saved successfully, a message is printed to the console.
        } else {
            System.out.println("Error: The profile could not be saved in the user's home folder.");
        }
    }
}

