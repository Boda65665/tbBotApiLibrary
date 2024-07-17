package org.example.TelegramBotAPI.Methods.RequestBody;

import com.google.gson.annotations.SerializedName;
import org.example.TelegramBotAPI.Types.Keyboard.Keyboard;

public class SendMessageRequestBody {
    @SerializedName("chat_id")
    private final int chatId;
    private final String text;
    @SerializedName("parse_mode")
    private final String parseMode;
    @SerializedName("reply_markup")
    private final Keyboard replyMarkup;

    public SendMessageRequestBody(int chatId, String text, String parseMode, Keyboard replyMarkup) {
        this.chatId = chatId;
        this.text = text;
        this.parseMode = parseMode;
        this.replyMarkup = replyMarkup;
    }

    public int getChatId() {
        return chatId;
    }

    public String getText() {
        return text;
    }

    public String getParseMode() {
        return parseMode;
    }

    public Keyboard getReplyMarkup() {
        return replyMarkup;
    }
}
