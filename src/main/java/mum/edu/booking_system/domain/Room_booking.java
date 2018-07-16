/**
 * 
 */
package mum.edu.booking_system.domain;

import java.util.Date;

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
	private Date booking_Date;
	
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

	public Date getBooking_Date() {
		return booking_Date;
	}

	public void setBooking_Date(Date booking_Date) {
		this.booking_Date = booking_Date;
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
