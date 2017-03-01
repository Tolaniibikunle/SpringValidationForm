package ries.dan;

/**
 * Created by danries on 2/21/17.
 */
public class User {

    private String formUsername;
    private String formPassword;

    public User(String username, String password){
        this.formUsername = username;
        this.formPassword = password;
    }

    public String getUsername() {
        return formUsername;
    }

    public String getPassword() {
        return formPassword;
    }
}
