/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.TrainerR;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Manages the list of saved users in the external file.
 * @author alexa
 * @see UserProfile
 * @see ProfileSaver
 */
public class UserList {
    int n = 0;
    ArrayList<UserProfile> userList = new ArrayList<UserProfile>();
    
    UserProfile blankUser = new UserProfile();
    
    /**
     * Reads all of the users and their data from the external save file.
     */
    public void read_users() {
        try {
          File raw_Text = new File("user_profiles.txt");
          Scanner profileReader = new Scanner(raw_Text);
          while (profileReader.hasNextLine()) {
            UserProfile tempUser = new UserProfile();
            String profileData = profileReader.nextLine();
            String[] profileDataArr = profileData.split(",");
            tempUser.setUser(profileDataArr[0]);
            tempUser.setPassword(profileDataArr[1]);
            tempUser.setAge(profileDataArr[2]);
            tempUser.setHeight(Integer.parseInt(profileDataArr[3]));
            tempUser.setWeight(profileDataArr[4]);
            tempUser.setSex(profileDataArr[5]);
            tempUser.setGoal(profileDataArr[6]);
            userList.add(tempUser);
            n++;
          }
          profileReader.close();
        } catch (FileNotFoundException e) {
          System.out.println("An error occurred.");
          e.printStackTrace();
        }
    }
    
    /**
     * Prints the list of users ages.
     */
    public void printList() {
        for(int i=0;i<n;i++) {
            System.out.println(userList.get(i).getAge());
        }
    }
    
    /**
     * Searches for a specific username out of the list and returns the index it was found, -1 if not found.
     * @param username
     * @return m
     */
    public int findUsername(String username) {
        int m = 0;
        for (int i=0; i<n; i++) {
            String listUsername = userList.get(i).getUser();
            if (listUsername.equals(username)) {
                m=i;
                break;
            }
            else {
                m=-1;
            }
        }
        return m;
    }
    
    /**
     * Searches for a specific password out of the listand returns the index it was found, -1 if not found.
     * @param password
     * @return m
     */
    public int findPassword(String password) {
        int m = 0;
        for (int i=0; i<n; i++) {
            String listPassword = userList.get(i).getPassword();
            if (listPassword.equals(password)) {
                m=i;
                break;
            }
            else {
                m=-1;
            }
        }
        return m;
    }
    
    /**
     * Sets the active user's info to all of the info found that the specified index.
     * @param index
     * @return activeUser
     */
    public UserProfile getActiveUser(int index) {
        UserProfile activeUser = new UserProfile();
        activeUser.setUser(userList.get(index).getUser());
        activeUser.setPassword(userList.get(index).getPassword());
        activeUser.setAge(String.valueOf(userList.get(index).getAge()));
        activeUser.setHeight(userList.get(index).getHeight());
        activeUser.setWeight(String.valueOf(userList.get(index).getWeight()));
        activeUser.setSex(userList.get(index).getSex());
        activeUser.setGoal(userList.get(index).getGoal());
        
        return activeUser;
    }
}

