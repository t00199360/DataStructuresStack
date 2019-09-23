import static org.junit.jupiter.api.Assertions.*;

class StacklabTest {

    @org.junit.jupiter.api.Test
    void isBalanced()
    {
        String s1 ="(a+b * (c/(d–e))) + (d/e)";
        boolean actual = Stacklab.isBalanced(s1);
        boolean expected = true;
        assertEquals(expected, actual);

        s1 ="(a+b * {c/(d–e))) + (d/e)";
        actual = Stacklab.isBalanced(s1);
        expected = false;
        assertEquals(expected, actual);

        s1 ="(a+b]";
        actual = Stacklab.isBalanced(s1);
        expected = false;
        assertEquals(expected, actual);

        s1 ="(a+b * (c/(d–e)) + (d/e)";
        actual = Stacklab.isBalanced(s1);
        expected = false;
        assertEquals(expected, actual);

    }

}