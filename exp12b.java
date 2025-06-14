import java.io.*;
import java.util.*;
class MarksOutOfBoundsException extends Exception {
public String toString() {
return "MarksOutOfBoundsException: Marks should be between 0 and 100 only.";
}
}
class ExceptionThrower {
public void thrower(int a) throws MarksOutOfBoundsException {
if(a>100 || a<0) {
System.out.println("Invalid marks entered: "+a);
throw new MarksOutOfBoundsException();
} else {
System.out.println("Valid marks entered: "+a);
}
}
}
class exp12b {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
ExceptionThrower t = new ExceptionThrower();
System.out.print("Enter number of subjects: ");
int n = sc.nextInt();
int u=0;
for(int i=1;i<=n;i++) {
try {
System.out.print("Enter marks for subject "+i+": ");
int marks = sc.nextInt();
t.thrower(marks);
} catch(MarksOutOfBoundsException e) {
System.out.println("Subject " + i + " - " + e);
u++;
}
}
System.out.println("**Total Exceptions caught: "+u+"**");
}
}





