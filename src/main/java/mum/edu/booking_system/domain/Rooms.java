/**
 * 
 */
package mum.edu.booking_system.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/**
 * @author alain
 *
 */
@Entity
public class Rooms {
	
	@Id
	//@GeneratedValue(strategy= GenerationType.AUTO)
	@Column
	private Integer roomsId;
	
	@Column 
	private String description;
	
	@Column
	private String type;
	
	@Column 
	private String status;
	
	@Column
	private double costPerNight;
	
	@Column
	private int bed;
	
	public Integer getRoomsId() {
		return roomsId;
	}

	public void setRoomsId(Integer roomsId) {
		this.roomsId = roomsId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getCostPerNight() {
		return costPerNight;
	}

	public void setCostPerNight(double costPerNight) {
		this.costPerNight = costPerNight;
	}

	public int getBed() {
		return bed;
	}

	public void setBed(int bed) {
		this.bed = bed;
	}

}
