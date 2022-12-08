package se.uu.homebasedmonitoring;

public class Scheduler {

    private int pendingActions = 0;
    private Request[] requests;

    public boolean contactPotentialResponders(Responder responder, Request request) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public boolean contactRequesterSuccess(Requester requester, Request request) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public String askUserForFeedback(User user, Request request) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public int getPendingActions() {
        return pendingActions;
    }

    public void setPendingActions(int pendingActions) {
        this.pendingActions = pendingActions;
    }

    public Request[] getRequests() {
        return requests;
    }

    public void setRequests(Request[] requests) {
        this.requests = requests;
    }
}
