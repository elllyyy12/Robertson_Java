public class IpAddress {

    private String IpAdd; //In this class. I added a variable named IpAdd to store address.
    private int firstOctet; //lines 4 - 7 four int variables need based on the document.
    private int secondOctet;
    private int thirdOctet;
    private int fourthOctet;

    public IpAddress(String IpAdd){
        this.IpAdd = IpAdd;
        String[] ip = this.IpAdd.split("[.]"); //Created string method to seperate octet with dot.

        this.firstOctet = Integer.parseInt(ip[0]); //Lines 13 - 16 is to convert string to int. 
        this.secondOctet = Integer.parseInt(ip[1]);
        this.thirdOctet = Integer.parseInt(ip[2]);
        this.fourthOctet = Integer.parseInt(ip[3]);
    }


    public String getDottedDecimal(){
        return IpAdd; //this is the constructor mentioned in the word file to add that returns variable's value.
    }

    public int getOctet(int octet){ //In this method I used if else to return the value of each octet.
        if(octet == 1){
            return this.firstOctet;
        }
        else if(octet == 2){
            return this.secondOctet;
        }
        else if(octet == 3){
            return this.thirdOctet;
        }
        else {
            return this.fourthOctet;
        }
    }
}
