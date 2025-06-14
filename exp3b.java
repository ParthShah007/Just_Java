import java.util.Scanner;
class exp3b {
public static void main (String args[]) {
int b=0,l=0,u=0,i=0;
Scanner sc = new Scanner(System.in);
System.out.print("Enter a string: ");
String str = sc.nextLine();
for(char s : str.toCharArray()) {
if(s == ' ') 
b++;
else if(s >= 'a' && s<='z')
l++;
else if(s>='A' && s<='Z')
u++;
else
i++;
}
System.out.println("Number of Uppercases = "+u+"\nNumber of lowercases = "+l+"\nNumber ofblank spaces = "+b+"\nNumber of digits = "+i);
}
}



