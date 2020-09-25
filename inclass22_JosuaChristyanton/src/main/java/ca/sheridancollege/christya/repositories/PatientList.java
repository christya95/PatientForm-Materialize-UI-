package ca.sheridancollege.christya.repositories;

import java.util.List;

import ca.sheridancollege.christya.beans.Patient;

public interface PatientList{

	public List<Patient> getPatientList();
	public void setPatientList(List<Patient> patientList);
	public void emptyList();
}
