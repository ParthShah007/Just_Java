import java.util.*;
import java.io.*;
class gg {
public static void main(String args[]) {
int n  = 5;
char c = 'A';
for(int i=0;i<n;i++){
for(int j=i+1;j<n;j++){
System.out.print(" ");
}
for(int j=0;j<i+1;j++) {
System.out.print((char)(c+i-j));
}
c += i;
System.out.println();
}
}
}
