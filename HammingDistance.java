//AUTHOR - SATYAM RAMAWAT
//https://www.geeksforgeeks.org/hamming-distance-between-two-integers/
/*Given two integers, the task is to find the hamming distance between two integers. 
Hamming Distance between two integers is the number of bits which are different at same position in both numbers.*/

import java.io.*;
import java.util.*;

class HammingDistance
{
  public static void main(String[] args)
  {
    int EIGHT_BIT=8,hamming_distance=0,no_1,no_2;
    Scanner scan = new Scanner(System.in);
    System.out.println("Please Enter First Number");
    no_1=scan.nextInt();

    System.out.println("Please Enter Second Number");
    no_2=scan.nextInt();
    
    int first_number=no_1;
    int second_number=no_2;

    int[] binary_array_one= new int[EIGHT_BIT];
    int[] binary_array_two= new int[EIGHT_BIT];

    
    for(int i=0;i<7;i++)
    {
     int binary_one=first_number%2;
     first_number=first_number/2;
     binary_array_one[i]=binary_one;

     int binary_two=second_number%2;
     second_number=second_number/2;
     binary_array_two[i]=binary_two;
    }

    for(int i=0;i<EIGHT_BIT;i++)
    {
     if(binary_array_one[i]!=binary_array_two[i])
        hamming_distance++;
    }
    System.out.println("Hamming Distance between "+no_1+" and " +no_2+" is: "+hamming_distance);
}}
