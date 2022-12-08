package se.uu.homebasedmonitoring;

public class ResponderPreferences extends Preferences{
    private Topic[] consideredTopics;
    private int durationOfActivity;

    @Override
    public void updatePreferences() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public void setPreferences() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public Topic[] getConsideredTopics() {
        return consideredTopics;
    }

    public void setConsideredTopics(Topic[] consideredTopics) {
        this.consideredTopics = consideredTopics;
    }

    public int getDurationOfActivity() {
        return durationOfActivity;
    }

    public void setDurationOfActivity(int durationOfActivity) {
        this.durationOfActivity = durationOfActivity;
    }
}
