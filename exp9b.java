import java.util.*;
import java.io.*;
interface Sports {
void score(Scanner sc);
}
class Student {
int rollno;
void read(Scanner sc) {
System.out.print("Enter roll number: ");
rollno = sc.nextInt();
}
}
class Test extends Student {
int sem1_marks,sem2_marks;
void read(Scanner sc) {
super.read(sc);
System.out.print("Enter sem1 marks: ");
sem1_marks= sc.nextInt();
System.out.print("Enter sem2 marks: ");
sem2_marks= sc.nextInt();
}
}
class Result extends Test implements Sports {
int total;
int sportsScore;
public void score(Scanner sc) {
System.out.print("Enter Sports score: ");
sportsScore = sc.nextInt();
}
void Total(Scanner sc) {
score(sc);
total = sem1_marks+sportsScore+sem2_marks;
}
void display() {
System.out.println("Roll Number: " + rollno);
System.out.println("Semester 1 Marks: " + sem1_marks);
System.out.println("Semester 2 Marks: " + sem2_marks);
System.out.println("Sports score: "+sportsScore);
System.out.println("Total Marks : " + total);
}
}
class exp9b {
public static void main (String args[]) {
Scanner sc = new Scanner(System.in);
Result r = new Result();
r.read(sc);
r.Total(sc);
r.display();
}
}