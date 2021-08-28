package javasessions;

import java.util.ArrayList;

public class EmployeeInfo {
	
	String name;
	int age;
	ArrayList<String> deviceslist;
	
	public EmployeeInfo(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public EmployeeInfo(String name, int age, ArrayList<String> deviceslist) {
		this.name = name;
		this.age = age;
		this.deviceslist = deviceslist;
	}

	public EmployeeInfo(String name, ArrayList<String> deviceslist) {
		this.name = name;
		this.deviceslist = deviceslist;
	}
	
	
	
	
	
	

}
