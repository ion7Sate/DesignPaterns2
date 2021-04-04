package Bridge;

public class EmailMessageSender implements MessageSender {

    @Override
    public void sendMessage() {
        System.out.println("Sending email Message ....");
    }
}
