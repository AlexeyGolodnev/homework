import java.util.Scanner;


public class App2 {
	public static void main(String[] args) {
		int n = 1;
		int[] arr;
		while (n != 0)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Введите размерность массива (p.s. для завершения введите '0') ");
			if (sc.hasNextInt()){
				n = sc.nextInt();
				if (n!=0){
					arr = new int[n];
					//ввод массива
					 for (int i=0; i< arr.length; i++){
				            System.out.print("Введите "+(i+1)+" - элемент ");
				            arr[i]=sc.nextInt();
				        }
					 System.out.println();
					 //вывод массива
					 for (int i=0; i< arr.length; i++){
				            System.out.print(" "+arr[i]);
				        }
					 System.out.println();
					 System.out.println("Вывод отрицательных четных элементов массива и их сумма: ");
					 int s=0;
					 for (int i=0; i< arr.length; i++){
						 	if ((arr[i] < 0) && ((i+1) % 2 == 0)){
						 		s=s+arr[i];
					            System.out.print(" "+arr[i]);
					            }
				        }
					 System.out.println();
					 System.out.println("Сумма = "+s);
					 System.out.print("Вывод произведение элементов, расположенных между максимальным или минимальными элементами: ");
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
			         System.out.println("Произведение = "+p);
				}else{
					 System.out.println("Программа завершена.");
				}
				
			}else{
				System.out.println("Размерность массива должно состоять из целого числа!");
				
			}
		}
	
	}

}
