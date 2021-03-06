/**
 * 
 */
package mum.edu.booking_system.domain;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author alain
 *
 */
@Entity
public class Room_booking {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column
	private Integer Room_bookingId;
	
	@Column
	@NotEmpty
	private String checkIn;
	
	@Column
	@NotEmpty
	private String checkOut;
	
	@Column
	private int adults;
	
	@Column
	private int children;
	
	@Column
	private Integer roomId;
	
	@Column
	private Integer userId;
	
	@Column
	private Integer hotelId;
	
	@Valid
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="payment_id", unique = true )
	private Payment payment;

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public Integer getRoom_bookingId() {
		return Room_bookingId;
	}

	public void setRoom_bookingId(Integer room_bookingId) {
		Room_bookingId = room_bookingId;
	}

	public String getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(String checkIn) {
		this.checkIn = checkIn;
	}

	public String getCheckOut() {
		return checkOut;
	}

	public void setCheckOut(String checkOut) {
		this.checkOut = checkOut;
	}

	public int getAdults() {
		return adults;
	}

	public void setAdults(int adults) {
		this.adults = adults;
	}

	public int getChildren() {
		return children;
	}

	public void setChildren(int children) {
		this.children = children;
	}

	public Integer getRoomId() {
		return roomId;
	}

	public void setRoomId(Integer roomId) {
		this.roomId = roomId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getHotelId() {
		return hotelId;
	}

	public void setHotelId(Integer hotelId) {
		this.hotelId = hotelId;
	}
	
	

}
