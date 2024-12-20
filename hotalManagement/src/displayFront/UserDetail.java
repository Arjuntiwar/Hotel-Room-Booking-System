package displayFront;

import java.util.ArrayList;
import java.util.Scanner;


public class UserDetail { 

public String accountName; 

public int bookedRoomNumber; 

public String accountNumber; 

public String userPhoneNumber; 

public String expiryDate; 

public int cvcNum; 

public String userBookingName; 

public String userRoomBookingDate; 

public String bookedTime; 

 

 

public ArrayList<String> userName = new ArrayList<String>(); 

public ArrayList<String> userPhone = new ArrayList<>(); 

public ArrayList<String> userAccount = new ArrayList<>(); 

public ArrayList<String> roomBookingDate = new ArrayList<>(); 

public ArrayList<String> bookingDate = new ArrayList<>(); 

 

 

//	This is the booked room cancel method  

 

void bookingRoomCancel (Scanner input, ArrayList<Integer> nameOfHotel, ArrayList<String> userRealName) { 

 

System.out.println("Enter your name"); 

String userBookingName = input.next(); 

  

System.out.println("Enter your booked room number"); 

int bookedRoomNumber = input.nextInt(); 

 

 

 

int userFlag = userRealName.indexOf(userBookingName); 

int userBookedFlag = nameOfHotel.indexOf(bookedRoomNumber); 

 

 

 

 

if (userFlag == 0|| userBookedFlag == 0) { 

System.out.println(userRealName.get(userFlag)); 

  

System.out.println(nameOfHotel.get(userBookedFlag)); 

}else { 

System.out.println("You was not booked any room"); 

return; 

} 

} 

// This method  

void roomBooking (Scanner input, int [][] hotelRoom, ArrayList<Integer>hotelName, String [][] roomDetail) { 

 

	for(int index = 0;index<hotelRoom[0].length;index++) { 
	
		if (hotelName.contains(Integer.valueOf(hotelRoom[0][index]))) { 
		
			continue; 
		
		} else { 
		
			System.out.print(hotelRoom[0][index]+" "); 
		
		}
	
	 
	
	}
 

 

System.out.println("\nPlease enter room number"); 

int userInputAgain = input.nextInt(); 

if (hotelName.indexOf(userInputAgain) >= 0) { 

System.out.println("Sorry, this room is already booked"); 

return; 

} else { 

  

for(int roomDetails: hotelRoom[0]) { 

if (userInputAgain == roomDetails) { 

System.out.println(roomDetail[0][0]); 

System.out.println(roomDetail[1][0]); 

hotelName.add(userInputAgain); 

break; 

 

} else { 

System.out.println(roomDetail[0][1]); 

System.out.println(roomDetail[1][1]); 

hotelName.add(userInputAgain); 

break; 

 

} 

} 

 

} 

} 

 

 

 

 

} 

 