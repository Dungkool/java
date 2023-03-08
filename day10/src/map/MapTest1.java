package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest1 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		map.put(4, "D");
		map.put(5, "E");
		
		System.out.println(map.size());
		System.out.println(map.containsKey(5));
		System.out.println(map.containsValue("D"));
		
		System.out.println(map.get(1));
		
		Set<Integer> keys = map.keySet();		// set type이므로 set으로 써서 빼냄
		System.out.println(keys.toString());	// set에는 현재 1,2,3,4,5가 있음
		
		for (int data : keys) {					// for를 돌리기 위해 위에서 key값을 뽑아냄
			System.out.println(map.get(data));
		}
	}

}
