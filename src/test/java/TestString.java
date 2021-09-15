public class TestString {
    public static void main(String[] args) {
        splitTest();
        charAtTest();
    }

    public static void splitTest() {
        String[] expected = {"два", "слова"};
        Assertion.assertEquals("TestString.splitTest", expected, "два слова".split(" "));
    }
    public static void charAtTest(){
        char expected = 'о';
        Assertion.assertEquals("TestString.charAtTest",expected,"абоба".charAt(2));
    }
}
