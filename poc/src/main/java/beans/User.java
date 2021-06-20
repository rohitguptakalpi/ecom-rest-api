package beans;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "user_table")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int userId ;
	
	
	String firstName;
	String lastName;
	String email;
	String phoneNo;
	String password;
	String dateofbirth;
	
	
	
	public User() {
	}
	
	public User (String firstName, String lastName, String email, String phoneNo, String password,
			String dateofbirth) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNo = phoneNo;
		this.password = password;
		this.dateofbirth = dateofbirth;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	@Override
	public String toString() {
		return "user [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", phoneNo=" + phoneNo + ", password=" + password + ", dateofbirth=" + dateofbirth + "]";
	}
	
	

}
