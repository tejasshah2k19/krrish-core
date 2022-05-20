package iodemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		User u = new User();
		u.email = "p@p.com";
		u.password = "password";
		u.setFirstName("pankaj");
		u.balance = 1000;
		u.address.city = "ahd";

		File f = new File("user.ser");
		f.createNewFile();

		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(u);
		oos.close();
		System.out.println("done....");
	

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
		User u2 = (User) ois.readObject();
		System.out.println(u2.balance);
		System.out.println(u2.email);
		System.out.println(u2.password);
	}

}

//marker 
class User implements Serializable {
	private String firstName;
	String email;
	transient String password;
	int balance;
	Address address = new Address();
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

}

class Address implements Serializable{
	String city;
	// 
	//
}

