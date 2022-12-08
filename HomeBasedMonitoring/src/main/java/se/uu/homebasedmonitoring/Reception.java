package se.uu.homebasedmonitoring;

public class Reception {
    private int numOfPendingActions = 0;
    private DatabaseHandler dbContext;
    private Scheduler scheduler;
    private RequestSubscriber[] subscribersList;

    private Matcher matcher;

    public Request nextAction() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void createRequest() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public Responder chooseResponder(Responder[] responders, Request request) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public int getNumOfPendingActions() {
        return numOfPendingActions;
    }

    public void setNumOfPendingActions(int numOfPendingActions) {
        this.numOfPendingActions = numOfPendingActions;
    }

    public DatabaseHandler getDbContext() {
        return dbContext;
    }

    public void setDbContext(DatabaseHandler dbContext) {
        this.dbContext = dbContext;
    }

    public Scheduler getScheduler() {
        return scheduler;
    }

    public void setScheduler(Scheduler scheduler) {
        this.scheduler = scheduler;
    }

    public RequestSubscriber[] getSubscribersList() {
        return subscribersList;
    }

    public void setSubscribersList(RequestSubscriber[] subscribersList) {
        this.subscribersList = subscribersList;
    }

    public Matcher getMatcher() {
        return matcher;
    }

    public void setMatcher(Matcher matcher) {
        this.matcher = matcher;
    }
}
