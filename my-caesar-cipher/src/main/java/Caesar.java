import java.util.ArrayList;
import java.util.List;

import static jdk.jfr.internal.instrument.JDKEvents.remove;

public class Caesar {
    public boolean isString() {
        return true;
    }

    public ArrayList<Object> isCaesar(String countUpTo) {
        ArrayList<Object> output = new ArrayList<Object>();
        char c;
        for (c = 'a'; c <= 'i'; ++c) {
            output.add(c + "");


        }

        return output;
    }

}


