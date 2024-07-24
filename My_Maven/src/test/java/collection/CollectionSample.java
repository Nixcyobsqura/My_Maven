package collection;

import java.util.ArrayList;

public class CollectionSample {
	public static void main(String args[]) {
	ArrayList obj=new ArrayList();
	obj.add(2);
	obj.add("Luca");
	obj.add(1.5f);
	System.out.println(obj);
	
	ArrayList<String> obj1=new ArrayList();
	obj1.add("hai");
	obj1.add("hello");
	System.out.println(obj1);
	obj1.remove(0);
	System.out.println(obj1);
	
	ArrayList<String> obj2=new ArrayList();
	obj2.add("nixcy");
	obj2.add("baby");
	obj2.addAll(obj1);
	System.out.println(obj2);
	obj2.removeAll(obj2);
	System.out.println(obj2);
	

	}
}
