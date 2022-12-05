package Bean;

public class DiscountedFairCalculation implements FairCalculation{
    @Override
    public double calculate(TravelDetails travelDetails) {
        double amount = ((((travelDetails.getDistance() - 100) * 5)+750) * travelDetails.getNoOfTravellers());
        int discount = 50;
        double discounted_amount = (amount*discount/100);
        return (amount - discounted_amount);
    }
}
