package exception;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {
	// thread

	public void dbConnection() throws SQLException {
		Connection con = null;
		con = DriverManager.getConnection("", "", "");

	}

	public static void main(String[] args) {
		int a, b, c = 0;
		Scanner scr = new Scanner(System.in);

		System.out.println("Enter two numbers");
		try {
			a = scr.nextInt();
			b = scr.nextInt();
			c = a / b;
			System.out.println("div = > " + c);
		} catch (ArithmeticException e) {
			System.out.println("do not enter 0 in second argument...");
		} catch (InputMismatchException e) {
			System.out.println("please enter only non fraction numbers/digits");
		}

		catch (Exception e) {
			System.out.println("Something went wrong please try again!!!");
			// sendErrorToDeveloper(email,e.printStackTrace());
			e.printStackTrace();
		} finally {
			//
		}
	}
}

//try -- catch 
//try --catch catch 
//try catch(n) finally
//try --finally
//try --- not working 
