package midterm1;

public class Student extends Person {
private final String status;

public Student(String name, String address, String phoneNumber, String eMail,
		String status) {
	super(name, address, phoneNumber, eMail);
	this.status = status;
}

public String getStatus() {
	return status;
}

@Override
public String toString() {
	return "Student" + getName();
}

}
