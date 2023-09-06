import java.util.ArrayList;
public class TicketsDAO {

private static ArrayList<Tickets>tickets;
private static int id = 5;

static {
    tickets = new ArrayList<>();
    City departure = new City("Almaty");
    City arrival = new City( "Moscow");

    City departure2 = new City(  "Astana");
    City arrival2 = new City(   "Aktau");

    Aircraft aircraft = new Aircraft("Boeing 777");
    Aircraft aircraft2 = new Aircraft(  "Boing 890");

    Flight flight = new Flight(  1, aircraft, departure, arrival,1);
    Flight flight2 = new Flight( 2, aircraft2, departure2, arrival2, 1);
    Flight flight3 = new Flight(  3, aircraft2, departure, arrival,2);
    Flight flight4 = new Flight(  4, aircraft2, departure2, arrival,1);

    tickets.add(new Tickets(  1, flight,25000, UserDAO.getUsers().get(2)));
    tickets. add(new Tickets(  2, flight,15000));
    tickets.add(new Tickets(  3, flight, 18000));
    tickets.add(new Tickets(  4, flight, 17000));
}
public static void printAllTicketsData(){
    for (Tickets tickets : tickets){
        System.out.println(tickets);
    }
}
public static ArrayList<Tickets>getTickets(){
    return tickets;
}
public static void addTickets(){
    Tickets t = getTickets().get(0);
    t.setId(id);
    id++;
}
}
