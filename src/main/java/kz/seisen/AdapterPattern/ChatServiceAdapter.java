package kz.seisen.AdapterPattern;

//Adapter itself
public class ChatServiceAdapter implements ChatService {
    private LegacyChatService legacyChatService;

    public ChatServiceAdapter(LegacyChatService legacyChatService) {
        this.legacyChatService = legacyChatService;
    }


    // Here we are adapting the method from legasy to our Chat service
    @Override
    public void sendMessage(String message) {
        legacyChatService.sendLegacyMessage(message);
    }

}
