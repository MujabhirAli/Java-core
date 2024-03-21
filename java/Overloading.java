class Overloading{
int add(int a){
return a+5;
}
int add(int a,int b){
return a+b;
}
double add(double a,double b){
return a+b;
}
public static void main(String args[]){
Overloading obj =new Overloading();
int sum1=obj.add(5);
int sum2=obj.add(5,10);
double sum3=obj.add(2.5, 3.5);
System.out.println("sum 1:"+ sum1);
System.out.println("sum 2:"+ sum2);
System.out.println("sum 3:"+ sum3);

}}