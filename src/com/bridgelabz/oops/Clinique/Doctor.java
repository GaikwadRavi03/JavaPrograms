package com.bridgelabz.oops.Clinique;

public class Doctor {

	String doctorId;
	String doctorName;
	String doctorAvailibity;
	String doctorSpecalization;
	int amCount = 0;
	int pmCount = 0;

	public int getAmCount() {
		return amCount;
	}

	public void setAmCount(int amCount) {
		this.amCount = amCount;
	}

	public int getPmCount() {
		return pmCount;
	}

	public void setPmCount(int pmCount) {
		this.pmCount = pmCount;
	}

	public Doctor() {

	}

	public Doctor(String doctorId, String doctorName, String doctorAvailibity, String doctorSpecalization) {
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.doctorAvailibity = doctorAvailibity;
		this.doctorSpecalization = doctorSpecalization;
		// this.amCount=amCount;
		// this.pmCount=pmCount;

	}

	public String getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getDoctorAvailibity() {
		return doctorAvailibity;
	}

	public void setDoctorAvailibity(String doctorAvailibity) {
		this.doctorAvailibity = doctorAvailibity;
	}

	public String getDoctorSpecalization() {
		return doctorSpecalization;
	}

	public void setDoctorSpecalization(String doctorSpecalization) {
		this.doctorSpecalization = doctorSpecalization;
	}

}
