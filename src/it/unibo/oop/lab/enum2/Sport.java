/**
 * 
 */
package it.unibo.oop.lab.enum2;

import static it.unibo.oop.lab.enum2.Place.*;

/**
 * Represents an enumeration for declaring sports.
 * 
 * 1) You must add a field keeping track of the number of members each team is
 * composed of (1 for individual sports)
 * 
 * 2) A second field will keep track of the name of the sport.
 * 
 * 3) A third field, of type Place, will allow to define if the sport is
 * practiced indoor or outdoor
 * 
 */
public enum Sport {

    /*
     * TODO
     * 
     * Declare the following sports:
     * 
     * - basket
     * 
     * - volley
     * 
     * - tennis
     * 
     * - bike
     * 
     * - F1
     * 
     * - motogp
     * 
     * - soccer
     * 
     */
	BASKET(5,"Basket",INDOOR),
	VOLLEY(5,"Volley",INDOOR),
	TENNIS(1,"Tennis",OUTDOOR),
	BIKE(1,"Bike",OUTDOOR),
	F1(1,"F1",OUTDOOR),
	MOTOGP(1,"MotoGP",OUTDOOR), 
	SOCCER(11,"Soccer",OUTDOOR);
	
    /*
     * TODO
     * 
     * [FIELDS]
     * 
     * Declare required fields
     */
	private final int pNum; 
	private final String name;
	private final Place place;
	
    /*
     * TODO
     * 
     * [CONSTRUCTOR]
     * 
     * Define a constructor like this:
     * 
     * - Sport(final Place place, final int noTeamMembers, final String actualName)
     */
	private Sport(int pNum, String name, Place place) {
		this.pNum=pNum;
		this.name=name;
		this.place=place;
	}
    /*
     * TODO
     * 
     * [METHODS] To be defined
     * 
     * 
     * 1) public boolean isIndividualSport()
     * 
     * Must return true only if called on individual sports
     * 
     * 
     * 2) public boolean isIndoorSport()
     * 
     * Must return true in case the sport is practices indoor
     * 
     * 
     * 3) public Place getPlace()
     * 
     * Must return the place where this sport is practiced
     * 
     * 
     * 4) public String toString()
     * 
     * Returns the string representation of a sport
     */
	public boolean isIndividualSport() {
		return this.pNum==1;
	}
	public boolean isIndoorSport() {
		return this.place==OUTDOOR;
	}
	public Place getPlace() {
		return this.place;
	}
	public String toString() {
		return this.name +": is played by teams of "+this.pNum+", and is played "+this.place+".";
	}
}
