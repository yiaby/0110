package �������;
/*
 * ������
 */
public class ForEx03 {

	public static void main(String[] args) {
		//1���� 100������ ¦���� ��.
	    int evenSum = 0;
		for(int i=1; i<=100; i++) {
			if(i%2==1) {
				evenSum=evenSum+i;
				 
			}
		}
		System.out.println(evenSum);	
	
	}

}
