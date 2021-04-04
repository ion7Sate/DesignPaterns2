package Bridge;

public class VoiceMessageSender implements MessageSender{
    @Override
    public void sendMessage() {
        System.out.println("Sendind a voice Message...");
    }
}
