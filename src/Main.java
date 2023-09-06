import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cart cart = new Cart();

        while (true){
            System.out.println("[1] Админ");
            System.out.println("[2]Кассир");
            System.out.println("[3]Покупатель");
            int choice = scanner.nextInt();

            if (choice == 1){
                System.out.println("Біз сізді тексеруіміз керек");
                System.out.println("Құпия сөзді еңгіз");
                String password = scanner.next();
                if(UserDAO.checkAdmin(password)){
                    User user = UserDAO.getUsers().get(0);
                    System.out.println("Хай Админ" + user.getFullName());
                    System.out.println("Не істейміз ?");
                    System.out.println("Базадағы барлық билеттер");
                    TicketsDAO.printAllTicketsData();
                    System.out.println("---------------------");
                    System.out.println("[1] Жаңа билет қосу");
                    System.out.println("[2] Ұшу параметрлерін өзгерту");
                    System.out.println("[3] Билеттің бағасын өзгерту");
                    System.out.println("[4] Кірісті қарау ");
                    int choiceAdmin = scanner.nextInt();
                    if (choiceAdmin == 1){
                        TicketsDAO.addTickets();
                        System.out.println("Билет қосылды");
                        TicketsDAO.printAllTicketsData();
                    }
                    else if (choiceAdmin == 2){
                        System.out.println("Сіз тек билеттің санын ғана өзгерте аласыз");
                        TicketsDAO.getTickets().get(0).getFlights().setPlaceCount(10);
                        System.out.println("Өзгертулер сақталды");
                        TicketsDAO.printAllTicketsData();
                    } else if (choiceAdmin == 3) {
                        System.out.println("Сіз билеттің бағасын өзгерте аласыз");
                        TicketsDAO.getTickets().get(0).setCost(33000);
                        System.out.println("Өзгертулер сақталды");
                        TicketsDAO.printAllTicketsData();
                    } else if (choiceAdmin == 4) {
                        cart.totalPrafit();
                    }
                }
            } else if (choice == 3) {
                User user = UserDAO.getUsers().get(2);

                System.out.println("-------------------------------");
                System.out.println("Не қалайсыз");
                System.out.println("[1]Билет сатып алу");
                System.out.println("[2]Билетті қайтару");
                int choice2 = scanner.nextInt();
                if(choice2 == 1){
                    System.out.println("<Билетті id бойынша таңдаңыз");
                    int id = scanner.nextInt();
                    ArrayList<Tickets> tickets = TicketsDAO.getTickets();

                    for (Tickets ticket : tickets){
                        if(ticket.getId() == id){
                            if (ticket.getFlights().getPlaceCount() >= 1){
                                cart.setUser(user);
                               // ticket.getFlights().decreasePlaceCount();

                                cart.addTickets(ticket);
                                System.out.println("---------");
                                cart.printCart();
                            }
                        }
                    }
                }
                else if (choice2 == 2) {
                    System.out.println("Сіз билетті қайтарып жатырсыз");
                    cart.printCart();
                    System.out.println("id бойынша таңдаңыз");
                    int id = scanner.nextInt();

                    ArrayList<Tickets> cartTickets = cart.getTickets();

                    int ticketIndexToRemove = -1;

                    for (int i = 0; i < cartTickets.size(); i++) {
                        if (id == cartTickets.get(i).getId()) {
                            ticketIndexToRemove = i;
                            break;
                        }
                    }

                    if (ticketIndexToRemove != -1) {
                        cart.removeTicket(cartTickets.get(ticketIndexToRemove));
                        System.out.println("Билет с id " + id + " успешно удален.");
                    } else {
                        System.out.println("Билет с id " + id + " не найден в корзине.");
                    }

                    cart.printCart();
                }

                System.out.println("Не қалайсыз");
            }
        }
    }
}