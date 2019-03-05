import java.io.*;
import static java.lang.System.*;
import java.lang.Math;
import java.util.Scanner;

class Main6{


     public static void main(String str[]) throws IOException {
Scanner scan = new Scanner(System.in);
System.out.println("Enter the first String:");
String inp = scan.nextLine();
System.out.println("Enter the pivot String:");
String pivot = scan.nextLine();
pivot = pivot.trim();
int bpivind = -1;
bpivind = inp.indexOf(pivot);
if(bpivind == -1) {
 System.out.println("Error: Pivot String not found."); 
}
else{
int epivind = bpivind + (pivot.length()) - 1;
String pt1 = "";
String pt2 = "";
for(int i = 0; i < bpivind; i++) {
  pt1 = pt1 + inp.charAt(i);
}
for(int i = epivind + 1; i < inp.length(); i++) {
  pt2 = pt2 + inp.charAt(i);
}
int count = inp.length() - inp.replace(" ", "").length();
String fin = "";
if(count == 0){
fin = pt2 + pivot + pt1;
}
else{
  fin = pt2 + " " + pivot + " " + pt1;
}
fin = fin.trim();
System.out.println(fin);
}
}
}