package variable;

public class P69 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcdef";
		str = str.toUpperCase(); // .은 주소에 접근할 때 사용
		System.out.println(str);

		String str2 = str.replace("A", "Z");
		System.out.println(str2);

		int lng = str.length();
		System.out.println(lng);

		int t = str.indexOf("B");
		System.out.println(t);
		
		char c = str.charAt(0);
		System.out.println(c);
		
		String str3 = str.substring(1, 3);
		System.out.println(str3);
		
		String email = "jmlee@tonesol.com";
		String id =email.substring(0, 5);
		String domain =email.substring(5, 17);
		System.out.printf("%s,%s", id, domain);
	}

}
