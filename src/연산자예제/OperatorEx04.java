package �����ڿ���;

public class OperatorEx04 {

	public static void main(String[] args) {
		int x = 10;
		//int y = x++; //��ó��(postfix)
		int y = ++x;  //��ó�� (prefix)
		
		//System.out.println(y); //10
        //System.out.println(x); //11
	
		System.out.println(y); //11
        System.out.println(x); //11
	
	}

}
