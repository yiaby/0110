package 제어문예제;
/*
 * 순서도
 */
public class ForEx03 {

	public static void main(String[] args) {
		//1분터 100까지의 짝수의 합.
	    int evenSum = 0;
		for(int i=1; i<=100; i++) {
			if(i%2==1) {
				evenSum=evenSum+i;
				 
			}
		}
		System.out.println(evenSum);	
	
	}

}
