package projectmodule2.caseStudy.Model;

public class Contract {
    private double idContract;
    private double idBooking;
    private double firstPay;
    private double totalPay;
    private double idGuest;

    public Contract(double idContract, double idBooking, double firstPay, double totalPay, double idGuest) {
        this.idContract = idContract;
        this.idBooking = idBooking;
        this.firstPay = firstPay;
        this.totalPay = totalPay;
        this.idGuest = idGuest;
    }

    public double getIdContract() {
        return idContract;
    }

    public void setIdContract(double idContract) {
        this.idContract = idContract;
    }

    public double getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(double idBooking) {
        this.idBooking = idBooking;
    }

    public double getFirstPay() {
        return firstPay;
    }

    public void setFirstPay(double firstPay) {
        this.firstPay = firstPay;
    }

    public double getTotalPay() {
        return totalPay;
    }

    public void setTotalPay(double totalPay) {
        this.totalPay = totalPay;
    }

    public double getIdGuest() {
        return idGuest;
    }

    public void setIdGuest(double idGuest) {
        this.idGuest = idGuest;
    }
}
