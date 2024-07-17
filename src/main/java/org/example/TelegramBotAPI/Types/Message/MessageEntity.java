package org.example.TelegramBotAPI.Types.Message;

import com.google.gson.annotations.SerializedName;

public class MessageEntity {
    private String type;
    private int offset;
    private int length;
    private String url;
    private String language;
    @SerializedName("custom_emoji_id")
    private String customEmojiId;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCustomEmojiId() {
        return customEmojiId;
    }

    public void setCustomEmojiId(String customEmojiId) {
        this.customEmojiId = customEmojiId;
    }
}
