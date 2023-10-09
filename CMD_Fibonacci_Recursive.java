import java.util.Scanner;

/**Java CMD program for printing Fibonacci series from 0 to input(number_Of_Series) with a recursive method.
* using Java version 1.8.0
* @version : 1.0
* @license: MIT License
* @author : Arman Azarnik
* contact me at : armanazarnik@gmail.com
*/
public class CMD_Fibonacci_Recursive{

    /** main class for interacting with the user */
    public static void main(String[] args){

        /** while loop to keep the program running */
        while(true){
            System.out.println("Please enter the number of Fibonacci series :");
            Scanner input = new Scanner(System.in);

            /** reading the next integer number and storing it in an integer variable*/
            int number_Of_Series=input.nextInt();
            System.out.println("Your Fibonacci serie :");

            /** passing the number_Of_Series to Fibonacci_Serie_Generator_Loop method and storing the result in result array of long data type */
            long[] result = store_Fibonacci_series_in_array(number_Of_Series);
            long_Array_printer(result);
            System.out.println("**************************************************");
        }
    }  

    /** 
     * method for generating the Fibonacci series with a recursive method.
     * @param number  int number of series
     * @return Fibonacci serie number with long data type 
     * <pre>
     *      Fibonacci_Serie_Generator_Recursive(0); // Output: 
     *      Fibonacci_Serie_Generator_Recursive(6); // Output: 5
     * </pre>
    */
    public static long Fibonacci_Serie_Generator_Recursive(int number){
        if(number == 1)
            return 0;

        else if(number == 2)
            return 1;

        else
            return Fibonacci_Serie_Generator_Recursive(number - 1) + Fibonacci_Serie_Generator_Recursive(number - 2);
    } 

    /** 
     * method for storing the generated Fibonacci series into an array of integers.
     * @param number  number of Fibonacci serie
     * @return Fibonacci_Series   a long data type array of Fibonacci series     
     * <pre>
     *      store_Fibonacci_series_in_array(0); // Output: []
     *      store_Fibonacci_series_in_array(5); // Output: [0, 1, 1, 2, 3]
     * </pre>
    */
    public static long[] store_Fibonacci_series_in_array(int number){
        long[] Fibonacci_Series = new long[number];
        for(int i=0; i<number; i++){
            Fibonacci_Series[i] = Fibonacci_Serie_Generator_Recursive(i+1);
        }
        return Fibonacci_Series;
    }

    /** 
     * method for printing each array long data type element in a line.
     * @param array  array of long data type
     * <pre>
     *      long[] array_1 = [];
     *      long[] array_2 = [3, 7]
     *      long_Array_printer(array_1); // Output: 
     *      long_Array_printer(array_2); // Output: 3
     *                                             7
     * </pre>
    */
    public static void long_Array_printer(long[] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}