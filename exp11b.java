import vol.Cylinder;
import java.io.*;
import java.util.*;
class exp11b {
public static void main (String args[]) {
Scanner sc = new Scanner(System.in);
System.out.println("*Enter Cylinder details*");
System.out.print("Radius: ");
double r = sc.nextDouble();
System.out.print("Height: ");
double h = sc.nextDouble();
Cylinder c = new Cylinder(r,h);
System.out.println("Volume of Cylinder: "+c.volume());
sc.close();
}
}
