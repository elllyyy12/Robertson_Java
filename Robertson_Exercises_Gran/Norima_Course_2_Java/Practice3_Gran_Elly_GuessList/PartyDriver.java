import java.util.*;

/**
 * Java Course 2, Module 3
 * 
 * Ungraded Practice Activity 3 - Guest List
   *
 * @author Elly Jay C. Gran
 */

public class PartyDriver {

    public static void main(String[] args) {

        Party party = new Party(3, "David Beckham");
        party.addGuest("Roberto Baggio");
        party.addGuest("Zinedine Zidane");
        party.addGuest("Roberto Baggio");
        party.addGuest("Johan Cruyff");
        party.addGuest("Diego Maradona");
        party.printParty();
    }
}
//This is the PartyDriver class that was given on the instructions.