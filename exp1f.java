import java.util.Scanner;
class exp1f {
public static void main (String args[]) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter number of terms: ");
int n = sc.nextInt();
double sum = 0,i;
for ( i=1;i<=n;i++) {
sum = sum + 1.0/(i*i);
}
System.out.println("The sum of the series is: "+sum);
sc.close();
}
}




