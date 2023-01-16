package se.uu.homebasedmonitoring;

import java.util.List;

public abstract class User {

    protected int userId;
    protected String email;
    protected String password;
    protected String phoneNumber;
    protected Preferences preferences;
    protected String address;
    protected int rating = 0;
    protected int numOfRequests = 0;
    protected List<UserRequest> listOfRequests;
    protected NotificationHandler notificationHandler;

    public void updateInfo(String email, String password, String phoneNumber, String address) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void createAccount(String email, String password, String phoneNumber, Preferences preferences, String address) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void removeAccount(User user) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public boolean writeFeedback(Request request) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Preferences getPreferences() {
        return preferences;
    }

    public void setPreferences(Preferences preferences) {
        this.preferences = preferences;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getNumOfRequests() {
        return numOfRequests;
    }

    public void setNumOfRequests(int numOfRequests) {
        this.numOfRequests = numOfRequests;
    }

    public void addRequest(UserRequest request){
        this.listOfRequests.add(request);
    }
    public void removeRequest(int requestId){
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
