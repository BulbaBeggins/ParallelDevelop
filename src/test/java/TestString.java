public class TestString {
    public static void main(String[] args) {
        splitTest();
    }

    public static void splitTest() {
        String[] expected = {"два", "слова"};
        Assertion.assertEquals("TestString.splitTest", expected, "два слова".split(" "));
    }
}
