package p;
import java.util.Scanner;
public class MainApplication  {
	

	public static void main(String[] args) {
  		Scanner s = new Scanner(System.in);
  		
  		SeatBooking d1 = new SeatBooking(101,"p1",9,6,750,"12/09/2026","3902331931","unoccupied");
  		SeatBooking d2= new SeatBooking(102,"p2",4,2,250,"14/09/2026","3902331931","occupied");
  		SeatBooking d3 = new SeatBooking(103,"p3",5,7,300,"18/09/2026","3902331931","unoccupied");
  		
  		CabinBooking c1= new CabinBooking(101,"p4",5,9,600,"12/09/2026","3902331931","unoccupied",4,400);
  		CabinBooking c2= new CabinBooking(102,"p5",3,6,400,"14/09/2026","3902331931","occupied",4,400);
  		CabinBooking c3= new CabinBooking(103,"p6",8,2,200,"16/09/2026","3902331931","unoccupied",4,400);
  		
  		SeatBooking[] seats = {d1,d2,d3};
  		CabinBooking[] cabins = {c1,c2,c3};
  		System.out.println("Booking options : ");
  		System.out.print("1.hot desks \n2.private cabins \n3.exit \nEnter option : ");
  		int op = s.nextInt();
        if(op==1) {
         System.out.println("Available hot desks are : ");
  		 for(int i = 0;i<3;i++) {
  			seats[i].display();
  			System.out.println("------------------");
  		}
  		}
  		else if(op==2) {
  		  System.out.println("Available cabins are : ");
  		  for(int i = 0;i<3;i++) {
  			cabins[i].display();
  			System.out.println("------------------");
  		}
  		}
  		else if (op ==3) {
  		 System.out.println("you have exited.");
  		 s.close();
  		}
  		else 
  		 System.out.println("wrong input.");
  		
  		
  	}
	}

