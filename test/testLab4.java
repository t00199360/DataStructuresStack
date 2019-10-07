import Lab4.CP3LinkedList;
import Lab4.myArrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testLab4
{

    void isSmallest()
    {
        int[] array1 = {13,4,54,67,8,110};
        int expected = myArrays.findSmallest(array1);
        int actual = 4;

        assertEquals(expected,actual);
    }
}
