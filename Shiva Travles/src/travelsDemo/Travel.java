package travelsDemo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Travel {

	public static ArrayList<User> addNewUser(User ur) {
		ArrayList<User> al = new ArrayList<>();
		al.add(ur);
		return al;
	}

}

class Location {
	String name;
	int vacancies;

	Location(String name, int vacancies) {
		this.name = name;
		this.vacancies = vacancies;
	}

	@Override
	public String toString() {
		return "Location [name=" + name + ", vacancies=" + vacancies + "]";
	}

}

class Journey {
	Location source;
	Location destination;
	String travelDate;
	double fare;

	Journey(Location source, Location destination, String travelDate, double fare) {
		this.source = source;
		this.destination = destination;
		this.travelDate = travelDate;
		this.fare = fare;
	}

	@Override
	public String toString() {
		return "Journey [source=" + source + ", destination=" + destination + ", travelDate=" + travelDate + ", fare="
				+ fare + "]";
	}


}

class Booking {
	Journey journey;
	int numberOfPassengers;
	long refNo;

	Booking(Journey journey, int numberOfPassengers, long refNo) {
		this.journey = journey;
		this.numberOfPassengers = numberOfPassengers;
		this.refNo = refNo;
	}

	@Override
	public String toString() {
		return "Booking [journey=" + journey + ", numberOfPassengers=" + numberOfPassengers + ", refNo=" + refNo + "]";
	}

	double calculateTotalFare() {
		double totalFare = journey.fare * numberOfPassengers;
		if (isWeekend(journey.travelDate)) {
			totalFare += 200;
		}
		totalFare += calculateGST(totalFare);
		return totalFare;
	}

	boolean isWeekend(String date) {
		String[] parts = date.split(" ");
		String day = parts[0];
		return day.equals("Sat") || day.equals("Sun");
	}

	double calculateGST(double amount) {
		return amount * 0.18; // Assuming 18% GST
	}

	static String ValidateDate(String date) {
		String[] parts = date.split(" ");
		int day = Integer.parseInt(parts[1]);

		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E dd MM yyyy ");
		LocalDate localDate = LocalDate.parse(date, dateFormatter);
		String LocalDate = localDate.format(myFormatObj);
		return LocalDate;

	}
	public static void displayBookingDetails(Booking booking) {
		System.out.println("Source: " + booking.journey.source.name);
		System.out.println("Destination: " + booking.journey.destination.name);
		System.out.println("Travel Date: " + booking.journey.travelDate);
		System.out.println("Number of Passengers: " + booking.numberOfPassengers);
		System.out.println("Total Fare: " + booking.calculateTotalFare());
	}

	// Helper method to validate date format (you might need to enhance this)
	private static boolean isValidDate(String date) {
		// Assuming a simple format validation for demonstration purposes
		return date.matches("\\d{2}/\\d{2}/\\d{4}");
	}
}
