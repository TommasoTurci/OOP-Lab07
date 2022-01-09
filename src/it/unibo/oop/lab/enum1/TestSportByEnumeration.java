package it.unibo.oop.lab.enum1;

import java.util.Collection;

import it.unibo.oop.lab.socialnetwork.User;
import it.unibo.oop.lab.socialnetwork.UserImpl;

/**
 * This is going to act as a test for
 * {@link it.unibo.oop.lab.enum1.SportSocialNetworkUserImpl}
 * 
 * 1) Realize the same test as the previous exercise, this time using
 * enumeration Sport
 * 
 * 2) Run it: every test must return true.
 * 
 */
public final class TestSportByEnumeration {

    private TestSportByEnumeration() { }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String... args) {
        /*
         * [TEST DEFINITION]
         * 
         * By now, you know how to do it
         */
       final SportSocialNetworkUserImpl<User> kbacon = new SportSocialNetworkUserImpl<>("Kevin", "Bacon", "kbacon",56);
       final SportSocialNetworkUserImpl<User> dwashington = new SportSocialNetworkUserImpl<>("Denzel", "Washington", "dwashington",59);
       final SportSocialNetworkUserImpl<User> mgladwell = new SportSocialNetworkUserImpl<>("Malcom", "Gladwell", "mgladwell",51);
       final SportSocialNetworkUserImpl<User> ntaleb = new SportSocialNetworkUserImpl<>("Nicholas", "Taleb", "ntaleb",54);
       final User asmith = new UserImpl("Adam", "Smith", "asmith");
       /*
        * Make people follow each other
        */
       mgladwell.addSport(Sport.VOLLEY);
       dwashington.addSport(Sport.BASKET);
       dwashington.addSport(Sport.MOTOGP);
       dwashington.addSport(Sport.F1);
       dwashington.addSport(Sport.BIKE);
       /*
        * All tests must return true
        */
       System.out.println("K Bacon must not follow MOTOGP: " + !kbacon.hasSport(Sport.MOTOGP));
       System.out.println("D Washington must follow MOTOGP: " + dwashington.hasSport(Sport.MOTOGP));
       System.out.println("D Washington must follow BASKET: " + dwashington.hasSport(Sport.BASKET));
       System.out.println("D Washington must not follow SOCCER: " + !dwashington.hasSport(Sport.SOCCER));
       System.out.println("D Washington must not follow VOLLEY: " + !dwashington.hasSport(Sport.VOLLEY));
    }
}
