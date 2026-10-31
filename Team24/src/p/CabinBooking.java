package p;


public class CabinBooking extends SeatBooking {
    
	private int days;
	private double deposit;
	public CabinBooking(int bookingID, String bookingName, int startHour, int hours, double hourlyRate,
			String bookingDate, String contactNumber, String status, int days, double deposit) {
		super(bookingID, bookingName, startHour, hours, hourlyRate, bookingDate, contactNumber, status);
		this.days = days;
		this.deposit = deposit;
	}
	
	static double cabinDailyRate = 2500;
	
	public double calculateRent() {
		return (days*cabinDailyRate) +(days*cabinDailyRate*0.18);
	}
	
	public double calculateRefund(boolean cancelledEarly) {
		double refund = 0;
          if(cancelledEarly == true) 
        	  refund = deposit;
          else         
        	  refund = deposit/2;
        	         
		return refund;
	}
	
	public void display() {
		super.display();
		double refund=calculateRefund(true);
		System.out.println("Refund amount: " + refund ); 
		
	}
	
}
