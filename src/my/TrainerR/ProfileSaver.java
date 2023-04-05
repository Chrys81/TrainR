package my.TrainerR;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * This class is responsible for saving user profiles to a file.
 */
public class ProfileSaver {

    // Saves a UserProfile object to a file named "user_profiles.txt".
    //Each field of the UserProfile object is written as a comma-separated value (CSV).
    //A new line is added after each UserProfile object. 
  
    public void saveProfile(UserProfile userProfile) {
        String fileName = "user_profiles.txt";
        String lineSeparator = System.getProperty("line.separator");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true))) {
            bw.write(userProfile.getUser() + "," + userProfile.getPassword() + "," + userProfile.getAge() + "," + userProfile.getHeight() + "," + userProfile.getWeight() + "," + userProfile.getSex() + "," + userProfile.getGoal());
            bw.write(lineSeparator);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
