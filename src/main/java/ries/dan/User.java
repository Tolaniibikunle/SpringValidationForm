package ries.dan;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * Created by danries on 2/21/17.
 */
public class User {

    @NotEmpty
    private String formUsername;

    @NotEmpty
    private String formPassword;

    public User(){}

    public String getUsername() {
        return formUsername;
    }

    public String getPassword() {
        return formPassword;
    }

    public void setFormUsername(String formUsername) {
        this.formUsername = formUsername;
    }

    public void setFormPassword(String formPassword) {
        this.formPassword = formPassword;
    }
}
