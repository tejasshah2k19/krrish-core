package exception;

public class Abc {

	public static void main(String[] args) {

		String email = "abc@gmail.com";
		String password = "password";

		try {
			System.out.println(GoogleApi.gLogin(email, password));
		} catch (InvalidEmailException e) {
			e.printStackTrace();
		}

	}
}
