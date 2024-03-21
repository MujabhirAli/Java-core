public class arrayz{
public static void main(String[] args){
int valueotbeadded=6;
int arr[]={1,2,3,4,5};
int newarray[]= new int[arr.length + 1];
for(int i=0;i<arr.length; i++) {
newarray[i] = arr[i];
}
newarray[arr.length]=valueotbeadded;
for(int i=0; i < newarray.length;i++)

{
System.out.println(newarray[i]);
}
}
}


