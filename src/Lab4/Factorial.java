package Lab4;
// Factorial.java
// Recursive factorial method

import org.w3c.dom.Node;

public class Factorial {

   public static void main(String[] args)
   {
      System.out.println(factorial(5));
   }
   
   // Recursive definition of method factorial
   public static int factorial( int n )
   {      
      if ( n == 1 || n == 0 )  // base case
         return 1;
      else {
         int result = n * factorial(n-1); 
         return result;
      }
   }



}

