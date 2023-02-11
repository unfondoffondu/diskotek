/**
 * Using Jackson, this Class handles file IO in JSON format
 * Authored by Jeff Schowe for DiskoTek
 * No warranty
 */
package org.example;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.Map;

import static java.nio.file.StandardOpenOption.*;

public class Proto {
    /**
     * Simple class to read and write JSON.
     * Methods
     * WriteJSON(ObjectMapper o, Map m)    ---   deletes and rewrites the file
     * ReadMasterRegistryJSON()            ---   reads the file
     * @param cMapper
     * @param cMap
     * @throws IOException
     */
    public static void WriteJSON(ObjectMapper cMapper, Map cMap) throws IOException {
        new PrintWriter("masterRegistry.json").close();
        String json = cMapper.writerWithDefaultPrettyPrinter().writeValueAsString(cMap);
        Files.write(new File("masterRegistry.json").toPath(), Collections.singletonList(json), APPEND);
        System.exit(0);
    }
    public static String ReadMasterRegistryJSON() throws IOException {
        Path fileName = Path.of("masterRegistry.json");
        return Files.readString(fileName);
    }
    protected static void addUserToMap(Map uMap, RegSimUserData cRegSimUserData) {
        uMap.put(cRegSimUserData.userName, cRegSimUserData);

    }
}

