package com.bridgelabz.oops.clinique;

public class Appointment {

	String doctorName;
	String doctorId;
	String patientName;
	String patientId;
	String Availibility;
	String patientPhone;
	String currentDate;

	public Appointment() {

	}

	public Appointment(String doctorName, String doctorId, String patientName, String patientId, String availibility,
			String patientPhone, String currentDate) {
		this.doctorName = doctorName;
		this.doctorId = doctorId;
		this.patientName = patientName;
		this.patientId = patientId;
		Availibility = availibility;
		this.patientPhone = patientPhone;
		this.currentDate = currentDate;
	}

	public String getCurrentDate() {
		return currentDate;
	}

	public void setCurrentDate(String currentDate) {
		this.currentDate = currentDate;
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
