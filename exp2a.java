import java.util.Scanner;
class exp2a {
public static void main (String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the size of the array: ");
int n = sc.nextInt();
int arr1[] = new int[n];
int arr2[] = new int[n];
int sum = 0;
for(int i=0;i<n;i++) {
System.out.print("Enter element "+ (i+1) +" : ");
arr1[i]=sc.nextInt();
sum = sum + arr1[i];
} 
System.out.print("Initial array: ");
for(int i=0;i<n;i++) {
System.out.print(arr1[i]+" ");
}
System.out.println();
System.out.print("Resultant array: ");
for(int i=0;i<n;i++) {
arr2[i] = sum - arr1[i];
System.out.print(arr2[i]+" ");
}
}
}

