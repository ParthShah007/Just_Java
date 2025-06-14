import java.io.*;
import java.util.*;
class Staff {
int code;
String name;
Staff(Scanner sc) {
System.out.print("Enter Name: ");
name = sc.nextLine();
System.out.print("Enter Code: ");
code = sc.nextInt();
sc.nextLine(); 
}
}
class Teacher extends Staff {
int exp;
String sub;
Teacher(Scanner sc) {
super(sc);
}
void read(Scanner sc) {
System.out.print("Experience: ");
exp=sc.nextInt();
sc.nextLine();
System.out.print("Subject: ");
sub=sc.nextLine();
}
void display() {
System.out.println("*Teacher Details*");
System.out.println("Name: "+name);
System.out.println("Code: "+code);
System.out.println("Experience: "+exp+" years");
System.out.println("Subject: "+sub);
}
}
class Typist extends Staff {
int speed;
int exp;
Typist(Scanner sc) {
super(sc);
}
}
class Regular extends Typist {
int salary;
Regular(Scanner sc) {
super(sc);
}
void read(Scanner sc)
{
System.out.print("Experience: ");
exp=sc.nextInt();
sc.nextLine();
System.out.print("Speed: ");
speed=sc.nextInt();
System.out.print("Salary: ");
salary=sc.nextInt();
sc.nextLine();
}
void display() {
System.out.println("*Regular Typist Details*");
System.out.println("Name: "+name);
System.out.println("Code: "+code);
System.out.println("Experience: "+exp+" years");
System.out.println("Speed: "+speed+" WPM");
System.out.println("Salary: "+salary+" bucks");
}
}
class Casual extends Typist {
int dailyWage;
Casual(Scanner sc) {
super(sc);
}
void read(Scanner sc) {
System.out.print("Experience: ");
exp=sc.nextInt();
sc.nextLine();
System.out.print("Speed: ");
speed=sc.nextInt();
System.out.print("Dailywage: ");
dailyWage=sc.nextInt();
sc.nextLine();
}
void display() {
System.out.println("*Casual Typist Details*");
System.out.println("Name: "+name);
System.out.println("Code: "+code);
System.out.println("Experience: "+exp+" years");
System.out.println("Speed: "+speed+" WPM");
System.out.println("Dailywage: "+dailyWage+" bucks");
}
}
class Officer extends Staff {
String dept;
String grade;
Officer(Scanner sc) {
super(sc);
}
void read(Scanner sc) {
System.out.print("Department: ");
dept=sc.nextLine();
System.out.print("Grade: ");
grade=sc.nextLine();
}
void display()
{
System.out.println("*Officer Details*");
System.out.println("Name: "+name);
System.out.println("Code: "+code);
System.out.println("Department: "+dept);
System.out.println("Grade: "+grade);
}
}
class exp8c
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("*Enter Teacher Details*");
Teacher t=new Teacher(sc);
t.read(sc);
System.out.println();
System.out.println("*Enter Regular Typist Details*");
Regular r=new Regular(sc);
r.read(sc);
System.out.println();
System.out.println("*Enter Casual Typist Details*");
Casual c=new Casual(sc);
c.read(sc);
System.out.println();
System.out.println("*Enter Officer Details*");
Officer o=new Officer(sc);
o.read(sc);
System.out.println("________________________________________");
t.display();
System.out.println("________________________________________");
r.display();
System.out.println("________________________________________");
c.display();
System.out.println("________________________________________");
o.display();
System.out.println("________________________________________");
}
}