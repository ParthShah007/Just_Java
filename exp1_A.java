import java.util.Scanner;
class Exp1_A
{
	public static void main(String[] args)
	{
		int n;
		Scanner sc=new Scanner(System.in); System.out.println("Enter a number: "); n=sc.nextInt();
		if(n%2==0)
		{
			if(n>=2&&n<=5)
			{
				System.out.print("Not Weird.");
			}
			else if(n>=6&&n<=20)
			{
			System.out.print("Weird.");
			}
			else
			{
			System.out.print("Not Weird.");
			}
		}
		else
		{
		System.out.print("Weird.");
		}
	}
}