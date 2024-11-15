package be.vinci.ipl.cae.demos.complete.repositories;

import be.vinci.ipl.cae.demos.complete.models.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    boolean existsByUsername(String username);

    User findByUsername(String username);
}
