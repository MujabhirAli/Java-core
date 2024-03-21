import java.util.Arrays;
public class Arrayex100{
public static void main(String args[]){
int arr[] = {153, 79, 91, 7, 1071};
int size=arr.length;
Arrays.sort(arr);
for (int i = arr.length - 1; i >= 0; i--) {
System.out.print(arr[i] + " ");
}
}
}
