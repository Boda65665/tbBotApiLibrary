package org.example.TelegramBotAPI.HttpRequest.Entity;

import org.example.TelegramBotAPI.Types.Keyboard.Keyboard;

public class Photo extends File {
    private String caption;
    private String parseMode;
    private String messageEffectId;
    private Keyboard replyMarkup;

    public Photo(int chatId, String filePath) {
        super(chatId, filePath);
    }

    public Photo(int chatId, String filePath, String parseMode, String caption) {
        super(chatId, filePath);
        this.parseMode = parseMode;
        this.caption = caption;
    }

    public Photo(int chatId, String filePath,String caption,String parseMode, String messageEffectId) {
        super(chatId, filePath);
        this.messageEffectId = messageEffectId;
        this.parseMode = parseMode;
        this.caption = caption;
    }

    public Photo(int chatId, String filePath, String caption, String parseMode, String messageEffectId, Keyboard replyMarkup) {
        super(chatId, filePath);
        this.caption = caption;
        this.parseMode = parseMode;
        this.messageEffectId = messageEffectId;
        this.replyMarkup = replyMarkup;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getParseMode() {
        return parseMode;
    }

    public void setParseMode(String parseMode) {
        this.parseMode = parseMode;
    }

    public String getMessageEffectId() {
        return messageEffectId;
    }

    public void setMessageEffectId(String messageEffectId) {
        this.messageEffectId = messageEffectId;
    }

    public Keyboard getReplyMarkup() {
        return replyMarkup;
    }

    public void setReplyMarkup(Keyboard replyMarkup) {
        this.replyMarkup = replyMarkup;
    }
}
