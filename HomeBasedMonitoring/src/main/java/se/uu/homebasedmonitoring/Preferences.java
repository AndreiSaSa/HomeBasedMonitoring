package se.uu.homebasedmonitoring;

import java.time.LocalDateTime;

public class Preferences {

    protected int userId;
    protected String[] spokenLanguages;
    protected boolean signLanguage;
    protected LocalDateTime[] timetable;

    public void updatePreferences() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void setPreferences() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String[] getSpokenLanguages() {
        return spokenLanguages;
    }

    public void setSpokenLanguages(String[] spokenLanguages) {
        this.spokenLanguages = spokenLanguages;
    }

    public boolean isSignLanguage() {
        return signLanguage;
    }

    public void setSignLanguage(boolean signLanguage) {
        this.signLanguage = signLanguage;
    }

    public LocalDateTime[] getTimetable() {
        return timetable;
    }

    public void setTimetable(LocalDateTime[] timetable) {
        this.timetable = timetable;
    }
}
