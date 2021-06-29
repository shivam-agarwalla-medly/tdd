package co.interleap.courses.tdd;

public class Ride {
    static  final  int FARE_PER_KM=10;
    static final int FARE_PER_MIN=1;
    private double distance;
    private double time;

    Ride(double distance , double time)
    {
        this.distance=distance;
        this.time=time;
    }

    public double getTotalFare()
    {
        return distance*FARE_PER_KM+time*FARE_PER_MIN;
    }
}
