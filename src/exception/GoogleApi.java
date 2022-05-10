package exception;

public class GoogleApi {

	public static boolean gLogin(String email, String password) throws InvalidEmailException {
		// x@x.com
		if (!(email.indexOf('@') >= 1) || !(email.lastIndexOf('.') > email.indexOf('@') + 1)) {
			throw new InvalidEmailException();// manual exception
		}
		if (email.equals("abc@gmail.com") && password.equals("password")) {
			return true;
		}

		return false;
	}

	// throw
	// throws
	// Throwable
}

//Exception 
//error message - parent 
class InvalidEmailException extends  Exception {

	public InvalidEmailException() {
		super("Invalid Format For Email");
	}

	public InvalidEmailException(String msg) {
		super(msg);
	}
}
