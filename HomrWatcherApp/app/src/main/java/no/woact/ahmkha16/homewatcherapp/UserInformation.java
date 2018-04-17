package no.woact.ahmkha16.homewatcherapp;

/**
 * Created by Eier on 4/17/2018.
 */

public class UserInformation {

    private String username;
    private String password;

    public UserInformation(String username, String password) {
        this.username = username;
        this.password = password;
    }


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
}
