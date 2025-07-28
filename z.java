import java.io.*;
import java.util.*;
class A {
int c = 10;
}
class B extends A {
System.out.println(super.c);
}
class z {
public static void main(String args[]) {
B b = new B();
}
}
