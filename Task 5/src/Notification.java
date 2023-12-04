import java.util.ArrayList;
import java.util.List;

public class Notification {
    private List<Estate> estates;
    private List<Subscriber> subscribers;

    public Notification() {
        this.estates = new ArrayList<>();
        this.subscribers = new ArrayList<>();
    }

    public void addEstate(Estate estate) {
        estates.add(estate);
        notifySubscribers(estate);
    }

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    private void notifySubscribers(Estate estate) {
        for (Subscriber subscriber : subscribers) {
            subscriber.notify(estate);
        }
    }
}
