package kz.seisen.AdapterPattern;


//That our legasy Chat service which we gonna adapt and use it's function
public class LegacyChatService {
    public void sendLegacyMessage(String message) {
        System.out.println("Legacy Chat: " + message);
    }
}
