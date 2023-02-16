package org.example;
/**
 *Interface for Factory.
 */

import java.io.IOException;

public interface FactoryInterface {
    static void buildUser(String desiredUsername, String name, String desiredEmail, int age, String passwd){}
    DummyUser buildPatronUser(UserData uData);

}