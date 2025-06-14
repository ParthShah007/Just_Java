import java.io.*; 
import java.util.*; 
class loop 
{ 
public static void main(String args[]) 
{ 
Scanner sc = new Scanner(System.in); 
System.out.println("Enter the marks of the student: "); 
int m = sc.nextInt(); 
if(90<m && m<=100) 
{ 
System.out.println("A+"); 
} 
else if(80<m && m<=90) 
{ 
System.out.println("A"); 
} 
else if(70<m && m<=80) 
{ 
System.out.println("B+"); 
} 
else if(60<m && m<=70) 
{ 
System.out.println("B"); 
} 
else if(50<m && m<=60) 
{ 
System.out.println("C"); 
} 
else if(40<m && m<=50) 
{ 
System.out.println("D"); 
} 
else if(m<40) 
{ 
System.out.println("F"); 
} 
} 
}