package mum.edu.booking_system.service;

import java.util.List;

import mum.edu.booking_system.domain.Rooms;

public interface RoomService {
	
	public void save(Rooms room);
	
	public Rooms findRoomById(Integer roomId);
	
	public List<Rooms> getAllRooms();

}
