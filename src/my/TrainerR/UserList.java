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
 *
 * @author alexa
 */
public class UserList {
    int n = 1;
    ArrayList<UserProfile> userList = new ArrayList<UserProfile>();
    UserProfile tempUser = new UserProfile();
    
    public void read_users() {
    try {
      File raw_Text = new File("user_profiles.txt");
      Scanner profileReader = new Scanner(raw_Text);
      while (profileReader.hasNextLine()) {
        String profileData = profileReader.nextLine();
        String[] profileDataArr = profileData.split(",");
        System.out.println(profileDataArr[1]);
        tempUser.setUser(profileDataArr[0]);
        tempUser.setPassword(profileDataArr[1]);
        tempUser.setAge(profileDataArr[2]);
        tempUser.setHeight(Integer.parseInt(profileDataArr[3]));
        tempUser.setWeight(profileDataArr[3]);
        //tempUser.setSex(profileDataArr[])
      }
      profileReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
}
}

