package Service;

import Bean.*;

public class TravelService {
    TravelDetails travelDetails;

    Printer printer;
    public Double calculateFair(TravelDetails travelDetails, FairCalculation fairCalculation){
        return fairCalculation.calculate(travelDetails);
    }

    public TravelResponse generateTicket(TravelDetails travelDetails){
        FairCalculation fairCalculation = null;
        TravelResponse travelResponse = new TravelResponse();
        travelResponse.setNoOfTravellers(travelDetails.getNoOfTravellers());
        travelResponse.setDestination(travelDetails.getDestination());
        travelResponse.setSource(travelDetails.getSource());
        travelResponse.setDistance(travelDetails.getDistance());
        if(travelDetails.isDiscounted()){
            fairCalculation = new DiscountedFairCalculation();
        }
        else{
            fairCalculation = new NormalFairCalculation();
        }
        travelResponse.setFair(calculateFair(travelDetails,fairCalculation));
        return travelResponse;
    }

    public void printTiketDetails(TravelResponse travelResponse,Printer printer){
        printer.print(travelResponse);
    }
}
