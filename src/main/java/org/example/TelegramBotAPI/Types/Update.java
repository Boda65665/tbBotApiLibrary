package org.example.TelegramBotAPI.Types;

import com.google.gson.annotations.SerializedName;
import org.example.TelegramBotAPI.Types.Message.Message;

public class Update {
    @SerializedName("update_id")
    private int updateId;
    private Message message;
    @SerializedName("edited_message")
    private Message editedMessage;
    @SerializedName("inline_query")
    private InlineQuery inlineQuery;
    @SerializedName("callback_query")
    CallbackQuery callbackQuery;

    public int getUpdateId() {
        return updateId;
    }

    public Message getMessage() {
        return message;
    }

    public Message getEditedMessage() {
        return editedMessage;
    }

    public InlineQuery getInlineQuery() {
        return inlineQuery;
    }

    public CallbackQuery getCallbackQuery() {
        return callbackQuery;
    }

    @Override
    public String toString() {
        return "Update{" +
                "updateId=" + updateId +
                ", message=" + message +
                ", editedMessage=" + editedMessage +
                ", inlineQuery=" + inlineQuery +
                ", callbackQuery=" + callbackQuery +
                '}';
    }
}
