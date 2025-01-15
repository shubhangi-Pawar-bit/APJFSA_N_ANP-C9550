/* 
   lab9_ANP-C9550(Java Collections and Generics)
   Q-2) Write a program to add elements to the HashMap given the key as integer and value data type is String
*/

package CoreJava;

import java.util.HashMap;

public class AddHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map = new HashMap<>();

		// Add elements to the map
		map.put(1, "Aarohi");
		map.put(2, "Shubhangi");
		map.put(3, "Prathamesh");

		// Print the map
		System.out.println("created hash map is : "+map);
	}

}
/* OUTPUT 
  
  created hash map is : {1=Aarohi, 2=Shubhangi, 3=Prathamesh}
 
 */