package com.bridgelabz.oops.clinique;

public class Patient {

	String patientName;
	String patientId;
	String mobileNo;
	String age;

	public Patient() {

	}

	public Patient(String patientName, String patientId, String mobileNo, String age) {
		this.patientName = patientName;
		this.patientId = patientId;
		this.mobileNo = mobileNo;
		this.age = age;

	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

}
