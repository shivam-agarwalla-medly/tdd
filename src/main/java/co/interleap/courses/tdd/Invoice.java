package co.interleap.courses.tdd;

import java.util.List;

public class Invoice {

    private double TotalFare;
    private double AverageFare;
    private double NumberOfRides;
    public List<Ride> Rides;

    Invoice(double TotalFare, double AverageFare, double NumberOfRides)
    {
        this.TotalFare=TotalFare;
        this.AverageFare=AverageFare;
        this.NumberOfRides=NumberOfRides;
    }

    public double getTotalFare(){return TotalFare;}
    public  double getAverageFare(){return AverageFare;}
    public double getNumberOfRides(){return  NumberOfRides;}
}
