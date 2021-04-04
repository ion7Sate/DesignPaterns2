package Bridge;

import java.util.List;

public class EmailMessage extends Message{

    public EmailMessage(MessageSender messageSender) {
        super(messageSender);
    }

    public void send(){
        messageSender.sendMessage();
    }


}
