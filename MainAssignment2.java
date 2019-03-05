import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;

class MainAssignment2{


     public static void main(String str[]) throws IOException {
Scanner scan = new Scanner(System.in);

System.out.println("Seconds Since Unich Epoch:");
int sec = scan.nextInt();
int y = (int)((double)sec)/(31104000);
int rem = sec - (y * 31104000);
int m = (int)((double)rem)/(2592000);
rem = rem - (m * 2592000);
int d = (int)((double)rem)/(86400);
rem = rem - (d * 86400);
int hour = (int)((double)rem)/(3600);
rem = rem - (hour * 3600);
int min = (int)((double)rem)/(60);
rem = rem - (min * 60);
int s = rem;

System.out.println("Year: " + (1970 + y));
System.out.println("Month: " + m);
System.out.println("Day: " + d);
System.out.println("Hour: " + hour);
System.out.println("Min: " + min);
System.out.println("Sec: " + s);
     }

}
