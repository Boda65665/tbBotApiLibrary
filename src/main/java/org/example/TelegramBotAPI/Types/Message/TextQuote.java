package org.example.TelegramBotAPI.Types.Message;

import com.google.gson.annotations.SerializedName;

public class TextQuote {
    private String text;
    private MessageEntity[] entities;
    private int position;
    @SerializedName("isManual")
    private Boolean isManual;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public MessageEntity[] getEntities() {
        return entities;
    }

    public void setEntities(MessageEntity[] entities) {
        this.entities = entities;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public Boolean getManual() {
        return isManual;
    }

    public void setManual(Boolean manual) {
        isManual = manual;
    }
}
