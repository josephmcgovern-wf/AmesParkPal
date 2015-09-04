import java.util.Date;
import java.util.ArrayList;

public class Meter {
	
	/**
	 * The name of this meter.
	 * Example: "5.67" or "C.127"
	 */
	private String name;
	
	/**
	 * Maximum amount of time on this meter in minutes.
	 */
	private int timeLimit;
	
	/**
	 * An array list of the times this meter is available for parking.
	 */
	private ArrayList<ArrayList<Date>> timeAvailable;
	
	/**
	 * Time left on this meter in minutes.
	 */
	private int timeRemaining;
	
	/**
	 * Rate in cents per hour for this meter.
	 */
	private int ratePerHour;
	
	/**
	 * Amount of time added for a quarter.
	 */
	private int timePerQuarter;
	
	/**
	 * Amount of time added for a dime.
	 */
	private int timePerDime;
	
	/**
	 * Amount of time added for a nickel.
	 */
	private int timePerNickel;
	
	/**Default constructor.
	 * Creates a new Meter object.
	 * A meter has a name, time limit, rate per hour, and time available.
	 * A meter has a time added for quarters dimes and nickels
	 * 
	 * @param name 
	 * @param timeAvailable
	 * @param timeLimit
	 * @param timePerQuarter
	 * @param timePerDime
	 * @param timePerNickel
	 */
	public Meter(
			String name, 
			ArrayList<ArrayList<Date>> timeAvailable,
			int timeLimit, 
			int timePerQuarter,
			int timePerDime,
			int timePerNickel)
	{
		this.name = name;
		this.timeLimit = timeLimit;
		this.timeAvailable = timeAvailable;
		this.timePerQuarter = timePerQuarter;
		this.timePerDime = timePerDime;
		this.timePerNickel = timePerNickel;
	}
	
	/**
	 * Determines whether or not this meter has expired.
	 * @return
	 * 			True if there is no time remaining,
	 * 			false otherwise.
	 */			
	public boolean isExpired(){
		return (timeRemaining == 0);
	}
	
	/**
	 * Gets the time remaining on this meter.
	 * @return
	 * 			Time remaining in minutes.
	 */
	public int timeRemaining(){
		return timeRemaining;
	}
	
	/**
	 * Adds time to this meter, if able.
	 * Time can only be added in increments of quarters, dimes, and nickels.
	 * @param
	 * 			Time to be added in minutes.
	 */
	public void addTime(int minutes){
		//TODO
	}
	
	/**
	 * Determines if time can be added to this meter.
	 * @return
	 * 			True if the time added for a nickel does not exceed the time limit,
	 * 			false otherwise.
	 */
	public boolean canAddTime(){
		//TODO
		return false;
	}
	
	/**
	 * Gets the time limit on this meter.
	 * @return
	 * 			Time limit in minutes.
	 */			
	public int getTimeLimit(){
		return timeLimit;
	}	
}
