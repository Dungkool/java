package calculator;

public class Ui {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.sum(10, 20);		// 화면에서 계산할 값을 입력
		int result = 0;			// int로 받았으니 int로 선언
		result = cal.sum(10, 20);
		System.out.println(result); 	// 화면에서 값을 출력
		cal.save(result);			// save는 int 형식으로 값을 넣어야 함
		System.out.println("OK");	// 위에 코드가 문제가 없으면 OK가 출력, 예외 처리로 void의 return이 없어도 오류가 났는지 확인하는 것
	}

}
