package org.springframework.samples.petclinic.hospital.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;


@Entity
@Table
public class Appointment {
	@Id
	@Column
	int appointment_id;
	@NotEmpty
	@Column
	String veterinarian_name ;
	@NotEmpty
	@Column
	String pet_details;
	@Column
	Date dateAndTime; // format 2020-12-23T08:18
	public int getAppointment_id() {
		return appointment_id;
	}
	public void setAppointment_id(int appointment_id) {
		this.appointment_id = appointment_id;
	}
	public String getVeterinarian_name() {
		return veterinarian_name;
	}
	public void setVeterinarian_name(String veterinarian_name) {
		this.veterinarian_name = veterinarian_name;
	}
	public String getPet_details() {
		return pet_details;
	}
	public void setPet_details(String pet_details) {
		this.pet_details = pet_details;
	}
	public Date getDateAndTime() {
		return dateAndTime;
	}
	public void setDateAndTime(Date dateAndTime) {
		this.dateAndTime = dateAndTime;
	}
	
	
	
}
