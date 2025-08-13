package web.utils;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class LocatorReader {

    private Map<String, String> locators;

    public LocatorReader(String jsonFilePath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            locators = mapper.readValue(new File(jsonFilePath), Map.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getLocator(String key) {
        return locators.get(key);
    }
}
