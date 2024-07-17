package org.example.TelegramBotAPI.Types.Message;

import org.example.TelegramBotAPI.Types.Chat;

public class Story {
    private Chat chat;
    private int id;

    public Chat getChat() {
        return chat;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
