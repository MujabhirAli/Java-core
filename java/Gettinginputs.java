import java.util.Scanner;
public class Gettinginputs{
public static void main(String[] args){
Scanner in = new Scanner(System.in);
int a,b,c;
System.out.println("enter 2 number:");
a=in.nextInt();
b=in.nextint();
c=(a*a)+(b*b)+(2*a*b);
System.out.println("result:"+c);
}
}