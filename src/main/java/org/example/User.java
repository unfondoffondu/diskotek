package org.example;

public interface User { // User interface
    String getUsername(); // signature method to get the Username: getter
    DummyRole[] getRoles(); // signature method to get the Roles: getter
    String getPassword(); // getter to get the password: signature method
    int getAge();
    String getEmail();
    String getName();
    public void loggedIn();
}
