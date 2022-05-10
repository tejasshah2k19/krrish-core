package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Java7ExceptionDemo {

	public static void main(String[] args) {

		int a = 0;
		int b = 0;
		int c = 0;
		Scanner ss = new Scanner(System.in);
		// Autocloseble

		try (Scanner scr = new Scanner(System.in);) {
			System.out.println("enter two numbers");
			a = scr.nextInt();
			b = scr.nextInt();
			c = a / b;
			ss.nextInt();
		} catch (ArithmeticException | InputMismatchException e) {
			System.out.println("invalid input");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("====");
		} catch (Exception e) {

		}

	}
}
