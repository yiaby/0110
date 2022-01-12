package 연산자예제;

public class OperatorEx04 {

	public static void main(String[] args) {
		int x = 10;
		//int y = x++; //후처리(postfix)
		int y = ++x;  //전처리 (prefix)
		
		//System.out.println(y); //10
        //System.out.println(x); //11
	
		System.out.println(y); //11
        System.out.println(x); //11
	
	}

}
