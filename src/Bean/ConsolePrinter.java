package Bean;

import Bean.Printer;

public class ConsolePrinter implements Printer {
    @Override
    public void print(TravelResponse travelResponse) {
        System.out.println("----------Ticket Details----------");
        System.out.println("Source: "+travelResponse.getSource());
        System.out.println("Destination: "+travelResponse.getDestination());
        System.out.println("Kms: "+travelResponse.getDistance());
        System.out.println("No. of Travellers: "+travelResponse.getNoOfTravellers());
        System.out.println("Ticekt Fair: "+travelResponse.getFair());
    }
}
