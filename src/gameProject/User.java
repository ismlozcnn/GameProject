package gameProject;

public class User {
	private String nationalIdentity;
	private String firstName;
	private String lastName;
	private int birthYear;
	public User(String nationalIdentity, String firstName, String lastName, int birthYear) {		
		this.nationalIdentity = nationalIdentity;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = birthYear;
	}
	public String getNationalIdentity() {
		return nationalIdentity;
	}
	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
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
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	

}
