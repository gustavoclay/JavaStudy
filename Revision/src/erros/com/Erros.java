package erros.com;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Erros {

	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		boolean continua = true;

		do {
			try {
				int x = s.nextInt();
				int y = s.nextInt();
				System.out.println(x / y);
				continua = false;

			} catch (ArithmeticException | InputMismatchException e) {
				System.out.println("Numero inválido!");
				e.printStackTrace();
				s.nextLine();
			} finally {

			}
		} while (continua);
	}

}
