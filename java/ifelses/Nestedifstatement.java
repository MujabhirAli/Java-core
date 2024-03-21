import java.util.Scanner;
class Nestedifstatement {
public static void main (String[] args){
    Scanner in = new Scanner (System.in);
    System.out.println("enter the martial status M/U: ");
    char martial =in.next().charAt(0);
    if ( martial == 'm' || martial == 'M'){
        System.out.println("you are eligible for insurance");
    }
    else if(martial == 'u' || martial == 'U'){
        System.out.println("enter the genter M/F: ");
        char gender =in.next().charAt(0);
        int age =in.nextInt();
        if((gender=='m' || gender=='M')&& age>=30){
            System.out.println("you are eligible for insurance"); 
        }
        else if ((gender=='f' || gender=='F')&& age>=25){
            System.out.println("you are eligible for insurance"); 
        }
        else {
            System.out.println("you are not eligible for insurance"); 
        }
        }
else {
    System.out.println("invalid input");   
}
    }
}
