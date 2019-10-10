package com.bridgelabz.oops.Clinique;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelabz.utility.Utility;

public class DoctorPatientSearch implements Searching {

	ObjectMapper mapper = new ObjectMapper();
	Scanner scanner = new Scanner(System.in);

	static List<Doctor> doctorlist = new ArrayList<>();
	static List<Patient> patientlist = new ArrayList<>();

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
		} catch (Exception e) {
		}
	}

	public void Opeartion() {
		int choice = 0;
		do {
			System.out.println("********Search Doctor********");
			System.out.println();
			System.out.println("1.Search Doctor By ID");
			System.out.println("2.Search Doctor By Name");
			System.out.println("3.Search Doctor By Availability");
			System.out.println("4.Search Doctor By Specialization");
			System.out.println();
			System.out.println("********Search Patient********");
			System.out.println();
			System.out.println("5.Search Patient By ID");
			System.out.println("6.Search Patient By Name");
			System.out.println("7.Search Patient By Age");
			System.out.println("8.Search Patient By Mobile Number");
			System.out.println("9.Exit");
			choice = Utility.inputNumber();
			switch (choice) {
			case 1:
				searchDoctorById();
				break;
			case 2:
				searchDoctorByName();
				break;
			case 3:
				searchDoctorByAvaliability();
				break;
			case 4:
				searchDoctorBySpecilization();
				break;

			case 5:
				searchpatientByID();
				break;

			case 6:
				searchpatientByName();
				break;

			case 7:
				searchpatientByAge();
				break;

			case 8:
				searchpatientByMobileNo();
				break;

			case 9:
				System.out.println("Exit");
				break;
			default:
				System.out.println("Wrong Choice");

			}

		} while (choice != 9);
	}

	@Override
	public void searchDoctorById() {
		// TODO Auto-generated method stub

		System.out.println("Enter Doctor id");
		String id = scanner.nextLine();
		try {

			List<Doctor> listsearch = (List<Doctor>) doctorlist.stream().filter(i -> i.getDoctorId().equals(id))
					.collect(Collectors.toList());
			System.out.println("ID       Name            Availability            Specialization");
			for (int i = 0; i < listsearch.size(); i++) {
				System.out.println(listsearch.get(i).getDoctorId() + "  " + listsearch.get(i).getDoctorName()
						+ "       " + listsearch.get(i).getDoctorAvailibity() + "       "
						+ listsearch.get(i).getDoctorSpecalization());
			}
		} catch (Exception e) {
			System.out.println("Wrong Id");
		}
	}

	@Override
	public void searchDoctorByName() {
		// TODO Auto-generated method stub

		System.out.println("Enter Doctor Name");
		String name = scanner.nextLine();
		try {

			List<Doctor> listsearch = (List<Doctor>) doctorlist.stream().filter(i -> i.getDoctorName().equals(name))
					.collect(Collectors.toList());
			System.out.println("ID       Name            Availability            Specialization");
			for (int i = 0; i < listsearch.size(); i++) {
				System.out.println(listsearch.get(i).getDoctorId() + "  " + listsearch.get(i).getDoctorName()
						+ "       " + listsearch.get(i).getDoctorAvailibity() + "       "
						+ listsearch.get(i).getDoctorSpecalization());
			}

		} catch (Exception e) {
			System.out.println("Wrong Name");
		}

	}

	@Override
	public void searchDoctorBySpecilization() {
		// TODO Auto-generated method stub

		System.out.println("Enter Doctor Specialization");
		String specialization = scanner.nextLine();
		try {

			List<Doctor> listsearch = (List<Doctor>) doctorlist.stream()
					.filter(i -> i.getDoctorSpecalization().equals(specialization)).collect(Collectors.toList());
			System.out.println("ID       Name            Availability            Specialization");
			for (int i = 0; i < listsearch.size(); i++) {
				System.out.println(listsearch.get(i).getDoctorId() + "  " + listsearch.get(i).getDoctorName()
						+ "       " + listsearch.get(i).getDoctorAvailibity() + "       "
						+ listsearch.get(i).getDoctorSpecalization());
			}

		} catch (Exception e) {
			System.out.println("Wrong specialization");
		}

	}

	@Override
	public void searchDoctorByAvaliability() {
		// TODO Auto-generated method stub
		System.out.println("Enter Doctor  Availability  ");
		String availability = scanner.nextLine();
		try {

			List<Doctor> listsearch = (List<Doctor>) doctorlist.stream()
					.filter(i -> i.getDoctorAvailibity().equals(availability)).collect(Collectors.toList());
			System.out.println("ID       Name            Availability            Specialization");
			for (int i = 0; i < listsearch.size(); i++) {
				System.out.println(listsearch.get(i).getDoctorId() + "  " + listsearch.get(i).getDoctorName()
						+ "       " + listsearch.get(i).getDoctorAvailibity() + "       "
						+ listsearch.get(i).getDoctorSpecalization());
			}

		} catch (Exception e) {
			System.out.println("Wrong availability");
		}
	}

	@Override
	public void searchpatientByID() {
		// TODO Auto-generated method stub

		System.out.println("Enter Patient Id  ");
		String id = scanner.nextLine();
		try {

			List<Patient> listsearch = (List<Patient>) patientlist.stream().filter(i -> i.getPatientId().equals(id))
					.collect(Collectors.toList());
			System.out.println("ID    Name     Age    Mobile Number");
			for (int i = 0; i < listsearch.size(); i++) {
				System.out.println(listsearch.get(i).getPatientId() + "  " + listsearch.get(i).getPatientName()
						+ "       " + listsearch.get(i).getAge() + "       " + listsearch.get(i).getMobileNo());
			}
		} catch (Exception e) {
			System.out.println("Wrong ID");
		}
	}

	@Override
	public void searchpatientByName() {
		// TODO Auto-generated method stub

		System.out.println("Enter Patient Name ");
		String name = scanner.nextLine();
		try {

			List<Patient> listsearch = (List<Patient>) patientlist.stream().filter(i -> i.getPatientName().equals(name))
					.collect(Collectors.toList());
			System.out.println("ID    Name     Age    Mobile Number");
			for (int i = 0; i < listsearch.size(); i++) {
				System.out.println(listsearch.get(i).getPatientId() + "  " + listsearch.get(i).getPatientName()
						+ "       " + listsearch.get(i).getAge() + "       " + listsearch.get(i).getMobileNo());
			}

		} catch (Exception e) {
			System.out.println("Wrong Name");
		}

	}

	@Override
	public void searchpatientByAge() {
		// TODO Auto-generated method stub

		System.out.println("Enter Patient Age  ");
		String age = scanner.nextLine();
		try {

			List<Patient> listsearch = (List<Patient>) patientlist.stream().filter(i -> i.getAge().equals(age))
					.collect(Collectors.toList());
			System.out.println("ID    Name     Age    Mobile Number");
			for (int i = 0; i < listsearch.size(); i++) {
				System.out.println(listsearch.get(i).getPatientId() + "  " + listsearch.get(i).getPatientName()
						+ "       " + listsearch.get(i).getAge() + "       " + listsearch.get(i).getMobileNo());
			}

		} catch (Exception e) {
			System.out.println("Wrong age");
		}

	}

	@Override
	public void searchpatientByMobileNo() {
		// TODO Auto-generated method stub

		System.out.println("Enter Patient Mobile No  ");
		String mobno = scanner.nextLine();
		try {

			List<Patient> listsearch = (List<Patient>) patientlist.stream().filter(i -> i.getMobileNo().equals(mobno))
					.collect(Collectors.toList());
			System.out.println("ID    Name     Age    Mobile Number");
			for (int i = 0; i < listsearch.size(); i++) {
				System.out.println(listsearch.get(i).getPatientId() + "  " + listsearch.get(i).getPatientName()
						+ "       " + listsearch.get(i).getAge() + "       " + listsearch.get(i).getMobileNo());
			}

		} catch (Exception e) {
			System.out.println("Wrong Mobile Number");
		}
	}
}
