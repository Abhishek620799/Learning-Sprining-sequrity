package springseqrity.in.demo.Repositiory;

import org.springframework.data.jpa.repository.JpaRepository;
import springseqrity.in.demo.Entity.Role;

import java.util.Optional;

public interface Roleuser extends JpaRepository<Role,Long> {

    //Optional<Role> findByUsername(String username);
}
