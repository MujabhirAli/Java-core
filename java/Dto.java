class student {
private String name;
private int age;
public String getName(){
return name;
}
public void setName(String name){
this.name=name;
}
}
public class Dto{
public static void main(String[] args){
student one = new student();
one.setName("Meiy");
System.out.println(one.getName());

student two = new student();
two.setName("Mujrow");
System.out.println(two.getName());
}}