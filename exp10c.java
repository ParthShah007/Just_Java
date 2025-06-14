import java.io.*;
import java.util.*;
class A {
protected void finalize() throws Throwable {
System.out.println("Object has been deleted."+this);
}
}
class exp10c {
public static void main(String args[]) {
A a = new A();
A b= new A();
a = null;
b = null;
System.gc();
System.out.println("End of program.");
}
}