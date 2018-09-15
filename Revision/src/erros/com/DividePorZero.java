package erros.com;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DividePorZero {
	public static void main(String[] args) {
		//int x = 1 / 0;
		//int x = 1 / "xti";
		try {
			Scanner sc = new Scanner(System.in);
			int x = sc.nextInt();
		} catch (InputMismatchException e1) {
			System.out.println("Erro input!");
			e1.printStackTrace();
			
		}
	}

}
