
import java.util.ArrayList;
import java.util.Date;

public class ParkingArea {
	/**
	 * The name of this ParkingArea
	 * Example: "5-5" or "M-M"
	 */
	private String name;
	
	/**
	 * A list of a list of dates when the public can park
	 * in this ParkingArea. The format will be
	 * [[startTimeAvailable, startTimeNotAvailable], [startTimeAvailable, startTimeNotAvailable]]
	 * Example: [[Mon 12:00 AM, Mon 8:00 AM], [Mon 5:00 PM, Mon 11:59 PM]]
	 * Thus, the public can park before 8 AM and after 5 PM on Mondays
	 */
	private ArrayList<ArrayList<Date>> timeAvailable;
	
	/**
	 * A list of Meters inside this ParkingArea
	 */
	private ArrayList<Meter> meters;
	
	/**
	 * A list of ParkignSpaces inside this ParkingArea
	 */
	private ArrayList<ParkingSpace> parkingSpaces;
	
	/**
	 * Creates a new ParkingArea object.
	 * A ParkingArea is a lot or zone, thus containing
	 * either at least one Meter or at least one ParkingSpace  
	 * @param name
	 * 		The name of the Parking Area. Ex: "5-5" or "M-M"
	 */
	public ParkingArea(String name) {
		this.name = name;
	}
	
	/**
	 * Determines whether or not this ParkingArea is open for
	 * public parking
	 * @return
	 * 		True if this ParkingArea is open for public parking,
	 * 		false otherwise
	 * 		
	 */
	public boolean isOpen() {
		return false;
	}
	
	/**
	 * Gets all the meters inside this ParkingArea
	 * that no longer require payment
	 * @return
	 * 		ArrayList of Meter that no longer require payment
	 */
	public ArrayList<Meter> getFreeMeters() {
		// TODO think of a better name for this
		return null;
	}
	
	/**
	 * Gets the times when this ParkingArea is available for public parking
	 * @return
	 * 		ArrayList of ArrayList of Dates of when this ParkingArea can be used 
	 */
	public ArrayList<ArrayList<Date>> getTimeAvailable() {
		return null;
	}
	
	
	/**
	 * Gets a meter in this ParkingArea by the
	 * meter's name
	 * @return
	 * 		Meter associated with given string or null
	 */
	public Meter getMeter(String meterName) {
		return null;
	}
	
	/**
	 * Gets all the meters inside this ParkingArea
	 * @return
	 * 		ArrayList of all associated Meter
	 */
	public ArrayList<Meter> getMeters() {
		return meters;
	}
	
	/**
	 * @return
	 * 		The name of this ParkingArea
	 */
	public String getName() {
		return name;
	}
	
	
	/**
	 * Gets all the ParkingSpaces inside this ParkingArea
	 * @return
	 * 		ArrayList of all associated ParkingSpace
	 */
	public ArrayList<ParkingSpace> getParkingSpaces() {
		return parkingSpaces;
	}
	
	/**
	 * Adds a Meter to this ParkingArea
	 * @param meter
	 * 		Meter to be added to this ParkingArea
	 */
	public void addMeter(Meter meter) {
		// TODO add meter
	}
	
	/**
	 * Adds a ParkingSpace to this ParkingArea
	 * @param space
	 * 		ParkingSpace to be added to this ParkingArea
	 */
	public void addParkingSpace(ParkingSpace space) {
		// TODO add parking space
	}
	
	
	
}
