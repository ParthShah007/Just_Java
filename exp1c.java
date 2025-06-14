class exp1c
{
public static void main(String args[])
{
int n,m,count = 0;
n= Integer.parseInt(args[0]); 
m = n;
while(m!=0)
{
m = m/10; 
count++;
}
System.out.println("The number of digits in " + n + " = " + count);
}
}
