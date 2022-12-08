package se.uu.homebasedmonitoring;

public interface IAuthenticator {

    boolean login(String username, String password);
    boolean logout();
}
