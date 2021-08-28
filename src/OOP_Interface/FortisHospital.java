package OOP_Interface;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FortisHospital extends HospitalMgmt  implements USMedical, UKMedical, IndianMedical  {

	private String name;
	private String city;
	
	
	@Override
	public void physioServices() {
	System.out.println("FH-----physioServices");
		
	}

	@Override
	public void cardioServices() {
		System.out.println("FH---------cardioServices");
	
		
	}

	@Override
	public void emergencyServices() {
		System.out.println("FH---------emergencyServices");
		
		
	}

	@Override
	public void entServices() {
		System.out.println("FH---------entServices");

	}

	@Override
	public void oncologyServices() {
		System.out.println("FH---------oncologyServices");

	}

	@Override
	public void radiologyServices() {
		System.out.println("FH---------radiologyServices");
		
	}

	@Override
	public void neuroServices() {
		System.out.println("FH---------neuroServices");
		
	}

	
	public void medicalInsurance() {
		System.out.println("FH----------medicalInsurance");
	}
	
	public void medicalTraining() {
		System.out.println("FH----------medicalTraining");
	}

	@Override
	public void gynecServices() {
		
		System.out.println("FH----------gynecServices");
	}
	
//	Method Hiding
	public static void billing() {
		System.out.println("FH Billing");
	}
	
	@Override
	 public void getVaccine() {
		System.out.println("FH Vaccination");
	}

	@Override
	public void covidTest() {
		System.out.println("FH--CovidTest");
		
	}
	
	}
	
	
	
	

