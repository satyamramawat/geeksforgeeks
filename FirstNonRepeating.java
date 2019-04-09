//AUTHOR - SATYAM RAMAWAT
//https://www.geeksforgeeks.org/given-a-string-find-its-first-non-repeating-character/
//Given a string, find its first non-repeating character

import java.io.*;
import java.util.*;

class FirstNonRepeating
{
  public static void main(String[] args)
  {
    char[] array = new char[256];
    int[] array_2 = new int[256];
    String name= "geeksforgeeks";
    int len= name.length();

    for (int i=0;i<len;i++){
      array[i]=name.charAt(i);
    }

    for (int i=0;i<len;i++){
      int counter = 0;
      char character = array[i];
      for(int j=0;j<len;j++){
        if(array[j]==character){
          counter++;
        }
      }
      array_2[i]=counter;}
    for(int i=0;i<len;i++){
      if(array_2[i]==1){
        System.out.println(array[i]);
        break;
      }}}}