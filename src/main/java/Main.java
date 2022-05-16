public class Main {
    public static void main(String[] args) {
        ParseChargeCallback parseChargeCallback = new ParseChargeCallback();

        ChargeService chargeService = new ChargeService();
        chargeService.addCallback(parseChargeCallback);

        chargeService.charge(new User("Test user"));
    }
}
