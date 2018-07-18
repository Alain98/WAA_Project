package mum.edu.booking_system.domain.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import mum.edu.booking_system.domain.Room_booking;


@Repository
public interface Room_bookingRepository extends CrudRepository<Room_booking, Integer>{
	
	@Query("select rb from Room_booking rb where rb.Room_bookingId = :room_bookingId")
	Room_booking locateOneRoom_bookingById(@Param("room_bookingId") Integer Room_bookingId);

}
