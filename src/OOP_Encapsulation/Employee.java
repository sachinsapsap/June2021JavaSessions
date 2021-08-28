package OOP_Encapsulation;

public class Employee {
	
	public String name;
	private double salary;
	private double shares;
	
	
	
	public Employee(String name, double salary, double shares) {
		this.name = name;
		this.salary = salary;
		this.shares = shares;
	}

	public void setSalary(double salary) {
		this.salary=salary;
	}

	public double getSalary() {
		return salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getShares() {
		return shares;
	}

	public void setShares(double shares) {
		this.shares = shares;
	}
	
	}
	
