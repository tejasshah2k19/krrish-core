package streamdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FindDemo {

	public static void main(String[] args) {

		List<Student> students = new ArrayList<Student>();

		Student s1 = new Student();
		s1.setFirstName("ram");
		s1.setCity("ayodhya");
		s1.setRank(1);

		Student s2 = new Student();
		s2.setFirstName("sita");
		s2.setCity("ayodhya");
		s2.setRank(2);

		Student s3 = new Student();
		s3.setFirstName("ravan");
		s3.setCity("lanka");
		s3.setRank(3);

		Student s4 = new Student();
		s4.setFirstName("laxman");
		s4.setCity("ayodhya");
		s4.setRank(4);

		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);

		students.stream().filter(s -> s.getFirstName().startsWith("r"))
				.forEach(s -> System.out.println(s.getFirstName()));
		boolean allInAyodhya = students.stream().allMatch(s -> s.getCity().equals("ayodhya"));
		System.out.println("All Students Belongs Ayodhya? -> " + allInAyodhya);

		// is any 1 belongs to lanka?
		boolean atleastOneFromLanka = students.stream().anyMatch(s -> s.getCity().equals("lanka"));
		System.out.println("Atleast a single students from Lanka? -> " + atleastOneFromLanka);

		Optional<Student> std = students.stream().findFirst().filter(s -> s.getCity().equals("ayodhya"));

		if(std.isPresent()) {
			System.out.println("from ayodhya -> "+std.get().getFirstName());
		}else {
			System.out.println("No Student Found --> Ayodhya");
		}

		Optional<Student> std1 = students.stream().findFirst().filter(s -> s.getCity().equals("lanka"));

		if(std1.isPresent()) {
			System.out.println("from GJ -> "+std.get().getFirstName());
		}else {
			System.out.println("No Student Found --> GJ");
		}
	
		System.out.println(std1.orElse(null));
	}
}

class Student {
	private String firstName;
	private Integer studentId;
	private String city;
	private int rank;

	public Student() {
		this.studentId = (int) (Math.random() * 100000000);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

}