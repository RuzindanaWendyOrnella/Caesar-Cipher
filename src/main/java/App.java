
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Do You Want To decrypt or encrypt your word?");
        String want=bufferedReader.readLine();
        String message = "";
        try {


            System.out.println("Enter your word:");
            message = bufferedReader.readLine();
            System.out.println("Enter a key value:");

            int n= Integer.parseInt(bufferedReader.readLine());

            if(want.equals("decrypt")){
            System.out.println("Text  : " + message);
            System.out.println("Key value : " + n);
//           System.out.println("Encrypted message: " + Encryptation.encrypt(message, n));
           System.out.println("Decrypted message: " + Decryptation.decrypt(message, n));}
            else if(want.equals("encrypt")){
                System.out.println("Text  : " + message);
                System.out.println("Key value : " + n);
           System.out.println("Encrypted message: " + Encryptation.encrypt(message, n));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
