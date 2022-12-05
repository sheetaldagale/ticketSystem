import Bean.ConsolePrinter;
import Bean.Printer;
import Bean.TravelDetails;
import Bean.TravelResponse;
import Service.TravelService;

public class Main {
    public static void main(String[] args) {

        TravelService travelService = new TravelService();
        TravelDetails travelDetails = new TravelDetails("Pune","Nashik",200,2,true);

        TravelResponse travelResponse = travelService.generateTicket(travelDetails);

        Printer printer = new ConsolePrinter();
        travelService.printTiketDetails(travelResponse,printer);


    }
}