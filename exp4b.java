import java.io.*;
import java.util.*;
class exp4b {
public static void main (String args[]) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter number of strings: ");
int n = sc.nextInt();
Vector<String> v = new Vector<>();
for (int i=0;i<n;i++){
System.out.print("Enter string "+(i+1)+": ");
v.addElement(sc.nextLine());
}
System.out.println("The string are: ");
for(int i = 0;i<v.size();i++)
{
System.out.print(vec.get(i)+"\t");
}
System.out.print("Enter the string you want to find: ");
String s = sc.nextLine();

}
}
