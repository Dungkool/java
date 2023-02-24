package ifcontrol;

public class P87 {

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
		
		if((sum <= 100 && sum >= 95) || (sum >= 85 && sum <= 90)) {
			grade = "VIP";
		}else if((sum >= 75 && sum <= 80) || (sum >= 60 && sum <= 65)) {
			grade = "GOLD";
		}else {
			grade = "NORMAL";
		}
		
	
	if(grade.equals("VIP")) {
		System.out.println("VIP 혜택.....");
		// return
	}
	
	
	System.out.printf("%s, %s, %4.2f \n", grade, gender, sum);
	System.out.println("End.....");
}
	}
