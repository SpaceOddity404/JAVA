import java.io.*;
import static java.lang.System.*;
import java.lang.Math;
import java.util.Scanner;

class Main7{
  public static String duplicate(String str) {
    int len = str.length();
    String newstr = "";
    String ss = "";
    if(len%2 == 1) {
      for(int i = 0; i < str.length(); i++) {
        for(int j = 0; j < len; j++) {
          ss = str.substring(i, i+1);
          newstr = newstr + ss;
        }
      }
    }
  return newstr;
  }
  public static boolean isEdhesivePalindrome(String pal) {
   boolean is = false;
   pal = pal.toLowerCase();
   int n = (int)((pal.length())/2);
   
    String reverse = ""; 
      int length = pal.length();
 
      for ( int i = length - 1; i >= 0; i-- )
         reverse = reverse + pal.charAt(i);
 
      if (pal.equals(reverse))
         is = true;
     
   
   else{
    is = false; 
   }
   return is;
  }
  public static double numberScramble(double num){
    if(num >= 0){
    num = num + 5;
   num = num/2;
   num = Math.sqrt(num);
    }
    else{
      num = 0;
    }
    return num;
  }
  public static void main(String str[]) throws IOException {
Scanner scan = new Scanner(System.in);
System.out.println("Welcome to the Methods Sampler Platter. Please enter a String to duplicate.");
String dup = scan.nextLine();
dup = duplicate(dup);
System.out.println("The duplicated String is: " + dup);
System.out.println("Next, please enter a String to check for Edhesive Palindromes.");
String pals = scan.nextLine();
boolean b = isEdhesivePalindrome(pals);
if(b == true)
  System.out.println("Nice, you found an Edhesive Palindrome!");
else
  System.out.println("Too bad, that isn’t an Edhesive Palindrome.");
System.out.println("Almost done! Please enter a number to scramble.");
double n = scan.nextDouble();
n = numberScramble(n);
System.out.println("The scrambled number is: " + n);
  }
}
