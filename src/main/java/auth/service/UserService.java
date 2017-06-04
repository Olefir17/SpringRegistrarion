package auth.service;

import auth.model.User;

/**
 * Created by Anastasia on 06.04.2017.
 */
public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
