package 연산자예제;

public class OperatorEx03 {

	public static void main(String[] args) {
		String strVar1 = "백태호";
	    String strVar2 = "백태호";
	    
	    String strVar3 = new String("백태호");
	    
	    System.out.println(strVar1==strVar2); //true
	    System.out.println(strVar1==strVar3); //false
	    
	    System.out.println(strVar1.equals(strVar2)); //true equals:주소값x, 문자열이 같은지
	    System.out.println(strVar1.equals(strVar3)); //true
	}
	

}
