import java.util.Scanner; 
class exp1e2
{
public static void main(String args[])
{
int marks,grade;
Scanner sc= new Scanner(System.in); 
System.out.println("Enter marks:"); 
marks = sc.nextInt();
grade=marks/10; 
switch(grade)
{
case 1:
System.out.println("A grade."); 
break;
case 2:
System.out.println("B grade."); 
break;
case 3:
System.out.println("C grade."); 
break;
case 4:
System.out.println("D grade."); 
break;
case 5:
System.out.println("E grade."); 
break;
case 6:
System.out.println("F grade"); 
break;
default:
System.out.println("FAIL.");
}
}
}
