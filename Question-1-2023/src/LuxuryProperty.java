
public class LuxuryProperty extends Property {

	boolean hasSeaView;

	public LuxuryProperty(String address, int numRooms, int numPeople, boolean hasSeaView) {
		super(address, numRooms, numPeople);
		this.hasSeaView = hasSeaView;
	}

	public boolean isHasSeaView() {
		return hasSeaView;
	}

	@Override
	public double rentPrice(int nights) {
		return 900 * this.numPeople * nights;
	}

}
