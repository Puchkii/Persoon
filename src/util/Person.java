package util;

public class Person{

	private int id;
	private String firstName;
	private String lastName;
	private String birthday;

	public Person(String firstName, String lastName, String birthday){
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthday = birthday;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String[] getRow() {
		return new String[]{getFirstName(), getLastName(), getBirthday()};
	}
	
	public String toString() {
		return firstName;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
	public String toString1() {
		return birthday;
	}
}