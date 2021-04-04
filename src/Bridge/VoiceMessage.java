package Bridge;

public class VoiceMessage extends Message {
    public VoiceMessage(MessageSender messageSender) {
        super(messageSender);
    }

    @Override
    public void send() {
        messageSender.sendMessage();
    }
}
