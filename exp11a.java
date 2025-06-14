import java.util.*;
import java.io.*;
abstract class Area{
abstract void area();
}
class Circle extends Area{
double r;
Circle(double r) {
this.r = r;
}
public void area() {
double area = Math.PI*Math.pow(r,2);
System.out.printf("Area of Circle: %.2f\n",area);
}
}
class Rect extends Area{
double l,b;
Rect(double l,double b) {
this.l = l;
this.b = b;
}
public void area(){
double area = l*b;
System.out.printf("Area of Rectangle: %.2f\n",area);
}
}
class Tri extends Area{
double h,b;
Tri(double b,double h) {
this.b=b;
this.h=h;
}
public void area(){
double area = 0.5*b*h;
System.out.printf("Area of Triangle: %.2f\n",area);
}
}
class exp11a{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.print("Enter radius of circle: ");
double r = sc.nextDouble();
System.out.print("Enter length of rectangle: ");
double l = sc.nextDouble();
System.out.print("Enter breadth of rectangle: ");
double b =sc.nextDouble();
System.out.print("Enter base of triangle: ");
double base = sc.nextDouble();
System.out.print("Enter height of triangle: ");
double h = sc.nextDouble();
Area a1 = new Circle(r);
Area a2 = new Rect(l,b);
Area a3 = new Tri(base,h);
a1.area();
a2.area();
a3.area();
sc.close();
}
}




