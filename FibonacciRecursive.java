/*Print Fibonacci series from 0 to input(numberOfSeries) with recursive function*/

import java.util.Scanner;

public class FibonacciRecursive{
    public static int fib(int n){
        if(n==1)
            return 0;
        else if(n==2)
            return 1;
        else
            return fib(n-1)+fib(n-2);
    }
    public static void main(String args []){
        while(true){
            System.out.println("Please enter the number of fibonacci series :");
            Scanner input = new Scanner(System.in);
            int numberOfSeries=input.nextInt();
            System.out.println("*********");
            for(int i=1; i<=numberOfSeries; i++)
                System.out.println(fib(i));
        }
    }   
}


//by Arman Azarnik