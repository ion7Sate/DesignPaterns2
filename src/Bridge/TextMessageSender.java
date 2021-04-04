package Bridge;

public class TextMessageSender implements  MessageSender{

    @Override
    public void sendMessage() {
        System.out.println("Sending a text Message....");
    }
}
