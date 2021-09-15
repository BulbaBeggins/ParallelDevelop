import java.util.Arrays;

public class Assertion {
    public static void assertEquals(String msg, Object expected, Object actual) {
        if (expected.equals(actual)) {
            System.out.printf("%s passed", msg);
        } else {
            System.out.printf("%s fail expected: %s, actual: %s", msg, expected, actual);
        }
        System.out.println();
    }

    public static void assertEquals(String msg, Object[] expected, Object[] actual) {
        if (Arrays.equals(expected, actual)) {
            System.out.printf("%s passed", msg);
        } else {
            System.out.printf("%s fail expected: %s, actual: %s", msg, Arrays.toString(expected),  Arrays.toString(actual));
        }
        System.out.println();
    }

    public static void assertEquals(String msg, int expected, int actual) {
        if (expected == actual) {
            System.out.printf("%s passed", msg);
        } else {
            System.out.printf("%s fail expected: %d, actual: %d", msg, expected,  actual);
        }
        System.out.println();
    }
}
