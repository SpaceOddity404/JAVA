/*
 * Amplify AP CS MOOC - Term 2, Lesson 14 
 * Rebecca Dovi 
 */
import java.io.*;
import java.util.*;

class Main
{

 /*
  * Returns the number of Strings in the input list that start with the given
  * letter. Implementation should use linear search, and ignore the case of
  * the input letter.
  */
 public static int countLetter(ArrayList<String> list, String letter)
 {
   int num = 0;
   
   for(String s: list){
       for(int j = 0; j < s.length(); j ++){
         
    if(s.charAt(j) == letter.charAt(0)) {
        num++;
    } 

       }
     }
   
   return num;
 }

 public static void main(String str[]) throws IOException
 {
  /*
   * Initialize an ArrayList of animals called zoo.
   */
  ArrayList<String> zoo = new ArrayList<String>();
  zoo.add("Zebra");
  zoo.add("Ardvark");
  zoo.add("Emu");
  zoo.add("Hippo");
  zoo.add("Aligator");
  zoo.add("Lion");
  zoo.add("Giraffe");
  zoo.add("Seal");
  zoo.add("Tiger");
  zoo.add("Elephant");

  /*
   * Print the contents of the zoo.
   */
  System.out.println(zoo);
  System.out.println("A: " + countLetter(zoo, "A"));
  System.out.println("B: " + countLetter(zoo, "B"));
  System.out.println("C: " + countLetter(zoo, "C"));
  System.out.println("L: " + countLetter(zoo, "L"));
  System.out.println("T: " + countLetter(zoo, "T"));

  System.out.println("a: " + countLetter(zoo, "a"));
  System.out.println("b: " + countLetter(zoo, "b"));
  System.out.println("c: " + countLetter(zoo, "c"));
  System.out.println("l: " + countLetter(zoo, "l"));
  System.out.println("t: " + countLetter(zoo, "t"));
 }
}
