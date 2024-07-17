package org.example.TelegramBotAPI.Types;

import com.google.gson.annotations.SerializedName;
import org.example.TelegramBotAPI.Types.Message.MaybeInaccessibleMessage;
import org.example.TelegramBotAPI.Types.Message.Message;

public class CallbackQuery {
    private final String id;
    private final String data;
    @SerializedName("chat_instance")
    private final String chatInstance;
    @SerializedName("inline_message_id")
    private final String inlineMessageId;
    private final User from;

    public CallbackQuery(String id, String data, User from, String inlineMessageId, String chatInstance) {
        this.id = id;
        this.data = data;
        this.from = from;
        this.inlineMessageId = inlineMessageId;
        this.chatInstance = chatInstance;
    }

    public String getId() {
        return id;
    }


    public String getData() {
        return data;
    }

    public String getChatInstance() {
        return chatInstance;
    }

    public String getInlineMessageId() {
        return inlineMessageId;
    }

    public User getFrom() {
        return from;
    }


    @Override
    public String toString() {
        return "CallbackQuery{" +
                "id='" + id + '\'' +
                ", data='" + data + '\'' +
                ", chatInstance='" + chatInstance + '\'' +
                ", inlineMessageId='" + inlineMessageId + '\'' +
                ", from=" + from +
                '}';
    }
}
