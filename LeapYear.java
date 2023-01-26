import java.util.Scanner;
class LeapYear{
public static void main(String args[]){
int n; 
Scanner s1 = new Scanner(System.in);
System.out.println("Give Year");
n = s1.nextInt();
if(n%4 == 0){
System.out.println(n+ "is Leap Year");}
else if(n%100 == 0){
System.out.println(n+ "is not a Leap Year");}
else if(n%400 == 0){
System.out.println(n+ "is Leap Year");}
else{
System.out.println(n+ "is not a Leap Year");}
}
}