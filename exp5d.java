import java.util.*;
import java.io.*;
class Counter {
static int count = 0; 
static void increment() {
count++;
}
}
class exp5d {
public static void main(String args[]) {
Counter c1 = new Counter();
c1.increment();  
Counter c2 = new Counter();
c2.increment();      
Counter c3 = new Counter();
c3.increment();
System.out.println("The number of objects created are: " + Counter.count);
}
}




