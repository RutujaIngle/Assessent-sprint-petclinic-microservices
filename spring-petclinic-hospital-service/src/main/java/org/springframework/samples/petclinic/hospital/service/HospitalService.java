package org.springframework.samples.petclinic.hospital.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.hospital.HospitalServiceApplication;
import org.springframework.samples.petclinic.hospital.model.Appointment;
import org.springframework.samples.petclinic.hospital.repository.HospitalRepository;
import org.springframework.stereotype.Service;

@Service
public class HospitalService {
	final public Logger logger = LoggerFactory.getLogger(HospitalServiceApplication.class);
    @Autowired
	HospitalRepository hospitalRepository;
	public List<Appointment> getAppointments() {
		List<Appointment> appointments = new ArrayList<Appointment>();  
		hospitalRepository.findAll().forEach(books1 -> appointments.add(books1));  
		return appointments; 
	}


	public int saveOrUpdateAppointment(Appointment appointment) {
		// TODO Auto-generated method stub
		hospitalRepository.save(appointment);
		logger.info("Appointment saved/updated appointment_id" + appointment.getAppointment_id());
		return appointment.getAppointment_id();
		
	}

	public void deleteAppointment(int appointmentId) {
		// TODO Auto-generated method stub
		hospitalRepository.deleteById(appointmentId);
		logger.info("Appointment deleted appointment_id" + appointmentId);
	}

}
