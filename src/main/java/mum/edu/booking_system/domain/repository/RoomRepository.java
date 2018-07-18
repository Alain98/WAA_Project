package mum.edu.booking_system.domain.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import mum.edu.booking_system.domain.Rooms;

@Repository
public interface RoomRepository extends CrudRepository<Rooms, Integer>{
	
	@Query("select r from Rooms r where r.roomsId = :roomsId")
	Rooms locateOneRoomsById(@Param("roomsId") Integer roomsId);
}
