import java.io.*;
import static java.lang.System.*;
import java.lang.Math;
import java.util.Scanner;
import java.util.ArrayList;

public class Lesson_17_Activity{
  public static boolean isSorted(int [] a){
    boolean sorted = true;
    for(int i = 0; i < a.length-1; i++){
      if(a[i] > a[i+1]){
        sorted = false;
      }
    }
    return sorted;
  }
  public static int binarySearch(int [] a, int b){
    int mid = 0;
    int high = a.length;
    int low = 0;
    while(!((a[mid] == b)||(high < low))){
      mid = (high + low)/2;
      if(a[mid] < b){
       high = mid - 1; 
      }
      if(a[mid] > b){
       low = mid + 1; 
      }
    }
    return mid;
  }
}