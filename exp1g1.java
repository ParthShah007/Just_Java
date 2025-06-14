import java.util.Scanner;
class exp1g1 {
public static void main (String args[]) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter number: ");
int n = sc.nextInt();
for(int i=1;i<=n;i++){
if((i+1)%2==0){
for(int j=1;j<=i;j++){
System.out.print(j+" ");
}
}
else{
for(int j=i;j>0;j--){
System.out.print(j+" ");
}
}
System.out.println();
}
}
}




