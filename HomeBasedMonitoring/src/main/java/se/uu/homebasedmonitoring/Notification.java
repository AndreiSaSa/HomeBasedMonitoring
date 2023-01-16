package se.uu.homebasedmonitoring;

public class Notification implements RequestSubscriber {
    
    public String type;
    public String Text;
    public int priority;

    public void updateState(Request request) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
