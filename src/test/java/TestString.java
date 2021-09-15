public class TestString {
    public static void main(String[] args) {
        splitTest();
        charAtTest();
        lastIndexOftest();
        indexOf();
    }

    public static void splitTest() {
        String[] expected = {"два", "слова"};
        Assertion.assertEquals("TestString.splitTest", expected, "два слова".split(" "));
    }

    public static void charAtTest() {
        char expected = 'о';
        Assertion.assertEquals("TestString.charAtTest", expected, "абоба".charAt(2));
    }

    public static void lastIndexOftest() {
        int expected = 4;
        Assertion.assertEquals("TestString.lastIndexOftest", expected, "теспир".lastIndexOf('и'));
    }

    public static void indexOf(){
        int expected = 3;
        Assertion.assertEquals("TestString.indexOf",expected,"aбчихба".indexOf('и'));
    }
}
