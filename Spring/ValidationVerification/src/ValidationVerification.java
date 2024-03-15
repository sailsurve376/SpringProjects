
public class ValidationVerification {
private String username="Sail376";
private String pass="sail@376";
private String email="sail@gmail.com";
public String getUsername() {
	return username;
}
public void setUsername(String usnername) {
	this.username = usnername;
}
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public void changeUsername(String oldUsername,String pass,String newUsername) {
	if(this.pass.equals(pass) && this.username.equals(oldUsername)) {
		this.username=newUsername;
		System.out.println("Username updated. New username is: "+this.username);
	}
	else {
		System.out.println("Invalid username or password");
	}
}
public void changePass(String username,String oldPass,String newPass) {
	if(this.pass.equals(oldPass) && this.username.equals(username)) {
		this.pass=newPass;
		System.out.println("Password changed. New password is: "+this.pass);
	}
	else {
		System.out.println("Invalid username or password");
	}
}
@Override
public String toString() {
	return "ValidationVerification [username=" + username + ", pass=" + pass + ", email=" + email + "]";
}

}
