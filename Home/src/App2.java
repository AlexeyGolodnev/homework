import java.util.Scanner;


public class App2 {
	public static void main(String[] args) {
		int n = 1;
		int[] arr;
		while (n != 0)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("������� ����������� ������� (p.s. ��� ���������� ������� '0') ");
			if (sc.hasNextInt()){
				n = sc.nextInt();
				if (n!=0){
					arr = new int[n];
					//���� �������
					 for (int i=0; i< arr.length; i++){
				            System.out.print("������� "+(i+1)+" - ������� ");
				            arr[i]=sc.nextInt();
				        }
					 System.out.println();
					 //����� �������
					 for (int i=0; i< arr.length; i++){
				            System.out.print(" "+arr[i]);
				        }
					 System.out.println();
					 System.out.println("����� ������������� ������ ��������� ������� � �� �����: ");
					 int s=0;
					 for (int i=0; i< arr.length; i++){
						 	if ((arr[i] < 0) && ((i+1) % 2 == 0)){
						 		s=s+arr[i];
					            System.out.print(" "+arr[i]);
					            }
				        }
					 System.out.println();
					 System.out.println("����� = "+s);
					 System.out.print("����� ������������ ���������, ������������� ����� ������������ ��� ������������ ����������: ");
					 int max = arr[0], min=arr[0];
					 int maxi= 0, mini = 0;
					 int p = 1;
					 for (int i=1; i< arr.length; i++){
						 if (max < arr[i])
						 {
							 max = arr[i];
							 maxi = i;
						 }
						 if (min > arr[i])
						 {
							 min = arr[i];
							 mini=i;
						 }
				        }
					 System.out.println("Max = "+max);
			         System.out.println("Min = "+min);
			         if (maxi > mini){
			        	 if (maxi-1 == mini)
			        	 {
			        		 p = 0;
			        	 }
			        	 for (int i = mini+1; i<maxi; i++)
			        	 {
			        		 p = p*arr[i];
			        	 }
			         }else{
			        	 if (maxi+1 == mini)
			        	 {
			        		 p = 0;
			        	 }
			        	 for (int i = maxi+1; i<mini; i++)
			        	 {
			        		 p = p*arr[i];
			        	 }
			         }
			         System.out.println("������������ = "+p);
				}else{
					 System.out.println("��������� ���������.");
				}
				
			}else{
				System.out.println("����������� ������� ������ �������� �� ������ �����!");
				
			}
		}
	
	}

}
