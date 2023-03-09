/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.TrainerR;

/**
 *
 * @author NX1
 */
public class ProfileBank {
    private String user;
    private String password;
    private int age;
    private int height;
    private int weight;
    private String sex;
    private String goal;
    
    // Constructor to initialize all fields
    public ProfileBank(String user, String password, int age, int height, int weight, String sex, String goal) {
        this.user = user;
        this.password = password;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.sex = sex;
        this.goal = goal;
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

    public void setAge(int age) {
        this.age = age;
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

    public void setWeight(int weight) {
        this.weight = weight;
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
}

