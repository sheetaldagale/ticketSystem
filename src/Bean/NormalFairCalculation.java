package Bean;

public class NormalFairCalculation implements FairCalculation{
    @Override
    public double calculate(TravelDetails travelDetails) {
        return ((((travelDetails.getDistance() - 100) * 5)+750) * travelDetails.getNoOfTravellers());
    }
}
