package �������;

public class SwichEx01 {

	public static void main(String[] args) {
		char grade = 'B'; //ȸ���� �����'B'���
		
		switch(grade) {
		    case 'A':
		    case 'a':
		    	System.out.println("��� ȸ���Դϴ�.");
		    	break; //[����]
		    case 'B':
		    case 'b':
		    	System.out.println("�Ϲ� ȸ���Դϴ�.");
		    	break;
		    default:
		    	System.out.println("�մ� �Դϴ�.");
		    	
		}
		

	}

}
