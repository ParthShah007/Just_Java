//WAP to create a package called vol having Cylinder class and volume (). WAP that imports this package to calculate volume of a Cylinder.
package vol;
import java.io.*;
import java.util.*;
public class Cylinder {
double r,h;
public Cylinder(double r, double h) {
this.r = r;
this.h = h;
}
public double volume() {
return Math.pi*Math.pow(r,2)*h;
}