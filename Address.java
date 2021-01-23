public class Address {
    private String city;
    private String street;
    private int floor;
    private int buildingNo;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getBuildingNo() {
        return buildingNo;
    }

    public void setBuildingNo(int buildingNo) {
        this.buildingNo = buildingNo;
    }

    public void showAddress() {
        System.out.println("city: " + city);
        System.out.println("street: " + street);
        System.out.println("floor: " + floor);
        System.out.println("buildingNo: " + buildingNo);
    }
}
