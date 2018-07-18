package mum.edu.booking_system.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mum.edu.booking_system.domain.Room_booking;
import mum.edu.booking_system.domain.repository.Room_bookingRepository;
import mum.edu.booking_system.service.Room_bookingService;


@Service
@Transactional
public class Room_bookingServiceImpl implements Room_bookingService {
	
	@Autowired
	Room_bookingRepository room_bookingRepository;
	
	@Override
	public void save(Room_booking room_booking) {
		
		room_bookingRepository.save(room_booking);

	}

	@Override
	public Room_booking findRoom_bookingById(Integer room_bookingId) {
		
		return room_bookingRepository.locateOneRoom_bookingById(room_bookingId);
	}

	@Override
	public List<Room_booking> getAllRoom_booking() {
		
		return (List<Room_booking>)room_bookingRepository.findAll();
	}

}
