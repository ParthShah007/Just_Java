import java.io.*;
import java.util.*;
class exp12a2 {
public static void main(String[] args) {
try {
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter string: ");
br.close();
String line = br.readLine();
Class.forName("ParthJava"); 
} catch (ClassNotFoundException e) {
System.out.println(e);
} catch (IOException e) {
System.out.println(e);
} finally {
System.out.println("Exceptions are caught.");
}
}
}