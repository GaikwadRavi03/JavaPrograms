/*
* Created by:Ravi Gaikwad.
* Date 8/10/2019.
* Purpose: 12. Clinique Management Programme.
**/

package com.bridgelabz.oops.clinique;

import com.bridgelabz.utility.Utility;

public class ClinicalManagement {

	public static void main(String[] args) {
		DoctorPatientOperations doctorpatient = new DoctorPatientOperations();
		DoctorPatientData data = new DoctorPatientData();
		DoctorPatientSearch search = new DoctorPatientSearch();

		int choice = 0;
		System.out.println("----------Welcome To Clinical Managament System----------\n");

		do {
			System.out.println("1.Operation for Doctor Patient Appointment");
			System.out.println("2.Searching");
			System.out.println("3.Show Data");
			System.out.println("4.Exit");
			choice = Utility.inputNumber();
			switch (choice) {
			case 1:
				doctorpatient.Operation();
				break;

			case 2:
				search.Opeartion();
				break;

			case 3:
				data.opeartion();
				break;

			case 4:
				System.out.println("Thank You");

				break;
			default:
				System.out.println("Please Enter Correct Choice");
			}
		} while (choice != 4);
	}
}
