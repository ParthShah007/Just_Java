import java.io.*;
import java.util.*;
class TableOf5 extends Thread {
public void run() {
for(int i=1;i<=10;i++){
try{
System.out.println("5 * "+i+ " = "+(i*5));
Thread.sleep(1000);
} catch(Exception e) {
System.out.println(e);
}
}
}
}
class TableOf7 extends Thread {
public void run() {
for(int i=1;i<=10;i++){
try{
System.out.println("7 * "+i+ " = " +(i*7));
Thread.sleep(1000);
} catch(Exception e) {
System.out.println(e);
}
}
}
}
class TableOf13 extends Thread {
public void run() {
for(int i=1;i<=10;i++){
try{
System.out.println("13 * "+i+" = "+(i*13));
Thread.sleep(1000);
} catch(Exception e) {
System.out.println(e);
}
}
}
}
class exp13a {
public static void main (String args[]) {
TableOf5 f = new TableOf5();
TableOf7 s = new TableOf7();
TableOf13 t = new TableOf13();
f.start();
s.start();
t.start();
}
}
