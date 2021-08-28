package javasessions;

public class CarBooking {
	
	String carType;
	String from;
	String to;
	int code;
	
	public void booking()
	{
		System.out.println("Car is booked with :"+ carType+" " +from+" "+ to);
	}
	
	public CarBooking()
	{
		System.out.println("Car Booking is called");
	}
	
	public CarBooking(String carType, String from, String to) {
		this.carType = carType;
		this.from = from;
		this.to = to;
	}
	
	public CarBooking(String from, String to) {
		this.from = from;
		this.to = to;
	}
	
	public CarBooking(String carType, String from, String to, int code) {
		this.carType = carType;
		this.from = from;
		this.to = to;
		this.code = code;
	}
	
	
	
	
	
	

}
