package my.TrainerR;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Creates a user profile. 
 * Contains methods to set and get all relevant traits, as well as a method to add  it to a file for future access.
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
    
    /**
     * Initializes the profile with default info.
     */
    public UserProfile() {
        this.user = "blank";
        this.password = "password";
        this.age = 0;
        this.height = 0;
        this.weight = 0;
        this.sex = "Male";
        this.goal = "Build Muscle";
    }
    
    /**
     * Returns the user of the profile.
     * @return user
     */
    public String getUser() {
        return user;
    }
    
    /**
     * Sets the user of the profile.
     * @param user 
     */
    public void setUser(String user) {
        this.user = user;
    }
    
    /**
     * Returns the password of the profile.
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the password of the profile.
     * @param password 
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Returns the age of the profile.
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the age of the profile.
     * @param ageS 
     */
    public void setAge(String ageS) {
        this.age = Integer.parseInt(ageS);
    }

    /**
     * Returns the height of the profile.
     * @return height
     */
    public int getHeight() {
        return height;
    }

    /**
     * Sets the height of the profile.
     * @param height 
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * Returns the weight of the profile.
     * @return weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Sets the weight of the profile.
     * @param weightS 
     */
    public void setWeight(String weightS) {
        this.weight = Integer.parseInt(weightS);
    }

    /**
     * Returns the sex of the profile.
     * @return sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * Sets the sex of the profile.
     * @param sex 
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * Returns the goal of the profile.
     * @return goal
     */
    public String getGoal() {
        return goal;
    }

    /**
     * Sets the goal of the profile.
     * @param goal 
     */
    public void setGoal(String goal) {
        this.goal = goal;
    }
    
    /**
     * Sets all of the fields of the profile to specified inputs.
     * @param user 
     */
    public void setTo(UserProfile user) {
        this.user = user.getUser();
        this.password = user.getPassword();
        this.age = user.getAge();
        this.height = user.getHeight();
        this.weight = user.getWeight();
        this.sex = user.getSex();
        this.goal = user.getGoal();
    }
    
    /**
     * Saves this UserProfile object using the ProfileSaver class.
     */
    public void save() {
        ProfileSaver profileSaver = new ProfileSaver();
        profileSaver.saveProfile(this);

        if (profileSaver.isProfileSaved()) {
            System.out.println("Profile saved successfully in the user's home folder."); //If the file has been saved successfully, a message is printed to the console.
        } else {
            System.out.println("Error: The profile could not be saved in the user's home folder.");
        }
    }
}

