import java.util.*;
import solutions.*;

public class Main {
   // Fibonacci series using recursion
/*
1. Write a program to check if a number is prime.
2. Reverse a string without using built-in functions.
3. Find the second highest number in an array.
4. Write a program to count vowels in a string.
5. Implement a simple class with encapsulation.
 */


    public static void main(String[] args) {

     int [] array = {5, 2, 6, 1, 1, 25, 20 };
     int n = 6;
     String a = "teacher is a intelligent person";
     String s = "teacher";
     String number = String.valueOf(n);
     int length = a.length();
     char result = ' ';
     List<String> list = List.of("0 1 L", "2 4 R");
     String input = "teacher";
     System.out.println(new Problem_001().shiftAlphabet(input, list));
    }
}