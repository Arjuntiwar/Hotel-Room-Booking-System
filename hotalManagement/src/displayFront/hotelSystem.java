package displayFront; 

 

import java.util.ArrayList; 

import java.util.Scanner; 

 

 

class hotelBookigSystem extends UserDetail { 
	
	 
	
	private String[] hotelName = {"Arjun Hotel", "Ajay Hotel", "Jasmin Hotel", "Aakriti Hotel", "Soltee Hotel"}; 
	
	private int [][] arjunHotel = {{1,2,3,4,5,6,7,8},{1,3,4}}; 
	
	private int [][] ajayHotel = {{1,2,3,4,5,6,7,8},{2,4,6,8}}; 
	
	private int [][] jasminHotel = {{1,2,3,4,5,6,7,8},{2,6,7,8}}; 
	
	private int [][] aakritiHotel = {{1,2,3,4,5,6,7,8},{1,2,6,8}}; 
	
	private int [][] solteeHotel = {{1,2,3,4,5,6,7,8},{2,4,5,7}}; 
	
	private String [][] roomDetail = {{"This is standard class room","This is the business class room"},{"Rate is 40 pound per night", "Rate is 60 pound per night"}}; 
	
	 
	
	 
	
	ArrayList<Integer> arjunHotelBooked = new ArrayList<>(); 
	
	ArrayList<Integer> ajayHotelBooked = new ArrayList<>(); 
	
	ArrayList<Integer> jasminHotelBooked = new ArrayList<>(); 
	
	ArrayList<Integer> aakritiHotelBooked = new ArrayList<>(); 
	
	ArrayList<Integer> solteeHotelBooked = new ArrayList<>(); 
	
	 
	
	 
	
	hotelBookigSystem () { 
		
		 
		
		System.out.println("Menu"); 
		
		System.out.println("Enter 1 for List of hotel"); 
		
		System.out.println("Enter 2 for your booking history details"); 
		
		System.out.println("Enter 3 for booking cancel"); 
		
		System.out.println("Enter 4 for exit"); 
		
		 
		
	} 
	
	 
	
	 
	
	 
	
	void listOfHotel(Scanner input) { 
	
		
		System.out.println("Name list of hotel"); 
		
		 
		
		for(int index = 0;index<hotelName.length;index++) { 
		
		System.out.println("Enter "+ (index+1) +" for choose hotel:: " + hotelName[index]); 
		
		} 
		
		displayBookingRoom (input); 
		
		paymentProceed (input); 
		
		System.out.println("Your room is booked"); 
		
		return; 
		
	}
	
	 
	
	 
	
	 
	
	void viewBookingHistory (hotelBookigSystem hotelName, Scanner input) { 
	
	 
	
	 
	
	 
	
	System.out.println("Enter your name"); 
	
	String yourName = input.next(); 
	
	System.out.println("Enter your phone number"); 
	
	String userPhoneNumber = input.next(); 
	
	 
	
	int nameFlag = userName.indexOf(userPhoneNumber); 
	
	int numFlag = userPhone.indexOf(yourName); 
	
	 
	
	if (nameFlag >= 0 && numFlag >= 0) { 
	
		System.out.println(userName.get(nameFlag) + ", you booked"+bookedTime+" times"+". Your number "+userPhone.get(numFlag)); 
	
	} else { 
	
	System.out.println("Sorry, "+yourName+" you didn't booked any pervious room"); 
	
	} 
	
	 
	
	} 
	
	 
	
	 
	
	void displayBookingRoom (Scanner input) { 
		
		//		Scanner input = new Scanner(System.in); 
		
		System.out.println("Enter the hotel number"); 
		
		int userInput = input.nextInt(); 
		
		if (userInput == 1) { 
		
		 
		
		 
		
		roomBooking (input, arjunHotel, arjunHotelBooked,roomDetail); 
		
		 
		
		 
		
		 
		
		}else if (userInput == 2) { 
		
		 
		
			roomBooking (input, ajayHotel, ajayHotelBooked,roomDetail); 
		
		 
		
		}else if (userInput == 3) { 
		
		 
		
			roomBooking (input, jasminHotel, jasminHotelBooked,roomDetail); 
		
		 
		
		}else if (userInput == 4) { 
		
		 
		
				roomBooking (input, aakritiHotel, aakritiHotelBooked,roomDetail); 
		
		 
		
		}else if (userInput == 5) { 
		
		 
		
		roomBooking (input, solteeHotel, solteeHotelBooked,roomDetail); 
		
		 
		
		} 
		
	}
	
	 
	
	void paymentProceed (Scanner input) { 
	
	 
	
	//		Scanner input = new Scanner(System.in); 
	
	 
	
	System.out.println("Enter your card name"); 
	
	accountName = input.next(); 
	
	//		if (accountName.equals()); 
	
	System.out.println("Enter your phone number"); 
	
	userPhoneNumber = input.next(); 
	
	System.out.println("Enter your card number"); 
	
	accountNumber = input.next(); 
	
	System.out.println("Enter your card expiry date mm/yy"); 
	
	expiryDate = input.next(); 
	
	System.out.println("Enter your cvc number"); 
	
	cvcNum = input.nextInt(); 
	
	System.out.println("Enter your today booking date YYYY/MM/DD "); 
	
	bookedTime = input.next(); 
	
	 
	
	System.out.println(accountName +", amount is deducted from your account."); 
	
	roomBookingDate.add(bookedTime);
	
	userName.add(accountName);
	
	userAccount.add(accountNumber);
	
	userPhone.add(userPhoneNumber);
	
	} 
	
	 
	
	void showingRoomForCancel () { // This method show the list of the hotel when user want to cancel their booked room 
	
	System.out.println("Name list of hotel"); 
	
	 
	
	for(int index = 0;index<hotelName.length;index++) { 
	
	System.out.println("Enter "+ (index+1) +" for choose hotel:: " + hotelName[index]); 
	
	} 
	
	 
	
	} 
	
	 
	
	void bookingCancel () { // This method helps to cancel if any room is booked 
	
	Scanner input = new Scanner(System.in); 
	
	System.out.println("Do you really want cancel your booking? Enter y for yes, n for no"); 
	
	String userAnswer = input.next(); 
	
	if (userAnswer.charAt(0) == 'y'|| userAnswer.charAt(0)=='Y') { 
	
	showingRoomForCancel(); 
	
	System.out.println("Enter the hotel number"); 
	
	 
	
	int userInput = input.nextInt(); 
	
	 
	
	 
	
	if (userInput == 1) { 
	
	 
	
	bookingRoomCancel(input, arjunHotelBooked, userName); 
	
	 
	
	}else if (userInput == 2) { 
	
	 
	
	bookingRoomCancel(input, ajayHotelBooked, userName); 
	
	 
	
	}else if (userInput == 3) { 
	
	 
	
	bookingRoomCancel(input, aakritiHotelBooked, userName); 
	
	 
	
	}else if (userInput == 4) { 
	
	 
	
	bookingRoomCancel(input, aakritiHotelBooked, userName); 
	
	 
	
	}else if (userInput == 5) { 
	
	 
	
	bookingRoomCancel(input, solteeHotelBooked, userName);	 
	
	 
	
	} else { 
	
	 
	
	System.out.println("You enter wrong number"); 
	
	} 
	
	 
	
	} 
	
	 
	
	} 

} 

 

 

public class hotelSystem { 

 

 
	
	public static void main(String[] args) { 
	
	 
		
		char choice = 'y'; 
		
		do { 
		
			 
			
			Scanner input = new Scanner(System.in); 
			
			hotelBookigSystem hotelName = new hotelBookigSystem(); 
			
			 
			
			 
			
			 
			
			int userInput = input.nextInt(); 
			
			 
			
			switch (userInput) { 
			
				case 1: { 
				
					hotelName.listOfHotel(input); 
					
					break; 
				
				} 
				
				case 2: { 
				
					hotelName.viewBookingHistory (hotelName, input); 
					break; 
				
				} 
				
				case 3:{ 
				
					hotelName.bookingCancel (); 
				
					break; 
				
				} 
				
				case 4: { 
				
					System.out.println("Exit"); 
				
					input.close(); 
				
					return; 
				
				} 
				
				default : { 
				
					System.out.println("You enter wrong number"); 
				
				} 
			
			} 
			
			System.out.println("Do you want repeat again? If yes enter 'y' no enter 'n' " ); 
			
			 
			
			choice = input.next().charAt(0); 
			
			 
		
		} while (choice == 'y'||choice == 'Y'); 
	
	 
	
	 
	
	} 
	 
} 