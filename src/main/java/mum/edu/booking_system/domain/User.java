/**
 * 
 */
package mum.edu.booking_system.domain;

import java.util.Set;

/**
 * @author alain
 *
 */
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import mum.edu.booking_system.annotation.FieldsValueMatch;

@FieldsValueMatch.List({ 
    @FieldsValueMatch(
      field = "password", 
      fieldMatch = "confirmPassword", 
      message = "Password and Confirm Password fields should be same"
    )
})
@Entity
public class User {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="userId")
	private Integer userId;
	
	@Size(min=4, max=20)
	@Column(name="firstName")
	private String firstName;
	
	@Column(name="lastName")
	@Size(min=4, max=20)
	private String lastName;
	
	@Column(name="address")
	@NotEmpty
	private String address;
	
	@Column(name="mobile")
	@NotEmpty
	private String mobile;
	
	@Column(name="email")
	@NotEmpty @Email
	private String email;
	
	@Column(name="password")
	@NotNull @Size(min=5)
	private String password;
	
	private String confirmPassword;
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Room_booking> room_bookings;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<Room_booking> getRoom_bookings() {
		return room_bookings;
	}

	public void setRoom_bookings(Set<Room_booking> room_bookings) {
		this.room_bookings = room_bookings;
	}
	
	
	
	
}
