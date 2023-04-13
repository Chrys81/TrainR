package my.TrainerR;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

//This class is responsible for saving user profiles to a file.
public class ProfileSaver {
     // Saves a UserProfile object to a file named "user_profiles.txt" in the user's home directory.
     // Each field of the UserProfile object is written as a comma-separated value (CSV).
     // A new line is added after each UserProfile object.
    
    public void saveProfile(UserProfile userProfile) {
        String userHome = System.getProperty("user.home");
        String fileName = userHome + File.separator + "user_profiles.txt";
        String lineSeparator = System.getProperty("line.separator");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true))) {
            bw.write(userProfile.getUser() + "," + userProfile.getPassword() + "," + userProfile.getAge() + "," + userProfile.getHeight() + "," + userProfile.getWeight() + "," + userProfile.getSex() + "," + userProfile.getGoal());
            bw.write(lineSeparator);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Checks if the "user_profiles.txt" file exists in the user's home directory.
    public boolean isProfileSaved() {
        String userHome = System.getProperty("user.home");
        String fileName = userHome + File.separator + "user_profiles.txt";
        File file = new File(fileName);
        return file.exists();
    }
}
