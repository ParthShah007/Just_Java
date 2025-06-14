import java.util.*;
import java.io.*;
class exception extends Exception {
exception() {
super("Super NOOB");
}
public String toString() {
return "NOOB>";
}
}
class thro {
void thrower(int m) throws exception {
if (m<=0 || m>12){
throw new exception();
} else{
System.out.println("All good/");
}
}
}
class Main {
public static void main (String args[]){
thro t = new thro();
try {
t.thrower(9);
System.out.println("1st call complete.");
t.thrower(13);
} catch(exception e) {
System.out.println(e+e.getMessage());
}
}
}




