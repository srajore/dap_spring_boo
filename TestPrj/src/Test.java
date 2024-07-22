import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Properties;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class Test implements Cloneable { // Java

	public static void main(String[] args) {
		
		//String s;
		
		//Integer i;
		
		// Comparable 
		
		// String 
		
		// Integer 10 ,40 

		TreeSet set = new TreeSet(new NameComparator());

		// set.add("Pune");

		set.add(new Person(1, "Ram", 20));

		set.add(new Person(3, "Seeta", 10));

		set.add(new Person(2, "Laxman", 15));

		System.out.println(set);
		
		 
		
		Hashtable ht=new Hashtable<>();
		
		Properties p;

	}

}
