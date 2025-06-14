import java.io.*;
import java.util.*;
class sum {
static int sumOfDigits(int n) {
if(n==0) {
return 0;
} else {
return (n%10)+sumOfDigits(n/10);
}
}
}
class tt13b {
public static void main (String args[]) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter number: ");
int n = sc.nextInt();
if(n<0){
System.out.println("Enter a non-negative number.");
} else {
System.out.println("Number of Digits in " + n + " is :"+sum.sumOfDigits(n));
}
}
}