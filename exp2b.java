import java.util.Scanner;
class exp2b {
public static void main (String[] args) {
Scanner sc = new Scanner(System.in);
int a[][] = new int[5][4];
int sum[] = new int[5];
for(int i=0;i<5;i++){
sum[i]=0;
System.out.println("For student "+(i+1)+" : ");
System.out.print("Enter roll number: ");
a[i][0] = sc.nextInt();
for(int j=0;j<3;j++){
System.out.print("Enter marks for subject " + (j+1) +" : ");
a[i][j+1] = sc.nextInt();
sum [i] += a[i][j+1];
}
}
int max = sum[0];
int stu = a[0][0];
for (int i =1;i<5;i++){
if(sum[i] > max) {
max = sum[i];
stu= a[i][0];
}
}
System.out.print("Rn:-\t");
System.out.print("Sub 1\t");
System.out.print("Sub 2\t");
System.out.println("Sub 3\t");
System.out.println("**********************************");									
for(int i=0;i<5;i++){
for(int j=0;j<4;j++){
System.out.print(a[i][j]+" | \t");
}
System.out.println();
}
System.out.print("The highest scored roll number is "+stu+" with "+max+" marks.");
}
}