package jarg.com.pringles.models;

import java.io.Serializable;

public class User implements Serializable {
    private String email;
    private String password;
    private double balance;

    public User(String email, String password, double balance) {
        this.email = email;
        this.password = password;
        this.balance = balance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                '}';
    }

    public boolean validateData(String email, String password) {
            return this.email.equals(email) &&
                this.password.equals(password);
    }
}
