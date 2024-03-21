public class Mark{
public static void main(String[]args){
int mark1=30,mark2=25,mark3=10;
int total=mark1+mark2+mark3;
float avg =total/3;

if(avg<50){
System.out.println("Fail");
}else if (avg>=50 && avg<60){
System.out.println("C");
}else if (avg>=60 && avg<70){
System.out.println("B");
}else if (avg>=70 && avg<80){
System.out.println("B+");
}else if (avg>=80 && avg<90){
System.out.println("A");
}else{
System.out.println("A+");
}
}
}