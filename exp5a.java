import java.util.*;
import java.io.*;
class Employee {
int empid;
String empname,designation;
double salary;
void getemployee() {
Scanner sc = new Scanner(System.in);
System.out.print("Enter employee id: ");
empid = sc.nextInt();
sc.nextLine();
System.out.print("Enter employee name: ");
empname = sc.nextLine();
System.out.print("Enter designation: ");
designation = sc.nextLine();
System.out.print("Enter salary: ");
salary = sc.nextDouble();
}
void showgrade() {
if(salary>100000) {
System.out.print("A grade");
} else if(salary>50000) {
System.out.print("B grade");
} else if(salary>25000) {
System.out.print("C grade");
} else {
System.out.print("Legend");
}
}
void showemployee() {
System.out.println("Employee Details: ");
System.out.println("Emp id: "+empid);
System.out.println("Name: "+empname);
System.out.println("Designation: "+designation);
System.out.println("Salary: "+salary);
}
}
class exp5a {
public static void main (String args[] ) {
Employee e = new Employee();
e.getemployee();
e.showemployee();
e.showgrade();
}
}




