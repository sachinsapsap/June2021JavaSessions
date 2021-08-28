package OOP_Interface;

public class TestHospital {

	public static void main(String[] args) {
		
		FortisHospital fh=new FortisHospital("Fortis","NY");
		System.out.println(fh.getName());
		System.out.println(fh.getCity());
		fh.setCity("LA");
		System.out.println(fh.getName());
		System.out.println(fh.getCity());
		fh.cardioServices();
		fh.physioServices();
		fh.oncologyServices();
		fh.emergencyServices();
		fh.medicalInsurance();
		fh.medicalTraining();
		USMedical.billing();
		FortisHospital.billing();
		fh.getVaccine();
		System.out.println(USMedical.min_fee);
		fh.covidTest();
		fh.medicalRD();
		fh.medicalPatientData();
		
//		top casting:Child class object can be referred by parent class reference variable
		USMedical us= new FortisHospital();
		us.physioServices();
		us.cardioServices();
		us.emergencyServices();
		us.gynecServices();
//		only USMedical interface methods can be accessed.
		
//		Down casting is not allowed at compile time because we cannot create object of interfaces
		UKMedical uk= new FortisHospital();
		uk.emergencyServices();
		uk.entServices();
		uk.oncologyServices();
		
		
		

	}

}
