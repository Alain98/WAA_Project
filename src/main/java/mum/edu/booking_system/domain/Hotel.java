/**
 * 
 */
package mum.edu.booking_system.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * @author alain
 *
 */

@Entity
public class Hotel {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column
	private Integer hotelId;
	
	@Column
	private String name;
	
	@Column
	private String location;
	
	@Column
	private String type;
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Rooms> rooms;

	public Integer getHotelId() {
		return hotelId;
	}

	public void setHotelId(Integer hotelId) {
		this.hotelId = hotelId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Set<Rooms> getRooms() {
		return rooms;
	}

	public void setRooms(Set<Rooms> rooms) {
		this.rooms = rooms;
	}
	
	

}
