package com.bridgelabz.oops.Clinique;

public class Appointment {

	String doctorName;
	String doctorId;
	String patientName;
	String patientId;
	String Availibility;
	String patientPhone;

	public Appointment() {

	}

	public Appointment(String doctorId, String doctorName, String patientName, String patientId, String patientPhone,
			String Availibility) {
		this.doctorName = doctorName;
		this.doctorId = doctorId;
		this.patientName = patientName;
		this.patientId = patientId;
		this.Availibility = Availibility;
		this.patientPhone = patientPhone;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public String getAvailibility() {
		return Availibility;
	}

	public void setAvailibility(String availibility) {
		Availibility = availibility;
	}

	public String getPatientPhone() {
		return patientPhone;
	}

	public void setPatientPhone(String patientPhone) {
		this.patientPhone = patientPhone;
	}

}
