package org.example.TelegramBotAPI.Types.Message;

import org.example.TelegramBotAPI.Types.Chat;

public class InaccessibleMessage implements MaybeInaccessibleMessage {
    private final Chat chat;
    private final int messageId;
    private final int date;

    public InaccessibleMessage(Chat chat, int messageId, int date) {
        this.chat = chat;
        this.messageId = messageId;
        this.date = date;
    }

    public Chat getChat() {
        return chat;
    }

    public int getMessageId() {
        return messageId;
    }

    public int getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "InaccessibleMessage{" +
                "chat=" + chat +
                ", messageId=" + messageId +
                ", date=" + date +
                '}';
    }
}
