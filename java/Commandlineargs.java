public class Commandlineargs{
public static void main (String[] args){
int age=Integer.parseInt(args[0]);
System.out.println(age);
String name = args[1];
if(age>=18){
System.out.println(name+" eligible");
}else{
System.out.println(name+" not eligible");}
}
}