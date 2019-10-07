package Lab4;

public class myArrays
{
    public static int findSmallest(int[] array)
    {
        return findSmallest(array, array.length-1);
    }

    private static int findSmallest(int[] array, int lastIndex)
    {
        if(lastIndex==0)
        {
            return array[lastIndex];
        }
        else
        {
            int small = findSmallest(array, lastIndex-1);
            if(small<array[lastIndex])
            {
                return small;
            }
            else
                {
                    return array[lastIndex];
                }
        }
    }
}
