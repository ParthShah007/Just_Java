import java.util.*;
import java.io.*;
class Area {
int l,b;
Area(int l,int b) {
this.l=l;
this.b=b;
}
Area() {
this.l=10;
this.b=20;
}
int area() {
return l*b;
}
}
class gg{
public static void main (String args[]) {
Area a1 = new Area();
Area a2 = new Area(2,3);
System.out.println("Area of nonP: " + a1.area());
System.out.println("Area of P: "+a2.area());
}
}

