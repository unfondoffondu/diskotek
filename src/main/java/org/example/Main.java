/**
 * This is a simple engine to get started. It grabs JSON from the Proto class method, instantiates mapper, and populates
 * the map with user objects.
 * I went with Maven build system to accomplish the imports, it was painless.
 */
package org.example;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Map;

public class Main {
/**
 * Just a jump in point to the Registration Simulator
 */
    public static void main(String[] args) throws IOException {
        String json = Proto.ReadMasterRegistryJSON();
        ObjectMapper mapper = new ObjectMapper();
        Map<String, User> userMap = mapper.readValue(json, new TypeReference<>(){});
        RegistrationSimulator.greetUser(userMap, mapper);
    }
}