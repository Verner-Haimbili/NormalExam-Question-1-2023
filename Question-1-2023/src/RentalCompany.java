import java.util.ArrayList;
import java.util.List;

public class RentalCompany {

	private List<Property> properties;

	public RentalCompany() {
		properties = new ArrayList<>();
	}

	public void addProperty(Property prop) {
		this.properties.add(prop);
	}

	public double howMuchMoneyForLuxury(int nights) {
		double total = 0;

		for (Property prop : this.properties) {
			if (prop instanceof LuxuryProperty) {
				total += prop.rentPrice(nights);
			}
		}
		return total;
	}

	public int howManyAveragePropertyAvailable() {
		int total = 0;

		for (Property average : this.properties) {
			if (average instanceof AverageProperty) {
				total++;
			}
		}
		return total;
	}
}
