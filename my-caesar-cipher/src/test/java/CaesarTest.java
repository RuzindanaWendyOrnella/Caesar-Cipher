import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
public class CaesarTest {
    @Test
    public void isCaesar_countUpToZ_ArrayList() {
        Caesar Counter = new Caesar();
        List<Object> expectedOutput = new ArrayList<Object>();

            expectedOutput.add("a");
            expectedOutput.add("b");
            expectedOutput.add("c");
            expectedOutput.add("d");
            expectedOutput.add("e");
            expectedOutput.add("f");
            expectedOutput.add("g");
            expectedOutput.add("h");
        assertEquals(expectedOutput, Counter.isCaesar("h"));
    }

//    @Test
//    public void isCaesar_movingCharOne_ArrayList() {
//        Caesar CharOne = new Caesar();
//        List<Object> expectedOutput = new ArrayList<Object>();
//        expectedOutput.add("i");
//        expectedOutput.toString();
//        toString().substring(0,2);
//    }

    @Test
    public void isCaesar_isString_ArrayList() {
        // test code will eventually go here.
        Caesar testCaesar = new Caesar();
        assertEquals(true, testCaesar.isString());
    }

}