package com.bridgelabz.oops.clinique;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelabz.utility.Utility;

public class DoctorPatientData {
	static ObjectMapper mapper = new ObjectMapper();
	int choice = 0;
	static List<Doctor> doctorlist = new ArrayList<>();
	static List<Patient> patientlist = new ArrayList<>();
	static List<Appointment> applist = new ArrayList<>();

	Scanner sc = new Scanner(System.in);

	{
		try {
			doctorlist = mapper.readValue(
					new File("/home/admin1/eclipse-workspace/BridgeLabzPrograms/src/com/bridgelabz/files/doctor.json"),
					new TypeReference<List<Doctor>>() {
					});
			patientlist = mapper.readValue(
					new File("/home/admin1/eclipse-workspace/BridgeLabzPrograms/src/com/bridgelabz/files/patient.json"),
					new TypeReference<List<Patient>>() {
					});
			applist = mapper.readValue(new File(
					"/home/admin1/eclipse-workspace/BridgeLabzPrograms/src/com/bridgelabz/files/appointment.json"),
					new TypeReference<List<Appointment>>() {
					});
		} catch (Exception e) {

		}
	}

	public void opeartion() {

		do {
			System.out.println("**********Data*********");
			System.out.println("1.Doctor Data");
			System.out.println("2.Patient Data");
			System.out.println("3.Appointment");
			System.out.println("4.Exit");
			choice = Utility.inputNumber();
			switch (choice) {
			case 1:
				printDoctorData(doctorlist);
				break;

			case 2:
				printPatientData(patientlist);
				break;

			case 3:
				printAppointmentData(applist);
				break;

			case 4:
				System.out.println("Exit");
				break;

			default:
				System.out.println("Please! enter correct choice");
			}
		} while (choice != 4);
	}

	public void printDoctorData(List<Doctor> list) {
		System.out.println("ID       Name            Availability            Specialization   amCount   pmCount ");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getDoctorId() + "  " + list.get(i).getDoctorName() + "       "
					+ list.get(i).getDoctorAvailibity() + "       " + list.get(i).getDoctorSpecalization() + "       "
					+ list.get(i).getAmCount() + "       " + list.get(i).getPmCount());
		}
	}

	public void printPatientData(List<Patient> list) {
		System.out.println("ID    Name     Age    Mobile Number");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getPatientId() + "  " + list.get(i).getPatientName() + "       "
					+ list.get(i).getAge() + "       " + list.get(i).getMobileNo());
		}
	}

	private void printAppointmentData(List<Appointment> list) {
		// TODO Auto-generated method stub
		System.out.println(
				"DrName   DrId   PatientName    PatientId    DrAvailibility       PatientPhone    TimeAndDate");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getDoctorName() + "      " + list.get(i).getDoctorId() + "      "
					+ list.get(i).getAvailibility() + "            " + list.get(i).getPatientId() + "      "
					+ list.get(i).getPatientName() + "      " + list.get(i).getPatientPhone() + "      "
					+ list.get(i).getCurrentDate());
		}
	}
}