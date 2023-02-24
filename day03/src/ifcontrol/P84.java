package ifcontrol;

public class P84 {

	public static void main(String[] args) {
	
		String grade = "VIP";
		String gender = "F";
		double sum = 90.0;
		
		System.out.println("Start.....");
		
		if(gender.equals("M")) {
			System.out.println("Male.....");
			// return
		} else {
			System.out.println("Female.....");
		}
		
//		if(gender.equals("M") && sum >= 90) {
//			grade="MVIP";
//			
//		}else if(gender.equals("F") && sum >= 90) {
//			grade="FVIP";
//			
//		}else if(gender.equals("M") && sum >= 90) {
//			grade="FVIP";
//		}
	
		if(gender.equals("M")) {
			if(sum >= 90) { grade = "MVIP";}
			else if(sum >= 80) { grade = "MGOLD"; }
			else { grade = "MNORMAL";}
				
		}else {
			if(sum >= 90) { grade = "FVIP";}
			else if(sum >= 80) { grade = "FGOLD"; }
			else { grade = "FNORMAL";}
		}
			
		switch(grade) {
		case "FVIP" : 
		case "MVIP" :
			sum += 100;
			break; // break;를 작성해야 조건이 맞을 때 끝남, 안 그러면 누적으로 계산
		case "FGOLD" :
		case "MGOLD" : 
			sum += 90;
			break;
		default :
			sum += 10;
		}
	
		System.out.printf("%s, %s, %4.2f \n", grade, gender, sum);
		System.out.println("End.....");
	}
}
