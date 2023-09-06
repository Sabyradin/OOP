import java.util.ArrayList;

class UserDAO {
    private static ArrayList<User> users = new ArrayList<>();

    static {
    User admin = new User("sdvsdv svsdvsd", "AVAdvsdvv", Role.ADMIN);
    User cachier = new User("sdvsdv svsdvsd", "AVAdvsdvv", Role.CASHIER);
    User client = new User("sdvsdv svsdvsd", "AVAdvsdvv",5000, Role.CLIENT);

        users.add(admin);
        users.add(cachier);
        users.add(client);
    }
    public static ArrayList<User> getUsers(){return users;}
    public static void addUser(User user) {
        users.add(user);
    }
    public static void removeUser(User user){
        for (User user1 : users){
            if (user1.getRole() == Role.ADMIN){
                users.remove(user);
            }
        }
    }
    public static boolean checkAdmin(String password){
        for (User user : users){
            if (user.getRole() == Role.ADMIN && password.equals("admin"))
                return true;
        }
        return false;
    }
}