package �����ڿ���;

public class OperatorEx03 {

	public static void main(String[] args) {
		String strVar1 = "����ȣ";
	    String strVar2 = "����ȣ";
	    
	    String strVar3 = new String("����ȣ");
	    
	    System.out.println(strVar1==strVar2); //true
	    System.out.println(strVar1==strVar3); //false
	    
	    System.out.println(strVar1.equals(strVar2)); //true equals:�ּҰ�x, ���ڿ��� ������
	    System.out.println(strVar1.equals(strVar3)); //true
	}
	

}
