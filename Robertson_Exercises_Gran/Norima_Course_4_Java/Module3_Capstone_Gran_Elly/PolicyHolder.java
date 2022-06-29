public class PolicyHolder {
    //lines 3-9 declared variables
    private String firstName; 
    private String lastName;
    private String dateOfBirth;
    private String Address;
    private String licenseNumber;
    private String dateOfIssue;
    public String relationship;

    public PolicyHolder() {

    }

    public PolicyHolder(String firstName, String lastName, String dateOfBirth, String address, String license, String dateOfIssue) { 
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        Address = address;
        this.licenseNumber = license;
        this.dateOfIssue = dateOfIssue;
    } //Constructor with parameters for account owner itself

    public PolicyHolder(String relationship, String firstName, String lastName, String dateOfBirth, String address, String license, String dateOfIssue) { 
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        Address = address;
        this.licenseNumber = license;
        this.dateOfIssue = dateOfIssue;
        this.relationship = relationship;
    } //created constructor with parameters that has a relationship to the account owner. Example: could be the child or the spouse of the customer.

    //lines 31-85 generated getters and setters
    public String getFirstName() { 
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(String dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }
}