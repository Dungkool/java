package ifcontrol;

public class P89 {

	public static void main(String[] args) {
	
		String grade = "VIP";
		String gender = "M";
		double sum = 60.0;
		
		System.out.println("Start.....");
		
		if(gender.equals("M")) {
			System.out.println("Male.....");
			// return
		} else {
			System.out.println("Female.....");
		}
		
	

		grade = (gender.equals("M")) ?
			((sum >= 90) ? "MVIP" : (sum >= 80) ? "MGOLD" : "MNORMAL") :  // M이면 2항
			((sum >= 90) ? "FVIP" : (sum >= 80) ? "FGOLD" : "FNORMAL");   // M이 아니면 3항
			
//		if(gender.equals("M")) {
//		grade = (sum >= 90) ? "MVIP" : (sum >= 80) ? "MGOLD" : "MNORMAL";
//		}else {
//		grade = (sum >= 90) ? "FVIP" : (sum >= 80) ? "FGOLD" : "FNORMAL";
//		}	
		
		
		System.out.printf("%s, %s, %4.2f \n", grade, gender, sum);
		System.out.println("End.....");
	}
}
