//Author - Satyam Ramawat
//https://www.geeksforgeeks.org/python-set-operations-union-intersection-difference-symmetric-difference/

import java.io.*;
import java.util.*;

class SetManipulation
{
  public int removeDuplicateElements(int set[],int size)
  {
    int[] temp = new int[size];  
          int j = 0;  
          for (int i=0; i<size-1; i++){  
            if (set[i] != set[i+1]){  
                temp[j++] = set[i];  
            }  
         }  
        temp[j++] = set[size-1];     
        
        for (int i=0; i<j; i++){  
          set[i] = temp[i];  
        }  

    return j;
  }

void setOneOrsetTwo(int[] arrayOne,int[] arrayTwo){
    Set<Integer> obj = new HashSet<>();
    int i,j;
    for(i=0; i<arrayOne.length; i++){
        obj.add(arrayOne[i]);
    }
    for(j=0; j<arrayTwo.length; j++){
        obj.add(arrayTwo[j]);
    }
    System.out.println("A Or B operation is");
    System.out.print("{");
    for(Integer I: obj){
        System.out.print(I + ", ");
    }
    System.out.println("}");
}

void setOneAndsetTwo(int[] arrayOne,int[] arrayTwo){
  Set<Integer> obj = new HashSet<>();
  int i,j;
  obj.clear();
  System.out.println("\nA And B Operation");
  for(i=0; i<arrayOne.length; i++){
      obj.add(arrayOne[i]);
  }
  System.out.print("{");
  for(j=0; j<arrayTwo.length; j++){
      if(obj.contains(arrayTwo[j]))
          System.out.print(arrayTwo[j]+", ");
  }
  System.out.println("}");
}

void AMinusB(int[] arrayOne,int[] arrayTwo){
  Set<Integer> a = new HashSet<>();
  Set<Integer> b = new HashSet<>();
  int i,j;
  for(i=0; i<arrayOne.length; i++){
      a.add(arrayOne[i]);}
  for(i=0;i<arrayTwo.length;i++){
    b.add(arrayTwo[i]);}

    Set<Integer> difference = new HashSet<Integer>(a); 
    difference.removeAll(b); 
    System.out.print("Difference of the two Set A - B"); 
    System.out.println(difference); 
}

void BMinusA(int[] arrayOne,int[] arrayTwo){
  Set<Integer> a = new HashSet<>();
  Set<Integer> b = new HashSet<>();
  int i,j;
  for(i=0; i<arrayOne.length; i++){
      a.add(arrayOne[i]);}
  for(i=0;i<arrayTwo.length;i++){
    b.add(arrayTwo[i]);}
    Set<Integer> difference = new HashSet<Integer>(b); 
    difference.removeAll(a); 
    System.out.print("Difference of the two Set B - A"); 
    System.out.println(difference); 
}  
      public static void main(String[] args){
          int set_size_1,set_size_2;
          Scanner scan = new Scanner(System.in);
          set_size_1=scan.nextInt();
          set_size_2=scan.nextInt();
          
          int[] set_1=new int[set_size_1];
          int[] set_2=new int[set_size_2];
          
          for(int i=0;i<set_size_1;i++)
              set_1[i]=scan.nextInt();
          for(int i=0;i<set_size_2;i++)
              set_2[i]=scan.nextInt();
          
          int operation=scan.nextInt();    
          
          SetManipulation t1=new SetManipulation();
          SetManipulation t2=new SetManipulation();
          SetManipulation t3=new SetManipulation();
          int set1_length=t1.removeDuplicateElements(set_1,set_size_1);
          int set2_length=t2.removeDuplicateElements(set_2,set_size_2);

          switch (operation) { 
            case 1: 
                t3.setOneAndsetTwo(set_1,set_2); 
                break; 
            case 2: 
                t3.setOneOrsetTwo(set_1,set_2);
                break;    
            case 3:
                t3.AMinusB(set_1,set_2); 
                break;
            case 4:
                t3.BMinusA(set_1,set_2);
            } 
      }
  }