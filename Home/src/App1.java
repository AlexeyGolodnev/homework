import java.util.Scanner;


public class App1 {
	public static void main(String[] args){
		
		int i = 1;
		while (i != 0)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("������� ����� ����� (p.s. 0 ��� ����������)");
			if (sc.hasNextInt()){
				i = sc.nextInt();
				if (i != 0){
					if (i % 3 == 0){
						System.out.println("��������� ����� ������� �� 3!");
			    	}else{
						System.out.println("��������� ����� �� ������� �� 3!");	
					}
				}else{
					System.out.println("���������� ���������.");	
				}
			}else{
				System.out.println("�� ����� �� ����� �����!");
				
			}
		}	
	}
}
