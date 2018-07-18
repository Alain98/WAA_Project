package mum.edu.booking_system.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;

import mum.edu.booking_system.domain.Hotel;
import mum.edu.booking_system.domain.Rooms;

public interface HotelService {
	
    public void save(Hotel hotel);
	
	public Hotel getHotelById(Integer hotelId);
	
	public List<Rooms> getRoomsByHotelId(Integer hotelId);
	
	public void initialiseHotelsInDatabase();
	
	public List<Hotel> /*Page<Hotel>*/ getAllHotelsByLocation(String state, String city/*, String postcode, Pageable pageable*/);

}
