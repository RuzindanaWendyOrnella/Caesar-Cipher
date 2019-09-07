import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("I'm a ping-pong application!");
        System.out.println("Enter a word:");
        try {
            String stringUserNumber = bufferedReader.readLine();
            int intUserNumber = Integer.parseInt(stringUserNumber);
            Caesar testCaesar = new Caesar();
            ArrayList<Object> output = new ArrayList<Object>();
            System.out.println(output);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
