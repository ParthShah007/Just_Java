import java.util.Scanner; 
class exp1d
{
public static void main(String args[])
{
int a,b,result,ch;
Scanner sc= new Scanner(System.in); 
System.out.print("Enter 1st number:"); 
a = sc.nextInt();
System.out.print("Enter 2nd number:"); 
b = sc.nextInt();
System.out.print("Enter your choice:\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Modulus"); 
ch = sc.nextInt();
switch(ch)
{
case 1:
result=a+b;
System.out.println("Result = "+result); 
break;
case 2:
result=a-b;
System.out.println("Result = "+result); 
break;
case 3:
result=a*b;
System.out.println("Result = "+result); 
break;
case 4:
result=a/b;
System.out.println("Result = "+result); 
break;
case 5:
result=a%b;
System.out.println("Result = "+result); 
break;
default:
System.out.println("INVALID CHOICE!");
}
}
}