import java.util.Scanner;


public class App3 {

	public static void main(String[] args) {
		
		int n = 1;
		int[][] arr;
		while (n != 0)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("������� ����������� ����������� ������� (p.s. ��� ���������� ������� '0') ");
			if (sc.hasNextInt()){
				n = sc.nextInt();
				if (n!=0){
					arr = new int[n][n];
					//���� �������
					 for (int i=0; i< arr.length; i++){
						 for(int j = 0; j < arr.length; j++){
					        System.out.print("������� "+(i+1)+(j+1)+" - ������� ");
					        arr[i][j]=sc.nextInt(); 
						 }
				        }
					 System.out.println();
					 //����� �������
					 for (int i=0;i<arr.length; i++){
				            for (int j =0; j<arr.length; j++) {
				                System.out.print(arr[i][j] + " ");
				            }
				            System.out.println();
				     }
					 int k=0;
					 System.out.print("���������� ����� �� ���������� ����: ");
					 for (int i=0;i<arr.length; i++){
				            for (int j =0; j<arr.length; j++) {
				              if (arr[i][j]==0){
				            	  k++;
				            	  break;
				              }
				            }
				     }
					 System.out.println(arr.length - k);
					 System.out.println("������������ �� �����, ������������� � ������� ����� ������ ����: ");
					 int arrTemp[] = null;
					 int x=0;
					 int max;
					 arrTemp = new int[20];
					 max = arr[0][0];
					 for (int i=0;i<arr.length; i++){
				            for (int j =0; j<arr.length; j++) {
				              if(max < arr[i][j])
				              {
				                  max = arr[i][j];
				                  arrTemp[x] = arr[i][j];
				            	  x++;
				              }
				            }
				     }
					 System.out.println("������������ = "+max);
					 int k2=0;
					
					 for (int i=0; i< x; i++){
				            System.out.print(" "+arrTemp[i]);
				        }
					 
					 LOOP:
					 for (int l = x; l > 0; l--)
					 {
						 System.out.print(" "+arrTemp[l]);
						 for (int i=1;i<arr.length; i++){
					            for (int j =1; j<arr.length; j++) {
					            	if(arrTemp[l]==arr[i][j]){
					            		k2++;
					            		if (k2 >= 2){
					            			System.out.println("������������ = "+arrTemp[l]);
					            			break LOOP;
					            		}
					            	}
					            }
					     }
						 k2=0;
					 }
					 
					 
					 
				}else{
					System.out.println("��������� ���������.");
				}
				
			}else{
				System.out.println("����������� ������� ������ �������� �� ������ �����!");
				
			}
		}
		
	}

}
