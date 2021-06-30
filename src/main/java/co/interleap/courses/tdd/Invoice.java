package co.interleap.courses.tdd;

import java.util.List;

public class Invoice {

    private List<Ride> rides;
    private double TotalFare;
    private double AverageFare;
    private double NumberOfRides;

    Invoice(List<Ride> rides ,double TotalFare, double AverageFare, double NumberOfRides)
    {
        this.rides=rides;
        this.TotalFare=calcTotalFare(rides);
        this.AverageFare=this.TotalFare/rides.size();
        this.NumberOfRides=rides.size();
    }
    public double calcTotalFare(List<Ride> rides)
    {
        double totalFare=0;
        for (Ride ride:rides)
        {
            totalFare+= ride.getTotalFare();
        }
        return totalFare;
    }

    public double getTotalFare(){return TotalFare;}
    public  double getAverageFare(){return AverageFare;}
    public double getNumberOfRides(){return  NumberOfRides;}
}
