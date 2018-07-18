/**
 * 
 */
package mum.edu.booking_system.domain;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
	private LocalDate checkIn;
	
	@Column
	private LocalDate checkOut;
	
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

	public Integer getRoom_bookingId() {
		return Room_bookingId;
	}

	public void setRoom_bookingId(Integer room_bookingId) {
		Room_bookingId = room_bookingId;
	}

	public LocalDate getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(LocalDate checkIn) {
		this.checkIn = checkIn;
	}

	public LocalDate getCheckOut() {
		return checkOut;
	}

	public void setCheckOut(LocalDate checkOut) {
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
