import java.io.*;
class m {
static void rev (String a, int i) {
if(i<0) {
return ;
} else {
System.out.println(a.charAt(i));
rev(a,i-1);
}
}
public static void main(String args[]) {
String name = "hello";
System.out.println("Reversed String: ");
rev(name, name.length());
}
}



