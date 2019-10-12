package com.bridgelabz.oops.clinique;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelabz.utility.Utility;

public class DoctorPatientOperations implements DoctorPatientInterface {

	Scanner sc = new Scanner(System.in);
	Doctor doctor = new Doctor();
	Patient patient = new Patient();
	Appointment app = new Appointment();
	ObjectMapper mapper = new ObjectMapper();

	static List<Doctor> doctorlist = new ArrayList<>();
	static List<Patient> patientlist = new ArrayList<>();
	static List<Appointment> appointmentlist = new ArrayList<>();
	String doctId = "";
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
			appointmentlist = mapper.readValue(new File(
					"/home/admin1/eclipse-workspace/BridgeLabzPrograms/src/com/bridgelabz/files/appointment.json"),
					new TypeReference<List<Appointment>>() {
					});
		} catch (Exception e) {

		}
	}

	public void Operation() {
		int choice = 0;
		do {
			System.out.println("1.Add_Doctor");
			System.out.println("2.Edit_Doctor");
			System.out.println("3.Delete_Doctor");
			System.out.println("4.Add_Patient");
			System.out.println("5.Edit_Patient");
			System.out.println("6.Delete_Patient");
			System.out.println("7.Save");
			System.out.println("8.AppointMent");
			System.out.println("9.Exit");
			choice = Utility.inputNumber();
			switch (choice) {
			case 1:
				addDoctor();
				break;

			case 2:
				editDoctor();
				break;

			case 3:
				deleteDoctor();
				break;

			case 4:
				addPatient();
				break;

			case 5:
				editPatient();
				break;

			case 6:
				deletePatient();
				break;

			case 7:
				save();
				break;

			case 8:
				appointment();
				break;

			case 9:

				System.out.println("Exiting");

				break;
			default:
				System.out.println("Wrong Choice! please enter correct choice");

			}

		} while (choice != 9);
	}

	public void addDoctor() {
		try {

			System.out.println("Enter Doctor Id");
			String doctId = sc.nextLine();
			doctor.setDoctorId(doctId);

			System.out.println("\nEnter Doctor Name");
			String doctorName1 = sc.nextLine();
			doctor.setDoctorName(doctorName1);

			System.out.println("Enter Time of Doctor Availability");
			String doctorAvailibity1 = sc.nextLine();
			doctor.setDoctorAvailibity(doctorAvailibity1);

			System.out.println("Enter Doctor in Specialization");
			String doctorSpecalization1 = sc.nextLine();
			doctor.setDoctorSpecalization(doctorSpecalization1);

			Doctor temp = new Doctor(doctId, doctorName1, doctorAvailibity1, doctorSpecalization1);
			{
				doctorlist.add(temp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Records Added");

	}

	public void editDoctor() {

		System.out.println("Enter Doctor Id You Want Editied");
		String doctorId = sc.nextLine();

		for (int i = 0; i < doctorlist.size(); i++) {
			Doctor temp = doctorlist.get(i);

			if (temp.getDoctorId().equals(doctorId)) {
				int choice1 = 0;

				do {

					System.out.println("1.DoctorId");
					System.out.println("2.Doctor Name");
					System.out.println("3.Doctor Availibility");
					System.out.println("4.Doctor specialization");
					System.out.println("5.Exit");
					choice1 = Utility.inputNumber();
					switch (choice1) {
					case 1:
						System.out.println("Enter Doctor Id");
						String id = sc.nextLine();
						doctorlist.get(i).setDoctorId(id);
						break;

					case 2:
						System.out.println("Enter Doctor Name");
						String name = sc.nextLine();
						doctorlist.get(i).setDoctorName(name);
						break;

					case 3:
						System.out.println("Enter Doctor Availability");
						String available = sc.nextLine();
						doctorlist.get(i).setDoctorAvailibity(available);
						break;

					case 4:
						System.out.println("Enter Doctor Specilization");
						String special = sc.nextLine();
						doctorlist.get(i).setDoctorSpecalization(special);
						break;

					case 5:
						System.out.println("Exit");
						break;
					default:
						System.out.println("Wrong choice");

					}

				} while (choice1 != 5);

			}

		}

		if (doctorlist.size() > 0) {
			System.out.println("Record Not Exist");
		}

	}

	public void deleteDoctor() {
		try {
			System.out.println("Enter Doctor Id");
			String id = sc.nextLine();
			int i = 0;
			for (i = 0; i < doctorlist.size(); i++) {
				Doctor temp = doctorlist.get(i);
				if (temp.getDoctorId().equals(id)) {
					doctorlist.remove(i);
				}
			}
			System.out.println("Record Deleted");
		} catch (Exception e) {
			System.out.println("User Id Not Match");
		}

	}

	public void addPatient() {
		try {
			System.out.println("Enter Patient Id");
			String patientId = sc.nextLine();
			patient.setPatientId(patientId);

			System.out.println("Enter Patient Name");
			String patientName = sc.nextLine();
			patient.setPatientName(patientName);

			System.out.println("Enter Patient Age");
			String age = sc.nextLine();
			patient.setAge(age);

			System.out.println("Enter Patient Mobile Number");
			String mobno = sc.nextLine();
			patient.setMobileNo(mobno);

			Patient temp = new Patient(patientName, patientId, mobno, age);
			{

				patientlist.add(temp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Records Added");

	}

	public void editPatient() {

		System.out.println("Enter Patient Id You Want Editied");
		String patientId1 = sc.nextLine();

		for (int i = 0; i < patientlist.size(); i++) {
			Patient temp = patientlist.get(i);

			if (temp.getPatientId().equals(patientId1)) {
				int choice1 = 0;

				do {

					System.out.println("1.PatientId");
					System.out.println("2.Patinet Name");
					System.out.println("3.Patient Age");
					System.out.println("4.Patient Mobile Number");
					System.out.println("5.Exit");
					choice1 = sc.nextInt();
					switch (choice1) {
					case 1:
						System.out.println("Enter Patient Id");
						String id = sc.nextLine();
						patientlist.get(i).setPatientId(id);
						break;

					case 2:
						System.out.println("Enter Patient Name");
						String name = sc.nextLine();
						patientlist.get(i).setPatientName(name);
						break;

					case 3:
						System.out.println("Enter Patient Age");
						String age = sc.nextLine();
						patientlist.get(i).setAge(age);

						break;

					case 4:
						System.out.println("Enter Mobile Number");
						String mobno = sc.nextLine();
						patientlist.get(i).setMobileNo(mobno);
						break;

					case 5:
						System.out.println("Exit");
						break;
					default:
						System.out.println("Wrong choice");

					}

				} while (choice1 != 5);

			}

		}

		if (patientlist.size() > 0) {
			System.out.println("Id Not Exist");
		}

	}

	public void deletePatient() {
		try {
			System.out.println("Enter Patient Id");
			String id = sc.nextLine();
			int count = 0;
			for (Patient patient : patientlist) {
				if (patient.getPatientId().equals(id)) {
					patientlist.remove(count);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Record Deleted");
	}

	public void save() {
		try {
			mapper.writeValue(
					new File("/home/admin1/eclipse-workspace/BridgeLabzPrograms/src/com/bridgelabz/files/doctor.json"),
					doctorlist);
			mapper.writeValue(
					new File("/home/admin1/eclipse-workspace/BridgeLabzPrograms/src/com/bridgelabz/files/patient.json"),
					patientlist);
			mapper.writeValue(new File(
					"/home/admin1/eclipse-workspace/BridgeLabzPrograms/src/com/bridgelabz/files/appointment.json"),
					appointmentlist);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Records Saved");
	}

	public void appointment() {
		System.out.println("Enter Doctor Id");
		String id = sc.nextLine();

		System.out.println("Enter Doctor name ");
		String dname = sc.nextLine();

		System.out.println("Enter Doctor Availability ");
		String available = sc.nextLine();

		System.out.println("Enter Patient Id");
		String patientid = sc.nextLine();

		System.out.println("Enter patient name ");
		String pname = sc.nextLine();

		System.out.println("Enter Patient Mobile");
		String mobno = sc.nextLine();

		
//		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		LocalDateTime dateTimeNow = LocalDateTime.now();
//		LocalDateTime tomorrow = dateTimeNow.plusDays(1);
		String time = dateTimeNow.toString();
		
		try {
			Doctor temp = (Doctor) doctorlist.stream().filter(i -> i.getDoctorId().equals(id))
					.collect(Collectors.toList()).get(0);
			if (temp.getDoctorAvailibity().equals(available)) {
				if (temp.getDoctorAvailibity().equals("am")) {
					if (temp.getAmCount() > 4) {
						System.out.println("Appointment full");
						return;
					} else {
						for (int i = 0; i < doctorlist.size(); i++) {
							if (temp.getDoctorId().equals(id)) {
								int temp1 = doctorlist.get(i).getAmCount();
								doctorlist.get(i).setAmCount(temp1 + 1);
							}
						}
					}
				}
			} else if (temp.getDoctorAvailibity().equals("pm")) {
				if (temp.getPmCount() > 4) {
					System.out.println("Appointment full");
					return;
				} else {
					for (int i = 0; i < doctorlist.size(); i++) {
						if (temp.getDoctorId().equals(id)) {
							int temp1 = doctorlist.get(i).getPmCount();
							doctorlist.get(i).setPmCount(temp1 + 1);
						}
					}
				}
			}
			System.out.println("Appointment Fixed");
			appointmentlist.add(new Appointment(id, dname, available, patientid, pname, mobno, time));
		} catch (Exception e) {
			System.out.println("Doctor not found !!");
		}
	}
}
