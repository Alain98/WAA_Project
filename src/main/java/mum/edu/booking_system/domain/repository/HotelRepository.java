package mum.edu.booking_system.domain.repository;


import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import mum.edu.booking_system.domain.Hotel;
import mum.edu.booking_system.domain.Rooms;

@Repository
public interface HotelRepository extends CrudRepository<Hotel, Integer>/*PagingAndSortingRepository<Hotel, Long>*/{

	@Query("select h from Hotel h where h.hotelId = :hotelId")
	Hotel locateOneHotelById(@Param("hotelId") Integer hotelId);
	
	@Query("select h.rooms from Hotel h where h.hotelId = :hotelId")
	List<Rooms> getRoomsByHotelId(@Param("hotelId") Integer hotelId);
	
	
    @Query("select h from Hotel h " +
            "where upper(h.address.state) = upper(:state)" +
            "and upper(h.address.city) = upper(:city)"
    )
    List<Hotel>/*Page<Hotel>*/ findAllHotelsByLocation(@Param("state") String state,
                                  @Param("city") String city/*,
                                  @Param("postcode") String postcode,
                                  Pageable pageable*/);

}
