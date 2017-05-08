import java.util.Scanner;


public class App3 {

	public static void main(String[] args) {
		
		int n = 1;
		int[][] arr;
		while (n != 0)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Введите размерность двухмерного массива (p.s. для завершения введите '0') ");
			if (sc.hasNextInt()){
				n = sc.nextInt();
				if (n!=0){
					arr = new int[n][n];
					//ввод массива
					 for (int i=0; i< arr.length; i++){
						 for(int j = 0; j < arr.length; j++){
					        System.out.print("Введите "+(i+1)+(j+1)+" - элемент ");
					        arr[i][j]=sc.nextInt(); 
						 }
				        }
					 System.out.println();
					 //вывод массива
					 for (int i=0;i<arr.length; i++){
				            for (int j =0; j<arr.length; j++) {
				                System.out.print(arr[i][j] + " ");
				            }
				            System.out.println();
				     }
					 int k=0;
					 System.out.print("Количество строк не содержащих нули: ");
					 for (int i=0;i<arr.length; i++){
				            for (int j =0; j<arr.length; j++) {
				              if (arr[i][j]==0){
				            	  k++;
				            	  break;
				              }
				            }
				     }
					 System.out.println(arr.length - k);
					 System.out.println("Максимальное из чисел, встречающихся в таблице более одного раза: ");
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
					 System.out.println("Максимальное = "+max);
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
					            			System.out.println("Максимальное = "+arrTemp[l]);
					            			break LOOP;
					            		}
					            	}
					            }
					     }
						 k2=0;
					 }
					 
					 
					 
				}else{
					System.out.println("Программа завершена.");
				}
				
			}else{
				System.out.println("Размерность массива должно состоять из целого числа!");
				
			}
		}
		
	}

}
