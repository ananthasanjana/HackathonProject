package p;


public class SeatBooking
{
  	private int bookingID;
  	private String bookingName;
  	private int startHour;
  	private int hours;
  	private double hourlyRate;
  	private String bookingDate;
  	private String contactNumber;
  	private String status;
  	
  	private double gstPercent = 18;
  	private double peakSurchargePercent = 20;
  	private int totalSeats = 30;
  	private int bookingCount;
  	
  	public SeatBooking(int bookingID, String bookingName, int startHour, int hours, double hourlyRate, String bookingDate, String contactNumber, String status) {
  		this.bookingID = bookingID;
  		this.bookingName = bookingName;
  		this.startHour = startHour;
  		this.hours = hours;
  		this.hourlyRate = hourlyRate;
  		this.bookingDate = bookingDate;
  		this.contactNumber = contactNumber;
  		this.status = status;
  	}
  	public double calculateRent() {
  		return (hours*hourlyRate) + (hours*hourlyRate*gstPercent);
  	}
  	
  	public double calculateRent(double memberDiscountPercent) {
  		return (hours*hourlyRate)-(hours*hourlyRate*memberDiscountPercent)+ (hours*hourlyRate*gstPercent);
  	}
  	
  	public boolean isPeak() {
  		return true;
  	}
  	public double calculateRentPeak() {
  		isPeak();
  		return (hours*hourlyRate)+(hours*hourlyRate*peakSurchargePercent)+ (hours*hourlyRate*gstPercent);
  	 }
  	
  	public void display() {
  		System.out.println("Booking ID : " + bookingID);
  		System.out.println("Booking Name : " + bookingName);
  		System.out.println("Start hour : " + startHour);
  		System.out.println("Number of hours : " + hours);
  		System.out.println("Hourly rate : " + hourlyRate);
  		System.out.println("Booking date : " + bookingDate);
  		System.out.println("Contact number : " + contactNumber);
  		System.out.println("Status  : " + status);
  		System.out.println("Rent : " + calculateRent());
  	}
  	
