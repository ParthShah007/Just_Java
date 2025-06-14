import java.util.*;
import java.io.*;
class Area {
double l;
double b;
double area(double l) {
return l*l;
}
double area(double l,double b) {
return l*b;
}
}
class  exp5b {
public static void main (String args[]) {
Area a = new Area();
double res;
Scanner sc = new Scanner(System.in);
System.out.print("Enter side of square: ");
double s = sc.nextDouble();
System.out.print("Enter length of rectangle: ");
double l = sc.nextDouble();
System.out.print("Enter breadth of rectangle: ");
double b = sc.nextDouble();
res = a.area(s);
System.out.println("Area of square: "+res);
res = a.area(l,b);
System.out.println("Area of rectangle: "+res);
}
}