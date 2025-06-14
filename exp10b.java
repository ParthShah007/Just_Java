import java.io.*;
import java.util.*;
final class Calc {
final double roi;
Calc(double roi) {
this.roi = roi;
}
final void SI(double principal, double time) {
double si = (principal * roi * time) / 100;
System.out.println("Simple Interest: " + si);
}
final void CI(double principal,double time) {
double ci = principal * Math.pow((1 + roi / 100), time) - principal;
System.out.println("Compound Interest: " + ci);
}
}
class exp10b {
public static void main (String args[] ) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter rate of interest: ");
double roi = sc.nextDouble();
System.out.print("Enter principal amount: ");
double p = sc.nextDouble();
System.out.print("Enter time period: ");
double t = sc.nextDouble();
Calc c = new Calc();
c.SI(p,t);
c.CI(p,t);
}
}







