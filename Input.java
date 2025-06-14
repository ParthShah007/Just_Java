import java.io.*;
import java.util.*;
class Fib extends Thread {
int n;
int fib[];
Fib(int n) {
this.n = n;
fib = new int[n];
}
public void run () {
fib[0] = 0;
fib[1] = 1;
for(int i=2;i<n;i++){
fib[i] = fib[i-1] + fib[i-2];
}
}
int[] r() {
return fib;
}
}
class Input{ 
public static void main (String args[]) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter number of terms: ");
int n = sc.nextInt();
Fib f = new Fib(n);
f.start();
try {
f.join();
} catch(InterruptedException e) {
e.getMessage();
}
int[] res = f.r();
System.out.print("Fibonaaci series: ");
for(int i : res){
System.out.print(i+" ");
}
}
}


