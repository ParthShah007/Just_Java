import java.util.Scanner;
class exp1e
{
public static void main(String args[])
{
int marks;
Scanner sc= new Scanner(System.in); 
System.out.print("Enter marks:"); 
marks = sc.nextInt();
if(marks>=90)
{
System.out.println("A grade");
}
else if(marks<90 && marks>=80)
{
System.out.println("B grade");
}
else if(marks<80 && marks>=70)
{
System.out.println("C grade");
}
else if(marks<70 && marks>=60)
{
System.out.println("D grade");
}
else if(marks<60 && marks>=50)
{

System.out.println("E grade");
}
else if(marks<50 && marks>=40)
{
System.out.println("F grade: JUST PASSED.");
}
else
{
System.out.println("FAIL");
}
}
}