package javaclasses.abiturientdata;

public class Address {
    private String city;
    private int postIndex;
    private String cityAddress;
    private String phoneNumber;

    public Address(){

    }

    public Address(String city, String cityAddress, String phoneNumber) {
        this.city = city;
        this.cityAddress = cityAddress;
        this.phoneNumber = phoneNumber;
    }

    public Address(String city, int postIndex, String cityAddress, String phoneNumber){
        this(city,cityAddress,phoneNumber);
        this.postIndex = postIndex;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCityAddress(String cityAddress) {
        this.cityAddress = cityAddress;
    }

    public String getCityAddress() {
        return cityAddress;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPostIndex(int postIndex) {
        this.postIndex = postIndex;
    }

    public int getPostIndex() {
        return postIndex;
    }
}
