package projectmodule2.caseStudy.Model;

public class Villa extends Facility  {
    private byte roomStandard;
    private float areaOfpool;
    private short floors;

    public Villa(String nameServices, double usableArea, double cost, byte limitedPerson, String rentalType, byte roomStandard, float areaOfpool, short floors) {
        super(nameServices, usableArea, cost, limitedPerson, rentalType);
        this.roomStandard = roomStandard;
        this.areaOfpool = areaOfpool;
        this.floors = floors;
    }

    public byte getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(byte roomStandard) {
        this.roomStandard = roomStandard;
    }

    public float getAreaOfpool() {
        return areaOfpool;
    }

    public void setAreaOfpool(float areaOfpool) {
        this.areaOfpool = areaOfpool;
    }

    public short getFloors() {
        return floors;
    }

    public void setFloors(short floors) {
        this.floors = floors;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "roomStandard=" + roomStandard +
                ", areaOfpool=" + areaOfpool +
                ", floors=" + floors +
                '}';
    }
}

