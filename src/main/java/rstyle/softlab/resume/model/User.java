package rstyle.softlab.resume.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "users")
public class User implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column( unique = true, length = 50)
    private String username;

    @Column(length = 500)
    private String password;


    private Boolean enabled;

    @ManyToMany
    @JoinTable(joinColumns = @JoinColumn(name = "user_id"))
    private Set<Authority> authorities = new LinkedHashSet<>();

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired(){return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}