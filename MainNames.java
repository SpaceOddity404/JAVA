import java.io.*;
import static java.lang.System.*;
import java.lang.Math;
import java.util.Scanner;
import java.util.Arrays;

class Main{
  
  public static String[] convert(String[]array, int n) {
    for(int i = 0; i < n; i++) {
     array[i] = (array[i]).substring(0,1).toUpperCase() + (array[i]).substring(1).toLowerCase(); 
    }    return array;
  }
  
  public static String[] merge(String array1[], String array2[], int count1, int count2) {
   String[] arrayret = new String[count1 + count2];
   System.arraycopy(array1, 0, arrayret, 0, count1);
   System.arraycopy(array2, 0, arrayret, count1, count2);
    Arrays.sort(arrayret);
    return arrayret;
    
  }
  
  public static void main(String str[]) throws IOException{
Scanner scan = new Scanner(System.in);
String[] arraysubs1 = new String[10000];
String rep = "";
int i = 0;
int count = 0;

System.out.println("Enter the values for the first array, up to 10000 values, enter 'End' to quit");

while(!(rep.toLowerCase()).equals("end")){
 rep = scan.nextLine();
  arraysubs1[i] = rep;
  i++;
  count++;
}


count--;
arraysubs1[count] = "";
i = 0;

String[] arr1 = new String[count];
for(int j = 0; j < count; j++) {
  arr1[j] = arraysubs1[j];
}



System.out.println("Enter the values for the second array, up to 10000 values, enter 'End' to quit");

int count2 = 0;
i = 0;
rep = "";
String[] arraysubs2 = new String[10000];


while(!(rep.toLowerCase()).equals("end")){
 rep = scan.nextLine();
  arraysubs2[i] = rep;
  i++;
  count2++;
}
count2--;
arraysubs2[count2] = "";
i = 0;


String[] arr2 = new String[count];
for(int j = 0; j < count; j++) {
  arr2[j] = arraysubs2[j];
}
String[] arr1sort = new String[count];
String[] arr2sort = new String[count2];
for(int j = 0; j < count; j++) {
 arr1sort[j] = arr1[j]; 
}

Arrays.sort(arr1sort);


System.out.println("First Array");
for(int j = 0; j < count; j++) {
System.out.print(arr1[j]);
if((j != count - 1)) {
 System.out.print(" ");
} 
}

System.out.println("\n\nSecond Array");
for(int j = 0; j < count2; j++) {
System.out.print(arr2[j]);
if((j != count2 - 1)){
 System.out.print(" "); 
}
}
if(Arrays.equals(arr1, arr1sort) && Arrays.equals(arr2, arr2sort)){
String[] arrayfinal = merge(arr1, arr2, count, count2);



System.out.println("\n\nMerged Array");
for(int j = 0; j < (count + count2); j++){
System.out.println(arrayfinal[j]);
if((j != (count + count2 - 1))){
 System.out.print(" "); 
} 
}
}


else{
  System.out.println("\nError: Arrays not in correct order");
}




}
}