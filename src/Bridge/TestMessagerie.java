package Bridge;

import org.junit.Test;

public class TestMessagerie {
    @Test
    public void testSendTextMessage() throws Exception {
        MessageSender textMessageSender = new TextMessageSender();
        Message textMessage = new TextMessage(textMessageSender);
        textMessage.send();

    }

    @Test
    public void testSendEmailMessage() throws Exception{
        MessageSender emailMessageSender=new EmailMessageSender();
        Message emailMessage=new TextMessage(emailMessageSender);
        emailMessage.send();
    }

    @Test
    public void testSendVoiceMessage() throws Exception{
        MessageSender voiceMessageSender=new VoiceMessageSender();
        Message voiceMessage=new TextMessage(voiceMessageSender);
        voiceMessage.send();
    }


    }
