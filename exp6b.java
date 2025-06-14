import java.io.*;
import java.util.*;
class Complex {
double r,i;
Complex(double r,double i) {
this.r=r;
this.i=i;
}
Complex add(Complex other) {
return new Complex(this.r + other.r, this.i + other.i);
}
void display() {
if(i>0) {
System.out.println("Resultant Complex: "+r+"+i"+i);
} else {
System.out.println("Resultant Complex: "+r+"-i"+(-1*i));
}
}
}
class exp6b {
public static void main (String args[]) {
Scanner sc = new Scanner(System.in);
int r1,r2,c2,c1;
System.out.println("*Complex Number 1*");
System.out.print("Enter real part : ");
r1 = sc.nextInt();
System.out.print("Enter complex part: ");
c1 = sc.nextInt();
System.out.println("*Complex Number 2*");
System.out.print("Enter real part : ");
r2 = sc.nextInt();
System.out.print("Enter complex part: ");
c2 = sc.nextInt();
Complex num1 = new Complex(r1,c1);
Complex num2 = new Complex(r2,c2);
Complex res = num1.add(num2);
res.display();
}
}










