package se.uu.homebasedmonitoring;

public class DatabaseHandler {

    private String connectionString;

    public boolean connect() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public boolean update(Request request) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public String getConnectionString() {
        return connectionString;
    }

    public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
    }
}
