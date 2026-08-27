package springseqrity.in.demo.Repositiory;


import org.springframework.data.jpa.repository.JpaRepository;
import springseqrity.in.demo.Entity.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {

    Optional<User> findByUsername(String username);
}
