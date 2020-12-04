package battleship;

public class Submarine extends Ship {

	/**
	 * The length of this type of ship
	 */
	private static final int length = 1;
	
	/**
	 * The type of the ship (�battleship�, �cruiser�, �destroyer�, or �submarine�)
	 */
	private static final String shipType = "submarine";
	
	/**
	 * Calls the superclass Ship constructor, and sets the length to match the specific subclass length
	 */
	public Submarine() {
		//call the superclass Ship constructor with the set length
		super(length);
	}
	
	/**
	 *Overrides abstract method in superclass
	 *Returns one of the strings �battleship�, �cruiser�, �destroyer�, or �submarine�, as appropriate.  
	 *This method can be useful for identifying what type of ship you are dealing with, 
	 *at any given point in time, and eliminates the need to use instanceof
	 */
	@Override
	public String getShipType() {
		return shipType;
	}
}