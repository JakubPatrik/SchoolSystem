package app;

class Address{
    private String city;
    private String street;
    private String zip;
    private int number;

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return this.street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZip() {
        return this.zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    public void printAddress(){
        System.out.println("City: " + getCity() + ", Street: " + getStreet() + " " + getNumber() + ", Postal code: " + getZip());
    } 
}