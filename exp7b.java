import java.io.*;
import java.util.*;
class Area {
double l;
double b;
double area;
Area(double a,double b) {
this.l = a;
this.b=b;
area = l*b;
}
Area(double a) {
this.l = a;
area = l*l;
}
Area() {
l = 0;
b = 0;
area = l*b;
}
Area(Area obj) {
this.l = obj.l;
this.b = obj.b;
this.area = obj.area;
}
}
class exp7b {
public static void main (String args[]) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter side of square: ");
double s = sc.nextDouble();
System.out.print("Enter length of rectangle: ");
double l = sc.nextDouble();
System.out.print("Enter breadth of rectangle: ");
double b= sc.nextDouble();
Area a1 = new Area(l,b);
System.out.println("*In parameterised constructor*");
System.out.println("Area of rectangle: "+a1.area);
Area a2 = new Area(s);
System.out.println("Area of square: "+a2.area);
Area a3 = new Area();
System.out.println("*In non-parameterised constructor*");
System.out.println("Area of Shape: "+a3.area);
Area a4 = new Area(a1);
System.out.println("*In copy constructor*");
System.out.println("Area of rectangle: "+a4.area);
a4=a2;
System.out.println("Area of square: "+a4.area);
}
}