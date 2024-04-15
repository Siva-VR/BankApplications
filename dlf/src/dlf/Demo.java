package dlf;

class Location {
    String name;
    int vacancies;

    Location(String name, int vacancies) {
        this.name = name;
        this.vacancies = vacancies;
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
}

class Booking {
    Journey journey;
    int numberOfPassengers;

    Booking(Journey journey, int numberOfPassengers) {
        this.journey = journey;
        this.numberOfPassengers = numberOfPassengers;
    }

    double calculateTotalFare() {
        double totalFare = journey.fare * numberOfPassengers;
        if (isWeekend(journey.travelDate)) {
            totalFare += 200;  // Weekend surcharge
        }
        totalFare += calculateGST(totalFare);
        return totalFare;
    }

    boolean isWeekend(String date) {
        // Assume date format validation is already done
        // You may implement a more robust date parsing and checking logic
        // For simplicity, assuming weekends are Saturday and Sunday
        // You might need to adjust this logic based on your needs
        // This is just a basic example
        // Assume date format is MM/DD/YYYY
        String[] parts = date.split("/");
        int day = Integer.parseInt(parts[1]);
        return day == 6 || day == 7;  // Saturday or Sunday
    }

    double calculateGST(double amount) {
        // GST calculation logic (you may adjust based on your country's tax rules)
        return amount * 0.18;  // Assuming 18% GST
    }
}

public class Demo {
    public static void main(String[] args) {
        // Initialize locations
        Location source = new Location("City A", 50);
        Location destination = new Location("City B", 50);

        // Sample journey with initial fare
        Journey journey = new Journey(source, destination, "01/15/2024", 100.0);

        // Sample booking
        Booking booking = new Booking(journey, 2);

        // Display booking details
        System.out.println("Journey Details:");
        System.out.println("Source: " + journey.source.name);
        System.out.println("Destination: " + journey.destination.name);
        System.out.println("Travel Date: " + journey.travelDate);
        System.out.println("Number of Passengers: " + booking.numberOfPassengers);
        System.out.println("Total Fare: " + booking.calculateTotalFare());

        // Redirect to home screen (you might have a loop to continue the program)
        System.out.println("Booking confirmed. Redirecting to home screen...");
    }
}
