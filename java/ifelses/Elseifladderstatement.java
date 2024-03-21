import java.util.Scanner;
public class Elseifladderstatement {
    public static void main(String[] args) {
float avg;
System.out.println("enter the avg number:");
Scanner in =new Scanner (System.in);
avg=in.nextInt();
if(avg>=90 && avg<=100){
System.out.println("grade a");
}else if(avg>=80 && avg<=89){
System.out.println("grade b");
}else if(avg>=70 && avg<=79){
System.out.println("grade c");
}else{
System.out.println("grade d");}
}
}