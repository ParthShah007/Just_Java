import java.io.*;
import java.util.*;
class Parent {
void show() {
System.out.println("Show method in parent class.");
}
}
class Child extends Parent {
void show() {
System.out.println("Show method in child class.");
}
}
class exp10a {
public static void main (String args[]) {
Parent p;
p = new Parent();
p.show();
p = new Child();
p.show();
}
}
