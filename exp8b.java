import java.io.*;
import java.util.*;
class Parent {
int a;
Parent(int x) {
this.a=x;
System.out.println("Parent Constructor: a = " + a);
}
void display() {
System.out.println("Parent variable: " + a);
}
}
class Child extends Parent {
Child(int x) {
super(x);
}
void show() {
super.display();
System.out.println("Accessed from Parent: " + super.a);
}
}
class exp8b {
public static void main (String args[]) {
Child c = new Child(10);
c.show();
}
}

