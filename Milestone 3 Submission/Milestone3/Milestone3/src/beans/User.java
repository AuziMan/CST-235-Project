package beans;

import javax.faces.bean.ManagedBean;

@ManagedBean
// Creates a User object to be used when registering or logging into the Milestone application.
public class User {

    // Declares the global variables for the User object
	String firstName;
	String lastName;
	String userName;
	String password;
	String email;

    // default constructor
	public User() {
		firstName = "";
		lastName = "";
		userName = "";
		password = "";
		email = "";
	}

    
    // Getter and Setter methods 
    
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

}
