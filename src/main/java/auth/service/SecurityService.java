package auth.service;

/**
 * Created by Anastasia on 05.04.2017.
 */
public interface SecurityService {
    String findLoggedInUsername();

    void autologin(String username, String password);
}
