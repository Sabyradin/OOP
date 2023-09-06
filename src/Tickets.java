public class Tickets {
    private int id;
    private Flight flights;
    private double cost;
    private User user;

    public Tickets(int id,Flight flights,double cost,User User){
        this.id = id;
        this.flights = flights;
        this.cost = cost;
        this.user = User;
    }
    public Tickets(Flight flights,double cost,User User){
        this.flights = flights;
        this.cost = cost;
        this.user = User;
    }
    public Tickets(int id,Flight flights,double cost){
        this.id = id;
        this.flights = flights;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Flight getFlights() {
        return flights;
    }

    public void setFlights(Flight flights) {
        this.flights = flights;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public User getPerson() {
        return user;
    }

    public void setPerson(User person) {
        this.user = person;
    }

}
