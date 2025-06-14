import java.util.Scanner; 
class exp1b2
{
public static void main(String args[])
{
int a,b,c,large;
Scanner sc = new Scanner(System.in); 
System.out.print("Enter 1st number: "); 
a = sc.nextInt();
System.out.print("Enter 2nd number: "); 
b = sc.nextInt();
System.out.print("Enter 3rd number: "); 
c = sc.nextInt();
large = (a>b)?((a>c)?a:c):((b>c)?b:c);
System.out.println("Largest number = "+large);
}
}