import java.io.*;
import static java.lang.System.*;
import java.lang.Math;
import java.util.Scanner;

class MainAlien{

     public static void main(String str[]) throws IOException {
Scanner scan = new Scanner(System.in);
System.out.println("Enter message board post:");
String mbpost = scan.nextLine();
int ind = mbpost.indexOf("-");
String mbpost2 = mbpost.substring(ind + 1);
String s = mbpost2.toLowerCase();
String un = mbpost.substring(0, ind - 1);
int a = 0;
int b = 0;
int c = 0;
String newstra = s.replace(" ^^ ", "");
String newstrb = s.replace(" qey ", "");
String newstrc = s.replace(" $ ", "");
a = (s.length() - newstra.length())/(3);
b = (s.length() - newstrb.length())/(4);
c = (s.length() - newstrc.length())/(2);
System.out.println("Results:");
if(a > 0||b > 0||c > 0){
System.out.println("BAD");
System.out.println(un);
System.out.println("^^: " + a + "\nqey: " + b + "\n$: " + c);
}

else{
 System.out.println("CLEAN"); 
}

}
}

