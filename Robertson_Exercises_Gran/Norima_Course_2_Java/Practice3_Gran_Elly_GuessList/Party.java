public class Party {
    //Lines 3 - 5. Naming variables.
    private String [] guestList;
    private int numOfGuest;
    private String hostName;
    //Line 7 constructor - A constructor that stores with max guest and hostname.
    Party(int maxNumGuest, String hostName){
        this.hostName = hostName;
        guestList = new String[maxNumGuest];
        numOfGuest = 0;
    }
    //Line 13 Method - checks if the guest is on the list.
    public boolean isOnList(String guest){
        for(int i = 0; i < numOfGuest; i++){
            if(guestList[i].equalsIgnoreCase(guest))
            return true;
        }
        return false;
    }
    //Line 21 Method - This tells if the guest cannot come to the party or the if they are already on the guest list.
    public void addGuest(String guest){
        if(numOfGuest >= guestList.length){
            System.out.println(guest + " cannot come to the party. The guest list is full.");
        }
        else if(isOnList(guest)){
            System.out.println(guest + " is already on the guest list.");
        }
        else {
            guestList[numOfGuest] = guest;
            numOfGuest++;
        }
    }
    //Line 34 Method - Displays who are on the list of host's party.
    public void printParty(){
        System.out.println("Guest List for " + hostName + "'s Party:");
        for(int i = 0; i < numOfGuest; i++){
            System.out.println(guestList[i]);
        }
    }
}
