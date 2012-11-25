package nz.co.aetheric.scrivener.user;

import javax.persistence.Entity;

@Entity
public class UserBean {

    Long id;
    private String username;
    private String password;

    public Long getId() {
        return this.id;
    }

    public UserBean setId(Long id) {
        this.id = id;
        return this;
    }

    public String getUsername() {
        return this.username;
    }

    public UserBean setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return this.password;
    }

    public UserBean setPassword(String password) {
        this.password = password;
        return this;
    }
}
