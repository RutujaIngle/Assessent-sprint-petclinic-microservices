package org.springframework.samples.petclinic.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.hospital.service.HospitalService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.samples.petclinic.hospital.model.Appointment;;

@RestController
public class HospitalController {

@Autowired
HospitalService hospitalService;	

@GetMapping("/appointment")
private List<Appointment> getAppointments(){
	return hospitalService.getAppointments();
}
	
@PostMapping("/appointment")
private int saveAppointment(@RequestBody Appointment appointment) {
	return hospitalService.saveOrUpdateAppointment(appointment);
}

@PutMapping("/appointment")
private int updateAppointment(@RequestBody Appointment appointment) {
	return hospitalService.saveOrUpdateAppointment(appointment);
}

@DeleteMapping("/appointment")
private void deleteAppintment(@RequestBody int appointmentId) {
	hospitalService.deleteAppointment(appointmentId);
	
}
}
