package iodemo;

import java.io.Console;

public class ConsoleDemo {

	public static void main(String[] args) {
		Console c = System.console(); 
		System.out.println("Enter name");
		String name = c.readLine();
		System.out.println("Enter password");
		char password[] = c.readPassword();
		String strPassword = new String(password);
		System.out.println("Name => "+name);
		System.out.println("Password => "+strPassword);
	}
}
