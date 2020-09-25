package ca.sheridancollege.christya.repositories;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.stereotype.Component;

import ca.sheridancollege.christya.beans.Patient;

@Component
public class PatientListImpl implements PatientList{
	 
	private List<Patient> patientList = new CopyOnWriteArrayList<Patient>();

	//Retrieve the patients
	@Override
	public List<Patient> getPatientList() {
		return patientList;
	}

	//Set the patients
	@Override
	public void setPatientList(List<Patient> patientList) {
		this.patientList = patientList;
		
	}

	//Clear the list
	@Override
	public void emptyList() {
		patientList.clear();
		
	}

}
