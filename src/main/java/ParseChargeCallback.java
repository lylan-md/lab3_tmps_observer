public class ParseChargeCallback implements Callback {
    @Override
    public void execute(User user) {
        System.out.println("User was charged, enable subscription! User: " + user.getName());
    }
}
