package gameProject;

public class Player extends User{
	private int id;
	private String email;
	public Player(String nationalIdentity, String firstName, String lastName, int birthYear, int id, String email) {
		super(nationalIdentity, firstName, lastName, birthYear);
		this.id = id;
		this.email = email;
	}
	 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	

}
