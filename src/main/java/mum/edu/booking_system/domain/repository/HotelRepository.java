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

@Repository
public interface HotelRepository extends CrudRepository<Hotel, Integer>/*PagingAndSortingRepository<Hotel, Long>*/{


    @Query("select h from Hotel h " +
            "where upper(h.address.state) = coalesce(upper(:state), upper(h.address.state)) " +
            "and upper(h.address.city) = coalesce(upper(:city), upper(h.address.city)) "
    )
    List<Hotel>/*Page<Hotel>*/ findAllHotelsByLocation(@Param("state") String state,
                                  @Param("city") String city/*,
                                  @Param("postcode") String postcode,
                                  Pageable pageable*/);

}
