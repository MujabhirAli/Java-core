import java.util.Scanner;
public class Do_While_loop{
public static void main(String args[]){
System.out.println("enter the limit");
Scanner in = new Scanner(System.in);
int n=in.nextInt();
int i=1;
do{
	System.out.println(i);
	i=i+2;
}while (i<=n);
}
}