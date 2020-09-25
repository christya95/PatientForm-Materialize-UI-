package ca.sheridancollege.christya.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ca.sheridancollege.christya.beans.Patient;
import ca.sheridancollege.christya.repositories.PatientList;

@Controller
public class PatientController {
	// @Autowired reflection
	private PatientList patientList;

	// @Autowired constructor
	/*
	 * public PatientController(PatientList patientList) { super(); this.patientList
	 * = patientList; }
	 */

	public PatientList getPatientList() {
		return patientList;
	}

	@Autowired //setter
	public void setPatientList(PatientList patientList) {
		this.patientList = patientList;
	}

	//Loads the index.html page
	@GetMapping("/")
	public String goIndex(Model model) {

		System.out.println("Clearing List");
		patientList.emptyList();

		return "index";
	}

	//Loads working.html and also creates and adds patient information from input to the List
	@PostMapping("/processForm")
	public String forPost(@RequestParam Long patient_id, @RequestParam String patient_name,
			@RequestParam Long doctor_id, @RequestParam String patient_history) {

		Patient patient = new Patient(patient_id, patient_name, doctor_id, patient_history);

		patientList.getPatientList().add(patient);

		System.out.println("***");

		for (Patient p : patientList.getPatientList()) {
			System.out.println(p);
		}

		return "working"; // working.html
	}
}
