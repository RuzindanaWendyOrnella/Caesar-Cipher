public class Decryptation {
    public static StringBuffer decrypt(String message, int n) {
        StringBuffer result = new StringBuffer();

        for (int i = 0; i < message.length(); i++) {
            if (Character.isUpperCase(message.charAt(i))) {
                char ch = (char) (((int) message.charAt(i) +
                        (26- n) - 65) % 26 + 65);
                result.append(ch);
            } else {
                char ch = (char) (((int) message.charAt(i) +
                        (26- n) - 97) % 26 + 97);
                result.append(ch);
            }
        }
        return result;

    }
}
