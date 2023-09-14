import java.io.FileWriter;
import java.io.IOException;


public class RegisterFile implements RegisterInterface {
    private static final String FILE_NAME = "user_data.txt";

    @Override
    public boolean registerUser(String username, String password){
        if (username.isEmpty() || password.isEmpty()) 
        {
            System.out.println("Username or password can't be empty.");
            return false;
        } else {
            try {
                
                FileWriter writer = new FileWriter(FILE_NAME, true); 
                writer.write(username + "," + password + "\n");
                writer.close();
                System.out.println("Registration successful!");
                return true;

            } catch (IOException e) {
                e.printStackTrace();
                return false;
            }
        }

    }
    
}
