import java.io.*;
import java.util.*;
class A {
A() {
System.out.println("Constructor of A.");
}
}
class B extends A {
B() {
System.out.println("Constructor of B.");
}
}
class C extends B {
C() {
System.out.println("Constructor of C.");
}
}
class exp8a {
public static void main (String args[]) {
C c = new C();
}
}

