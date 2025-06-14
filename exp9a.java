import java.io.*;
import java.util.*;
interface StringReverse {
String rev(String str) ;
}
class Reverse implements StringReverse{
public String rev(String str) {
StringBuffer sb = new StringBuffer(str);
return sb.reverse().toString();
}
}
class exp9a {
public static void main (String args[]) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter string: ");
String str = sc.nextLine();
StringReverse reverser = new Reverse();
System.out.println("Original String: "+str);
System.out.println("Reversed String: "+reverser.rev(str));
}
}
