/*Print Fibonacci series from 0 to input(numberOfSeries) with recursive function*/

import java.util.Scanner;

public class FibonacciRecursive{
    public static void main(String args []){
        while(true){
            System.out.println("Please enter the number of fibonacci series :");
            Scanner input = new Scanner(System.in);
            int numberOfSeries=input.nextInt();
            System.out.println("**************************");
            for(int i=1; i<=numberOfSeries; i++)
                System.out.println(fibonacciSerieRecursive(i));
        }
    }  

    public static int fibonacciSerieRecursive(int n){
        if(n == 1)
            return 0;
        else if(n==2)
            return 1;
        else
            return fibonacciSerieRecursive(n-1)+fibonacciSerieRecursive(n-2);
    } 
}


// by Arman Azarnik
// armanazarnik@gmail.com