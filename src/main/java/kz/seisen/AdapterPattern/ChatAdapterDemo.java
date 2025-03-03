package kz.seisen.AdapterPattern;

public class ChatAdapterDemo {
    public static void main(String[] args) {
        //Creating our legacy chat
        LegacyChatService legacyChatService = new LegacyChatService();

        //using adaptor to add legacy in our chat
        ChatService chatService = new ChatServiceAdapter(legacyChatService);

        //Result is: Legacy Chat: Hello World
        chatService.sendMessage("Hello World");
    }
}
