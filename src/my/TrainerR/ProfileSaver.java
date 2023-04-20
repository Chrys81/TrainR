package my.TrainerR;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

/**
 * Saves user profiles to a text file in the home directory.
 */
public class ProfileSaver {
     // Saves a UserProfile object to a file named "user_profiles.txt" in the user's home directory.
     // Each field of the UserProfile object is written as a comma-separated value (CSV).
     // A new line is added after each UserProfile object.
    
    /**
     * Saves the profile data to a user named file in the home directory.
     * @param userProfile an object of type UserProfile that is being saved to the text file.
     */
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
    /**
     * Checks if the "user_profiles.txt" file exists in the user's home directory.
     * @return true if the file exists.
     */
    public boolean isProfileSaved() {
        String userHome = System.getProperty("user.home");
        String fileName = userHome + File.separator + "user_profiles.txt";
        File file = new File(fileName);
        return file.exists();
    }
}
