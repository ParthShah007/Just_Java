import java.io.*;
import java.util.*;
class exp12a {
public static void main (String args[]) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));;
int a[] = new int[2];
String s = null;
System.out.print("Enter string: ");
String l = br.readLine();
try {
int x = Integer.parseInt(l);
System.out.println(a[2]);
System.out.println(s);
int n = 18/0;
}
catch(NumberFormatException e) {
System.out.println(e);
System.out.println(e.getMessage());
} catch(ArithmeticException e) {
System.out.println(e);
System.out.println(e.getMessage());
} catch(NullPointerException e) {
System.out.println(e);
System.out.println(e.getMessage());
} catch(ArrayIndexOutOfBoundsException e) {
System.out.println(e);
System.out.println(e.getMessage());
} finally {
System.out.println("Exceptions are finally caught.");
}
}
}