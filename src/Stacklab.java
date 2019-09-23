import java.util.Deque;
import java.util.LinkedList;

public class Stacklab
{
    private static boolean isOpen(char ch)
    {
        if (ch == '(' || ch == '{' || ch == '[' || ch == '<')
        {
            return true;
        }
        else
            {
                return false;
            }
    }

    private static boolean isClose(char ch)
    {
        if (ch == ')' || ch == '}' || ch == ']' || ch == '>')
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    private static boolean areMatching(char c1, char c2)
    {
       if (c1 == '(' && c2 == ')' || c1 == '{' && c2 == '}' || c1 == '[' && c2 == ']' || c1 == '<' && c2 == '>')
       {
           return true;
       }
       else
           {
                return false;
           }
    }

    public static boolean isBalanced(String expression)
    {
        Deque<Character> stack = new LinkedList();
        boolean balanced = true;
        int index = 0;
        Character topChar = ' ';

        while(balanced && index < expression.length())
        {
            char ch = expression.charAt(index);

            if (isOpen(ch))
            {
                stack.push(ch);
            }
            else if (isClose(ch))
            {

                if(stack.isEmpty())
                {
                    balanced = false;
                }
                else
                    topChar = stack.pop();

                if(!areMatching(topChar,ch))    //this line makes no sense to me
                {
                    balanced=false;
                }
            }
            index++;
        }
        if(balanced && stack.isEmpty())
        {
            return true;
        }
        else
            return false;
    }
}
