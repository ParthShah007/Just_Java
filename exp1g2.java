import java.util.Scanner; 
class exp1g2 {
public static void main(String args[])
{
Scanner sc=new Scanner (System.in); 
System.out.print("Enter number of rows: "); 
int n = sc.nextInt();
char c = 'A'; 
for(int i=1; i<=n; i++)
{
for(int j = 0; j < (n-i); j++)
{
System.out.print(" ");
}
for(int j=(int)c+i-1; j>=(int)c; j--)
{
System.out.print((char)j);
}
System.out.println(); 
c += i;
}
}
}

