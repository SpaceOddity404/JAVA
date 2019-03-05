import java.io.*;
import static java.lang.System.*;
import java.lang.Math;
import java.util.Scanner;
import java.util.ArrayList;

class Main_Lesson_2{
  
  public static void main(String str[]) throws IOException {
Scanner scan = new Scanner(System.in);
ArrayList <String> list = new ArrayList();
String temp = "";
System.out.println("Please enter words, enter STOP to stop the loop");
while(!(temp.equals("STOP"))){
  temp = scan.nextLine();
  list.add(temp);
}
list.remove("STOP");
    for(String a: list){
  if(a.contains("a")){
   System.out.println(a);
  }
}
  }
}