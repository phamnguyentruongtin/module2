package projectmodule2.caseStudy.Model;

public class Booking  {
    private double idBooking;
    private String startDay;
    private String endDay;
    private double idGuest;
    private String nameService;
    private String typeService;

    public Booking(double idBooking, String startDay, String endDay, double idGuest, String nameService, String typeService) {
        this.idBooking = idBooking;
        this.startDay = startDay;
        this.endDay = endDay;
        this.idGuest = idGuest;
        this.nameService = nameService;
        this.typeService = typeService;
    }

    public double getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(double idBooking) {
        this.idBooking = idBooking;
    }

    public String getStartDay() {
        return startDay;
    }

    public void setStartDay(String startDay) {
        this.startDay = startDay;
    }

    public String getEndDay() {
        return endDay;
    }

    public void setEndDay(String endDay) {
        this.endDay = endDay;
    }

    public double getIdGuest() {
        return idGuest;
    }

    public void setIdGuest(double idGuest) {
        this.idGuest = idGuest;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public String getTypeService() {
        return typeService;
    }

    public void setTypeService(String typeService) {
        this.typeService = typeService;
    }
}
