package travelsDemo;

import java.io.FileInputStream;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TestUSer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
			FileInputStream fs = new FileInputStream("E:\\shivatravels.txt");
			int i = 0;
			while ((i = fs.read()) != -1) {
				System.out.print((char) i);
			}
			fs.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println();
		long refNo = 222333;
		ArrayList<User> list = new ArrayList<>();
		Map<String, String> mp = new HashMap<String, String>();
		ArrayList<Booking> bookinglist = new ArrayList<>();
		while (true) {
			System.out.println("Enter the OPtion from the Below Menu");
			System.out.println("1.User Registration \n2.User Login ");
			int opt = sc.nextInt();

			switch (opt) {
			case 1:
				System.out.println("Enter First Name");
				sc.nextLine();
				String fn = sc.nextLine();
				System.out.println("Enter Last Name");
				String lname = sc.nextLine();
				System.out.println("Enter Mobile Number");
				String mobileNo = sc.nextLine();
				System.out.println("Enter Gender");
				String gender = sc.nextLine();
				System.out.println("Enter Email Id");
				String email_id = sc.nextLine();
				System.out.println("Enter Password");
				String pwd = sc.nextLine();
				list.add(new User(fn, lname, mobileNo, gender, email_id, pwd));
				System.out.println("Successfully Registered");
				mp.put(email_id, pwd);
				break;
			case 2:
				System.out.println("Enter Email Id");
				sc.nextLine();
				email_id = sc.nextLine();
				System.out.println("Enter Password");
				pwd = sc.nextLine();
				boolean login = false;
				for (Map.Entry<String, String> entry : mp.entrySet()) {
					if(entry.getKey().equals(email_id) && entry.getValue().equals(pwd)) {
						System.out.println("Successfully logged in");
						login = true;
						break;
					}
				}
				
				if(login) {
					System.out.println("Enter the OPtion from the Below Menu");
					System.out.println("1.Booking\n2.Reschedule Travel Date\n3.Exit ");
				
					int ch = sc.nextInt();
					switch (ch) {
					case 1:
						System.out.println("Enter Source");
						sc.nextLine();
						String src = sc.nextLine();
						Location source = new Location(src, 10);
						
						System.out.println("Enter Destination");
						String des = sc.nextLine();
				        Location destination = new Location(des, 10);
				        
				        System.out.println("Enter Date format is DD/MM/YYYY");
				        String date = sc.nextLine();
						try {
							DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
							DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E dd MM yyyy ");
							LocalDate localDate = LocalDate.parse(date, dateFormatter);
							String localDate1 = localDate.format(myFormatObj);
							String[] parts = localDate1.split(" ");
							int day = Integer.parseInt(parts[1]);
							int month = Integer.parseInt(parts[2]);
							int yr = Integer.parseInt(parts[3]);
							LocalDateTime myDateObj = LocalDateTime.now();    
							DateTimeFormatter myFormatObj1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
							String formattedDate = myDateObj.format(myFormatObj1); 
							String[] parts2 = formattedDate.split("/");
							int crntday = Integer.parseInt(parts2[0]);
							int crntmonth = Integer.parseInt(parts2[1]);
							int crntyr = Integer.parseInt(parts2[2]);
							if(day>=crntday && month>=crntmonth && yr == crntyr) {
								Journey journey = new Journey(source, destination, localDate1, 900.0);
								System.out.println("Enter Number of passengers");
								int num = sc.nextInt();
								refNo=++refNo;
								Booking booking = new Booking(journey, num,refNo);
								bookinglist.add(booking);
								Booking.displayBookingDetails(booking);
								System.out.println(bookinglist);
							}else {
								System.out.println("Enter Valid Date");
							}
						}
						catch(Exception e) {
							System.out.println("Enter valid Date"+e.getMessage());
						}
						break;
					case 2:
						System.out.println("Resedhule Travel Date");
						System.out.println("Enter Reference number of your Ticket");
						long ref = sc.nextLong();
						System.out.println("Enter date format is DD/MM/YYYY");
						String date1 = sc.nextLine();
						Booking tempref;						    
						break;
					case 3:
						System.exit(0);
		                break; 
					default:
						System.out.println("Invalid choice. Please try again.");
						break;
					}
				}
				else {
					System.out.println("Invalid Email or Password");
				}
				break;
			default:
                System.out.println("Invalid choice. Please try again.");
        }
				
					
				
			
		}

	}

}
