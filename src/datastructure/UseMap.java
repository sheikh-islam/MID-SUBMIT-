package datastructure;

import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

public class UseMap {

	public static void main(String[] args) {
		Map<Integer, String> map= new HashMap<>();
		map.put(10, "John");
		map.put(12, "Sam");
		map.put(13, "Drake");
		map.put(16, "Ali");

		for(Map.Entry<Integer, String> m:map.entrySet()){
			System.out.println(m);
		}
		System.out.println();
		Iterator<Map.Entry<Integer, String>> m=map.entrySet().iterator();
		while (m.hasNext()){
			System.out.println(m.next());
		}
	}

}
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */