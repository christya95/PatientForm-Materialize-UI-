package ca.sheridancollege.christya.beans;

import java.io.Serializable;

public class Patient implements Serializable {

	//Creating instance variables for Patient
	private Long patient_id;
	private String patient_name;
	private Long doctor_id;
	private String patient_history;

	public Long getPatient_id() {
		return patient_id;
	}

	public void setPatient_id(Long patient_id) {
		this.patient_id = patient_id;
	}

	public String getPatient_name() {
		return patient_name;
	}

	public void setPatient_name(String patient_name) {
		this.patient_name = patient_name;
	}

	public Long getDoctor_id() {
		return doctor_id;
	}

	public void setDoctor_id(Long doctor_id) {
		this.doctor_id = doctor_id;
	}

	public String getPatient_history() {
		return patient_history;
	}

	public void setPatient_history(String patient_history) {
		this.patient_history = patient_history;
	}

	public Patient(Long patient_id, String patient_name, Long doctor_id, String patient_history) {
		super();
		this.patient_id = patient_id;
		this.patient_name = patient_name;
		this.doctor_id = doctor_id;
		this.patient_history = patient_history;
	}

	public Patient() {
		super();
	}

	@Override
	public String toString() {
		return "Patient [patient_id=" + patient_id + ", patient_name=" + patient_name + ", doctor_id=" + doctor_id
				+ ", patient_history=" + patient_history + "]";
	}

}
