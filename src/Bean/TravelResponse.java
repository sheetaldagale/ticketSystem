package Bean;

public class TravelResponse {

    private String source;

    public String getSource() {
        return source;
    }

    @Override
    public String toString() {
        return "TravelResponse{" +
                "source='" + source + '\'' +
                ", destination='" + destination + '\'' +
                ", distance=" + distance +
                ", noOfTravellers=" + noOfTravellers +
                ", fair=" + fair +
                '}';
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getNoOfTravellers() {
        return noOfTravellers;
    }

    public void setNoOfTravellers(int noOfTravellers) {
        this.noOfTravellers = noOfTravellers;
    }

    public double getFair() {
        return fair;
    }

    public void setFair(double fair) {
        this.fair = fair;
    }

    private String  destination;
    private int distance;

    private int noOfTravellers;

    private double fair;
}
