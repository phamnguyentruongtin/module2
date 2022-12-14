package projectmodule2.caseStudy.Model;


public class House extends Facility {

    private short roomStandardOf;
    private short floors;

    public int getRoomStandardOf() {
        return roomStandardOf;
    }

    public void setRoomStandardOf(short roomStandardOf) {
        this.roomStandardOf = roomStandardOf;
    }

    public float getFloors() {
        return floors;
    }


    public void setFloors(short floors) {
        this.floors = floors;
    }

    public House(String nameServices, double usableArea, double cost, byte limitedPerson, String rentalType, short roomStandardOf, short floors) {
        super(nameServices, usableArea, cost, limitedPerson, rentalType);
        this.roomStandardOf = roomStandardOf;
        this.floors = floors;

    }

    @Override
    public String toString() {
        return "House{" +
                "roomStandardOf=" + roomStandardOf +
                ", floors=" + floors +
                '}';
    }

}

