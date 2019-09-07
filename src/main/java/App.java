
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args)
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a word:");
        String message = null;
        try {
            message = bufferedReader.readLine();
            System.out.println("Enter a key value:");

            int n= Integer.parseInt(bufferedReader.readLine());
            System.out.println("Text  : " + message);
            System.out.println("Key value : " + n);
            System.out.println("Encrypted message: " + Encryptation.encrypt(message, n));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
