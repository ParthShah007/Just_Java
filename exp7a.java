import java.io.*;
import java.util.*;
class Count {
static int count = 0;
Count() {
count++;
}
}
class exp7a {
public static void main (String args[]) {
Count c1 = new Count();
Count c2 = new Count();
Count c3 = new Count();
System.out.println("Count of Objects: "+Count.count);
}
}
