package mum.edu.booking_system.service;

import java.util.List;
import mum.edu.booking_system.domain.Room_booking;


public interface Room_bookingService {
	
    public void save(Room_booking room_booking);
	
	public Room_booking findRoom_bookingById(Integer room_bookingId);
	
	public List<Room_booking> getAllRoom_booking();

}
