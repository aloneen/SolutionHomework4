package kz.seisen.SingletonPattern;


public class ConfigManagerDemo {
    public static void main(String[] args) {
        // Getting an instance
        ConfigurationManager configManager = ConfigurationManager.getInstance();

        // Using method for get config
        System.out.println("maxPlayers: " + configManager.getConfiguration("maxPlayers"));


        // To show all configurations
        configManager.getAllConfigurations();

    }
}
