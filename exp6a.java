import java.io.*;
import java.util.*;
class Student {
String name;
int rn;
double p,m,c;
double total;
void getData(Scanner sc) {
System.out.print("Enter name :");
name = sc.nextLine();
System.out.print("Enter roll number: ");
rn = sc.nextInt();
System.out.print("Enter Physics marks: ");
p = sc.nextDouble();
System.out.print("Enter Chemistry marks: ");
c = sc.nextDouble();
System.out.print("Enter Math marks: ");
m = sc.nextDouble();
sc.nextLine();
total = p+c+m;
}
void display() {
System.out.println(rn + "\t" + name + "\t" + total);
}
}
class exp6a {
public static void main (String args[]) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter number of Students: ");
int n = sc.nextInt();
sc.nextLine();
Student student[] = new Student[n];
for(int i=0;i<n;i++) {
student[i] = new Student();
System.out.println("Enter details for Student "+(i+1)+" :");
student[i].getData(sc);
}
for(int i=0;i<n-1;i++) {
for(int j=i+1;j<n;j++) {
if(student[i].total<student[j].total) {
Student temp = student[i];
student[i] = student[j];
student[j] = temp;
}
}
}
System.out.println("Sorted List: ");
for(int i=0;i<n;i++) {
student[i].display();
}
}
}










