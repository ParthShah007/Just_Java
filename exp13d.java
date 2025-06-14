import java.io.*;
import java.util.*;
class Counter {
static int count = 0 ;
public synchronized static void counter() {
count++;
}
}
class Count extends Thread {
public void run () {
Counter.counter();
}
}
class exp13d {
public static void main (String args[] ) throws InterruptedException{
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number of audience: ");
int a = sc.nextInt();
Count[] t = new Count[a];
for (int i=0;i<a;i++){
t[i] = new Count();
t[i].start();
}
for (int i = 0; i < a; i++) {
t[i].join();
}
System.out.println("No. of tickets sold: " + Counter.count);
}
}