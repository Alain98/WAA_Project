package mum.edu.booking_system.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import mum.edu.booking_system.domain.Hotel;
import mum.edu.booking_system.domain.Rooms;
import mum.edu.booking_system.domain.repository.HotelRepository;
import mum.edu.booking_system.service.HotelService;
import mum.edu.booking_system.util.Utils;

@Service
@Transactional
public class HotelServiceImpl implements HotelService{
	
	@Autowired
	HotelRepository hotelRepository;
	

	@Override
	public List<Hotel> /*Page<Hotel>*/ getAllHotelsByLocation(String state, String city/*, String postcode, Pageable pageable*/) {

		return (List<Hotel>) hotelRepository.findAllHotelsByLocation(state, city/*, postcode, pageable*/);
	}


	@Override
	public void save(Hotel hotel) {
		hotelRepository.save(hotel);
	}


	@Override
	public Hotel getHotelById(Integer hotelId) {
		return hotelRepository.locateOneHotelById(hotelId);
	}


	@Override
	public List<Rooms> getRoomsByHotelId(Integer hotelId) {
		return hotelRepository.getRoomsByHotelId(hotelId);
	}


	@Override
	public void initialiseHotelsInDatabase() {
		 
	    Hotel h1 = new Hotel();
    	Hotel h2 = new Hotel();
    	Hotel h3 = new Hotel();
	 	Utils.initialise(h1, h2, h3);
	 	save(h1);
	 	save(h2);
	 	save(h3);	
	}

}
