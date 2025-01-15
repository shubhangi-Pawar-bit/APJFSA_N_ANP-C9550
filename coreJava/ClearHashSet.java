
// lab9_ANP-C9550(Java Collections and Generics) 
// Q-3) Write a Java program to remove all elements from a hash set.
package CoreJava;

import java.util.HashSet;

public class ClearHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create hashset object
		HashSet<String> hs=new HashSet<String>();
		//Add elements in the hash set
		hs.add("Apple");
		hs.add("Banana");
		hs.add("Kiwi");
		hs.add("Mango");
		// display hashSet
		System.out.println("original HashSet: "+hs);
		hs.clear();
		System.out.println("HashSet after removing all items: "+hs);
	}

}

/* OUTPUT 

original HashSet: [Apple, Kiwi, Mango, Banana]
HashSet after removing all items: []

*/