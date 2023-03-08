package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest3 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		map.put(4, "D");
		map.put(5, "E");

		Collection<String> col = map.values(); // map의 값들만 뽑음
		System.out.println(col.size());

		for (String data : col) {
			System.out.println(data);
		}
	}

}
