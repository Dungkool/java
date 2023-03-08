package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.kbstar.dto.UserDTO;

public class MapTest4 {

	public static void main(String[] args) {
		Map<String, UserDTO> db = new HashMap<String, UserDTO>();

		db.put("id01", new UserDTO("id01", "pwd01", "James1"));
		db.put("id02", new UserDTO("id02", "pwd02", "James2"));
		db.put("id03", new UserDTO("id03", "pwd03", "James3"));

		UserDTO u = db.get("id02"); // get을 통해 나온 UserDTO 값을 UserDTO로 받음
		System.out.println(u);

		UserDTO uu = new UserDTO("id02", "0000", "James2");
		db.put(uu.getId(), uu);
		System.out.println("-----------------------------------------");
		
		Collection<UserDTO> col = db.values(); // map의 값들만 뽑음

		for (UserDTO user : col) {
			System.out.println(user);
		}

	}

}
