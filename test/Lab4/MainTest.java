package Lab4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest
{
    @Test
    void isSmallest()
    {
        int[] array1 = {13,4,54,67,8,110};
        int expected = myArrays.findSmallest(array1);
        int actual = 4;

        assertEquals(expected,actual);
    }

    @Test
    void isSmallestV2()
    {
        int[] array1 = {-16,54,68,110,98,1};
        int expected = myArrays.findSmallest(array1);
        int actual = -16;

        assertEquals(expected,actual);
    }

    @Test
    void isSmallestFail()
    {
        int[] array1 = {-16,54,68,110,98,1};
        int expected = myArrays.findSmallest(array1);
        int actual = -15;

        assertNotEquals(expected,actual);
    }
}