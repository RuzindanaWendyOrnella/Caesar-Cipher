
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException {
        boolean codeRunning = true;

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while (codeRunning) {
            System.out.println("Do You Want To decrypt or encrypt your word? or you just want to exit?");

            String want = bufferedReader.readLine();
            String message = "";

            try {






                if (want.equals("decrypt")) {
                    System.out.println("Enter your word:");
                    message = bufferedReader.readLine();
                    System.out.println("Enter a key value:");
                    int n = Integer.parseInt(bufferedReader.readLine());
                    System.out.println("Text  : " + message);
                    System.out.println("Key value : " + n);
                    System.out.println("Decrypted message: " + Decryptation.decrypt(message, n));
                } else if (want.equals("encrypt")) {
                    System.out.println("Enter your word:");
                    message = bufferedReader.readLine();
                    System.out.println("Enter a key value:");
                    int n = Integer.parseInt(bufferedReader.readLine());
                    System.out.println("Text  : " + message);
                    System.out.println("Key value : " + n);
                    System.out.println("Encrypted message: " + Encryptation.encrypt(message, n));
                }
                else if(want.equals("exit")){
                    System.out.println("Are you really sure you want to exit?this action is irreversible!type" +
                            " yes if you want to and no if you made up your mind");
                    String answer=bufferedReader.readLine();
                    if(answer.equals("yes")){
                        System.out.println("Ciao!!!!!!!");
                        codeRunning = false;
                    }
                    else if(answer.equals("no")){
                        System.out.println("continue enjoying your caesar experience!");
                        codeRunning=true;
                    }
                    else{
                        System.out.println("Wrong Input!!!!!!");
                    }
                }
                else {
                    System.out.println("I'm really sorry but we don't recognize your input");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }


        }
    }
}
