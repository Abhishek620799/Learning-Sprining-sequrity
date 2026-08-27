package springseqrity.in.demo.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;
import java.util.TreeSet;

@NoArgsConstructor
@Setter
@Getter
@Entity
public class User {
    @Id
   // @GeneratedValue(Strategy= GenerationType.IDENTITY);
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    @Column(nullable = false ,unique = true)
    private  String username;
    @Column(nullable = false)
    private String password;
    private  boolean enabled;
    @ManyToMany
    @JoinTable(
            name="user_roles"
            , joinColumns = @JoinColumn(name="user_id"),
            inverseJoinColumns = @JoinColumn(name="role_id")

    )
    private Set<Role> roles= new TreeSet<>();
}
