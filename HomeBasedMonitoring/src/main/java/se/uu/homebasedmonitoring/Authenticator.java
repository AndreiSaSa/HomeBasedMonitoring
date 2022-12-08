package se.uu.homebasedmonitoring;

public class Authenticator implements IAuthenticator{

    private DatabaseHandler dbContext;
    @Override
    public boolean login(String username, String password) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public boolean logout() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public DatabaseHandler getDbContext() {
        return dbContext;
    }

    public void setDbContext(DatabaseHandler dbContext) {
        this.dbContext = dbContext;
    }
}
