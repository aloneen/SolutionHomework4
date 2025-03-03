package kz.seisen.SingletonPattern;

import java.util.HashMap;


// This is singleton
public class ConfigurationManager {

    private static ConfigurationManager instance;
    // We use hashMap for configurations storage
    private HashMap<String, String> configurations;


    private ConfigurationManager() {
        // I did add some configurations for example
        configurations = new HashMap<>();

        configurations.put("maxPlayers", "100");
        configurations.put("minPlayers", "1");
        configurations.put("defaultLanguage", "en");
        configurations.put("gameDifficulty", "medium");

    }

    // Getting our instance. I used lazy init.
    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }


    // One config
    public String getConfiguration(String key) {
        return configurations.get(key);
    }
    // to show all configs
    public void getAllConfigurations() {
        for (String key : configurations.keySet()) {
            System.out.println(key + ": " + configurations.get(key));
        }
    }



}
