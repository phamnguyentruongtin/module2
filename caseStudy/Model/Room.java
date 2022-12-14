package projectmodule2.caseStudy.Model;

public class Room extends Facility{
    private String servicesFree;

    public Room(String nameServices, double usableArea, double cost, byte limitedPerson, String rentalType, String servicesFree) {
        super(nameServices, usableArea, cost, limitedPerson, rentalType);
        this.servicesFree = servicesFree;
    }

    public String getServicesFree() {
        return servicesFree;
    }

    public void setServicesFree(String servicesFree) {
        this.servicesFree = servicesFree;
    }

    @Override
    public String toString() {
        return "Room{" +
                "servicesFree='" + servicesFree + '\'' +
                '}';
    }


}
