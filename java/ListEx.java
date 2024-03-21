import java.util.*;
import java.util.Arrays;

public class ListEx {
	public static void main(String[] args){
		String[] arr = {"a","b","c","d"};
		System.out.println(arr);
		
		ArrayList <String> arrList = new ArrayList<String>(Arrays.asList(arr));
		System.out.println(arrList);
		
		LinkedHashSet<String> list = new LinkedHashSet<>(arrList);
		list.add("M");
		list.add("U");
		list.add("J");
		System.out.println(list);
		
		HashMap<String , String> map = new HashMap<String , String>();
		map.put("name","Varun");
		map.put("class","java");
		System.out.println(map);
		
		Hashset <String> set= new hashset<>();
		set.add("M");
		set.add("U");
		set.add("J");
		System.out.println(set);
		
		iterator iter = set.iterator();
		while(iter.hasNext()){
			System.out.println(iter.hasNext());
		}
		
		Treeset <String> set= new Treeset<>();
		Tree.add("M");
		Tree.add("U");
		Tree.add("J");
		System.out.println(Tree);
		
		Linkedlist <String> set= new Linkedlist<>();
		Link.add("M");
		Link.add("U");
		Link.add("J");
		System.out.println(Link);
		
		Linkedlist <String> set= new Linkedlist<>();
		Link.add("M");
		Link.add("U");
		Link.add("J");
		System.out.println(Link);
		
		


		
	}
}