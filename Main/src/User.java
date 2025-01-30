public class User {
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private String mobileNumber;

	public User(String username, String password, String firstName, String lastName, String mobileNumber) {
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getPassword() {
		return password;
	}

	public String getUsername() {
		return username;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public String getLastName() {
		return lastName;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
}
