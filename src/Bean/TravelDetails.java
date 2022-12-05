package Bean;



public class TravelDetails {
    public TravelDetails(String source, String destination, int distance, int noOfTravellers, boolean isDiscounted) {
        this.source = source;
        this.destination = destination;
        this.distance = distance;
        this.noOfTravellers = noOfTravellers;
        this.isDiscounted = isDiscounted;
    }

    private String source;
    private String  destination;
    private int distance;

    private boolean isDiscounted;

    public boolean isDiscounted() {
        return isDiscounted;
    }

    public void setDiscounted(boolean discounted) {
        isDiscounted = discounted;
    }

    public int getNoOfTravellers() {
        return noOfTravellers;
    }

    public void setNoOfTravellers(int noOfTravellers) {
        this.noOfTravellers = noOfTravellers;
    }

    private int noOfTravellers;

    public void setSource(String source) {
        this.source = source;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public int getDistance() {
        return distance;
    }
}
