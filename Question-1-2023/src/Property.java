
public abstract class Property {

	String address;
	int numRooms;
	int numPeople;

	public Property(String address, int numRooms, int numPeople) {
		super();
		this.address = address;
		this.numRooms = numRooms;
		this.numPeople = numPeople;
	}

	public abstract double rentPrice(int nights);
}
