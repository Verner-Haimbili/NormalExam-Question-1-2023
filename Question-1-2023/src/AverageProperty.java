
public class AverageProperty extends Property {

	public AverageProperty(String address, int numRooms, int numPeople) {
		super(address, numRooms, numPeople);
	}

	@Override
	public double rentPrice(int nights) {
		return 500 * this.numPeople * nights;
	}

}
