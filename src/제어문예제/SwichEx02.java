package 제어문예제;

public class SwichEx02 {
/*
 * 자바 6버전 까지는 switch문의 괄호 안에는 정수 타입 변수나 문자 타입민 올 수 있었다.
 * 자바7버전 부터는 String 타입도 올 수 있다.
 */
	public static void main(String[] args) {
		String position = "부장";
		
		
		switch(position) {
		case "부장":
			System.out.println("급여가 700만원");
			break;
		case "과장":
			System.out.println("급여가 500만원");
			break;
		default:
		    System.out.println("급여가 300만원");
		}

	}

}
