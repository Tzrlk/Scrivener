package nz.co.aetheric.scrivener.auth;

import static nz.co.aetheric.scrivener.user.UserController.PATH_PROFILE_EDIT;

public class LoginForm {
    String username;
    String password;
    String redirect = PATH_PROFILE_EDIT;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRedirect() {
        return this.redirect;
    }

    public void setRedirect(String redirect) {
        this.redirect = redirect;
    }
}