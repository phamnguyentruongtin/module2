package projectmodule2.caseStudy.Model;

public abstract class Facility {
    private String nameServices;
    private double usableArea;
    private double cost;
    private byte limitedPerson;
    private String rentalType;

    public Facility(String nameServices, double usableArea, double cost, byte limitedPerson, String rentalType) {
        this.nameServices = nameServices;
        this.usableArea = usableArea;
        this.cost = cost;
        this.limitedPerson = limitedPerson;
        this.rentalType = rentalType;
    }

    public String getNameServices() {
        return nameServices;
    }

    public void setNameServices(String nameServices) {
        this.nameServices = nameServices;
    }

    public double getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(double usableArea) {
        this.usableArea = usableArea;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public byte getLimitedPerson() {
        return limitedPerson;
    }

    public void setLimitedPerson(byte limitedPerson) {
        this.limitedPerson = limitedPerson;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

}
