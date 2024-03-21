import java.util.Scanner;
public class Switch{
public static void main(String [] args){
int a,b,c,ch;
System.out.println("1.addition");
System.out.println("2.subtraction");
System.out.println("3.multiplication");
System.out.println("4.division");
System.out.println("enter your choice:");
Scanner in = new Scanner(System.in);
ch=in.nextInt();
switch(ch){
case 1:
System.out.println("enter 2 number");
a=in.nextInt();
b=in.nextInt();
c=a+b;
System.out.println("addition:" + c);
break;
case 2:
System.out.println("enter 2 number");
a=in.nextInt();
b=in.nextInt();
c=a-b;
System.out.println("subtraction:" + c);
break;
case 3:
System.out.println("enter 2 number");
a=in.nextInt();
b=in.nextInt();
c=a*b;
System.out.println("multiplication:" + c);
break;
case 4:
System.out.println("enter 2 number");
a=in.nextInt();
b=in.nextInt();
c=a/b;
System.out.println("division:" + c);
break;
default:
System.out.println("invalid selection");
break;
}
}
}