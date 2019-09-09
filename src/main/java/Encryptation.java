import java.util.ArrayList;
import java.util.List;

import static jdk.jfr.internal.instrument.JDKEvents.remove;
public class Encryptation {

//    String[] alphabets = {  "a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z" };
//    public boolean isString() {
//        return true;
//    }
//    public boolean isCaesar() { return true; }
//    public ArrayList<Object> isCaesar(String countUpTo) {
//        ArrayList<Object> output = new ArrayList<Object>();
//
//        char c;
//
//        String value;
//        for (c = 'a'; c <= 'z'; c++) {
//            output.add(c + "");
//
//
//        }
//
//        return output;
public static StringBuffer encrypt(String message, int n) {
    StringBuffer result = new StringBuffer();

    for (int i = 0; i < message.length(); i++) {
        if (Character.isUpperCase(message.charAt(i))) {
            char ch = (char) (( message.charAt(i) +
                    n - 65) % 26 + 65);
            result.append(ch);
        } else {
            char ch = (char) (( message.charAt(i) +
                    n - 97) % 26 + 97);
            result.append(ch);
        }
    }
    return result;

}
}
