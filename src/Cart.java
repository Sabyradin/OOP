import java.util.ArrayList;

public class Cart {

    private User user;
    private ArrayList<Tickets>tickets = new ArrayList<>();

    public Cart(){
    }
    public Cart(User user){
        this.user = user;
    }
    public User getUser(){
        return user;
    }
    public void setUser(User user){
    this.user = user;
    }
    public ArrayList<Tickets>getTickets(){
        return tickets;
    }
    public void setTickets(ArrayList<Tickets>tickets){
        this.tickets = tickets;
    }
    public boolean CheckUserMoney(){
        int sum = 0;
        for (Tickets tickets : tickets){
            sum += tickets.getCost();
            return user.getMoney() >= sum;
        }
        return user.getMoney()>=sum;
    }
    public int totalPrafit() {
        int sum = 0;
        for (Tickets ticket : tickets) {
            sum += ticket.getCost();
        }
        return sum; // Это выражение возвращает сумму стоимостей билетов
    }
    public void addTickets(Tickets newTickets) {
        if (CheckUserMoney()) {
            System.out.println("Сізде қаражат жеткілікті");
            System.out.println("Сіз билетті сәтті сатып алдыз");
            this.tickets.add(newTickets);
        } else {
            System.out.println("Сізде қаражат жеткіліксіз");
        }
    }
    public void printCart(){
        for (Tickets tickets : tickets){
        System.out.println(tickets);
        }
    }
    public void removeTicket(Tickets ticket) {
        if (tickets.contains(tickets)) {
            tickets.remove(tickets);
            System.out.println("Билет успешно удален из корзины.");
        } else {
            System.out.println("Билет не найден в корзине.");
        }
    }

}
