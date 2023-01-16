package se.uu.homebasedmonitoring;

import java.util.List;

public class UserHandler {
    
    public List<User> userList;
    private DatabaseHandler dbContext;
    

    public void deleteUsers(int UserID){
        throw new UnsupportedOperationException("Not implemented yet");
    }
    
    public void updateUser(int UserID){
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public DatabaseHandler getDbContext() {
        return dbContext;
    }

    public void setDbContext(DatabaseHandler dbContext) {
        this.dbContext = dbContext;
    }
}   

