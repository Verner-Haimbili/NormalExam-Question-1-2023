
public class PropertyApp {

	public static void main(String[] args) {

		RentalCompany rental = new RentalCompany();

		LuxuryProperty luxuryProperty = new LuxuryProperty("Ocean Villa", 3, 6, true);
		AverageProperty averageProperty = new AverageProperty("City Apartment", 2, 4);

		LuxuryProperty luxuryProperty1 = new LuxuryProperty("Ocean Villa", 7, 14, true);
		AverageProperty averageProperty1 = new AverageProperty("City Apartment", 5, 10);

		LuxuryProperty luxuryProperty2 = new LuxuryProperty("Ocean Villa", 4, 8, true);
		AverageProperty averageProperty2 = new AverageProperty("City Apartment", 3, 5);

		rental.addProperty(averageProperty);
		rental.addProperty(luxuryProperty);
		rental.addProperty(averageProperty2);
		rental.addProperty(luxuryProperty2);
		rental.addProperty(averageProperty1);
		rental.addProperty(luxuryProperty1);

		Customer customer = new Customer();

		// Calculate rent for luxury property for 3 nights

		System.out.println("Luxury Property Rent: " + rental.howMuchMoneyForLuxury(3) + " NAD");

		System.out.println("How many Average Property available for rent: " + rental.howManyAveragePropertyAvailable());

		// Get total payment made by the customer
		System.out.println("Total Payment by Customer: " + customer.getTotalPayment() + " NAD");
	}

}
