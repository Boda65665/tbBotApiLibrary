package org.example.TelegramBotAPI.HttpRequest.Entity;

public class File {
    protected int chatId;
    protected String filePath;

    protected File(int chatId, String filePath) {
        this.chatId = chatId;
        this.filePath = filePath;
    }

    public int getChatId() {
        return chatId;
    }

    public void setChatId(int chatId) {
        this.chatId = chatId;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}
