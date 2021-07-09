import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero");
		int num = sc.nextInt();
		
		factorial(num);

	}
	
	public static void factorial(int num) {
		int factorial = 1;
		for (int i = 1; i <= num; i++) {
			factorial = factorial*i;
		}
		System.out.println("El factorial de " + num + " es " + factorial);
	}

}
