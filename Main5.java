import java.io.*;
import static java.lang.System.*;
import java.lang.Math;
import java.util.Scanner;

class Main5{


     public static void main(String str[]) throws IOException {
Scanner scan = new Scanner(System.in);
System.out.println("Enter the first String:");
String inp = scan.nextLine();
System.out.println("Enter the pivot String:");
String pivot = scan.nextLine();
String pt1 = "";
String pt2 = "";
int pivnum = -1;
String[] words = inp.split(" ");
for(int i = 0; i < words.length; i++){
  if(words[i].equals(pivot)){
   pivnum = i; 
  }
}
if(pivnum == -1){
 System.out.println("Error: Pivot String not found."); 
}
else{
for(int i = 0; i < pivnum; i++) {
 pt1 = pt1 + " " + words[i];
}
for(int i = (pivnum + 1); i < words.length; i++){
 pt2  = pt2 + " " + words[i]; 
}
System.out.println(pt2 + " "  + words[pivnum] + " " + pt1);

}

}
}


