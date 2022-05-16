import java.util.ArrayList;

public class ChargeService {
    ArrayList<Callback> callbacks = new ArrayList<>();

    public void addCallback(Callback callback) {
        this.callbacks.add(callback);
    }

    public void charge(User user) {
        // Logic of charge
        this.sendCallback(user);
    }

    public void sendCallback(User user) {
        for (Callback callback: callbacks) {
            callback.execute(user);
        }
    }
}
