package mum.edu.booking_system.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import mum.edu.booking_system.domain.Hotel;

public interface HotelService {
	
    public void save(Hotel hotel);
	
	public Hotel getHotelById(Integer hotelId);
	
	List<Hotel> /*Page<Hotel>*/ getAllHotelsByLocation(String state, String city/*, String postcode, Pageable pageable*/);

}
