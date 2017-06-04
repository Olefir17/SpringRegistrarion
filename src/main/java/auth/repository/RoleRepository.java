package auth.repository;

import auth.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Anastasia on 05.04.2017.
 */
public interface RoleRepository extends JpaRepository<Role,Long> {
}
