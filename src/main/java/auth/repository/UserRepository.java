package auth.repository;

/**
 * Created by Anastasia on 06.04.2017.
 */

import auth.model.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}