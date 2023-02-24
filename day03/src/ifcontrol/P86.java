package ifcontrol;

public class P86 {

	public static void main(String[] args) {
	
		String grade = "VIP";
		String gender = "M";
		double sum = 90.0;
		
		System.out.println("Start.....");
		
		if(gender.equals("M")) {
			System.out.println("Male.....");
			// return
		} else {
			System.out.println("Female.....");
		}
		
		grade = (sum >= 90.0) ? "VIP" :
				(sum >= 70.0) ? "GOLD" : "SILVER";
		
//		if(sum>=90.0) {
//			grade="VIP";
//		}else if(sum >= 70.0) {
//			grade = "GOLD";
//		}else {
//			grade = "SILVER";
//		}
	
	if(grade.equals("VIP")) {
		System.out.println("VIP 혜택.....");
		// return
	}
	
	
	System.out.printf("%s, %s, %4.2f \n", grade, gender, sum);
	System.out.println("End.....");
}
	}
