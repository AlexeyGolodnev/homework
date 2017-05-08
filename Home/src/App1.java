import java.util.Scanner;


public class App1 {
	public static void main(String[] args){
		
		int i = 1;
		while (i != 0)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Введите целое число (p.s. 0 для завершения)");
			if (sc.hasNextInt()){
				i = sc.nextInt();
				if (i != 0){
					if (i % 3 == 0){
						System.out.println("Введенное число делится на 3!");
			    	}else{
						System.out.println("Введенное число не делится на 3!");	
					}
				}else{
					System.out.println("Завершение программы.");	
				}
			}else{
				System.out.println("Вы ввели не целое число!");
				
			}
		}	
	}
}
