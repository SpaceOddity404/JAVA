import java.util.Scanner;
import java.lang.Math;
import java.util.*;

public class Lesson_15_Activity
{
  
  public static void sortAndPrint(String [] list)
  {
    for (int i = 0; i <= list.length-1; i++)
    {
      String temp = list[i];
      for (int j = i+1; j <= list.length-1; j++)
      {
        if (list[i].compareTo(list[j]) > -1)
        {
          list[i] = list[j];
          list[j] = temp;
        }
      }
    }
    for(int i = 0; i < list.length; i++)
    System.out.print(list[i] + " ");
  }
  public static void main (String[] args)
  {
    String [] list = { "against" , "forms" , "belief" , "government" , "democratic" , "movement" , "understanding"};
    sortAndPrint(list);
    
        
}
}