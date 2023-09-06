public class Flight {
    private int id;
    private Aircraft aircraft;
    private City departure;
    private City arrival;
    private int placeCount;

    public Flight(int id,Aircraft aircraft,City departure,City arrival,int placeCount){
        this.id = id;
        this.aircraft = aircraft;
        this.departure = departure;
        this.arrival = arrival;
        this.placeCount = placeCount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Aircraft getAircraft() {
        return aircraft;
    }

    public void setAircraft(Aircraft aircraft) {
        this.aircraft = aircraft;
    }

    public City getDeparture() {
        return departure;
    }

    public void setDeparture(City departure) {
        this.departure = departure;
    }

    public City getArrival() {
        return arrival;
    }

    public void setArrival(City arrival) {
        this.arrival = arrival;
    }

    public int getPlaceCount() {
        return placeCount;
    }

    public void setPlaceCount(int placeCount) {
        this.placeCount = placeCount;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "id=" + id +
                ", aircraft=" + aircraft +
                ", departure=" + departure +
                ", arrival=" + arrival +
                ", placeCount=" + placeCount +
                '}';
    }
}
