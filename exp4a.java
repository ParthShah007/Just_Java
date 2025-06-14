import java.io.*;
import java.util.*;
class exp4a {
public static void main (String args[]) {
Vector<String> v = new Vector<>();
for (int i=0;i<args.length;i++) {
v.addElement(args[i]);
}
System.out.println("Vector elements: ");
for (int i=0;i<v.size();i++){
System.out.println(v.get((i)));
}
}
}
