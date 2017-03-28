package org.fridgeguard.model;

/**
 * @author Timur Nasibullin
 * @since 3/28/2017
 */
public class Login {
    private String userName;
    private String passwordHash;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }
}
