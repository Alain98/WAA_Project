package mum.edu.booking_system.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import mum.edu.booking_system.domain.Hotel;
import mum.edu.booking_system.domain.repository.HotelRepository;
import mum.edu.booking_system.service.HotelService;

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
		return hotelRepository.findOne(hotelId);
	}

}
