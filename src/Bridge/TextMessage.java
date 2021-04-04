package Bridge;

import java.util.List;

public class TextMessage extends Message{


    public TextMessage(MessageSender messageSender) {
        super(messageSender);
    }

    @Override
    public void send() {
        messageSender.sendMessage();
    }
}
