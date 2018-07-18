package mum.edu.booking_system.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import mum.edu.booking_system.domain.Rooms;
import mum.edu.booking_system.domain.repository.RoomRepository;
import mum.edu.booking_system.service.RoomService;

@Service
@Transactional
public class RoomServiceImpl implements RoomService {
	
	@Autowired
	RoomRepository roomRepository;
	
	@Override
	public void save(Rooms room) {
		
		roomRepository.save(room);

	}

	@Override
	public Rooms findRoomById(Integer roomId) {
		
		return roomRepository.locateOneRoomsById(roomId);
	}

	@Override
	public List<Rooms> getAllRooms() {
		
		return (List<Rooms>) roomRepository.findAll();
	}

}
