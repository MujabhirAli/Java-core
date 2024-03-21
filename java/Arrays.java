public class Arrays{
public static void main(String[]args){
int arr[]={10,25,23,56};
arr[0]=10;
arr[1]=20;

int size = arr.length;
System.out.println(size);
for(int i=0; i < arr.length; i++){
System.out.println(arr[i]);
}
}
}