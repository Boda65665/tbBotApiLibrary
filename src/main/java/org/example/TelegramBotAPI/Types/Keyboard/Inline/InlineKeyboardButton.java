package org.example.TelegramBotAPI.Types.Keyboard.Inline;

import com.google.gson.annotations.SerializedName;

public class InlineKeyboardButton {
    private String text;
    private String url;
    @SerializedName("callback_data")
    private String callback_data;
    @SerializedName("switch_inline_query")
    private String switchInlineQuery;
    @SerializedName("switch_inline_query_current_chat")
    private String switchInlineQueryCurrentChat;
    private String pay;

    public InlineKeyboardButton(String text,String callback_data) {
        this.text = text;
        this.callback_data = callback_data;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCallback_data() {
        return callback_data;
    }

    public void setCallback_data(String callback_data) {
        this.callback_data = callback_data;
    }

    public String getSwitchInlineQuery() {
        return switchInlineQuery;
    }

    public void setSwitchInlineQuery(String switchInlineQuery) {
        this.switchInlineQuery = switchInlineQuery;
    }

    public String getSwitchInlineQueryCurrentChat() {
        return switchInlineQueryCurrentChat;
    }

    public void setSwitchInlineQueryCurrentChat(String switchInlineQueryCurrentChat) {
        this.switchInlineQueryCurrentChat = switchInlineQueryCurrentChat;
    }

    public String getPay() {
        return pay;
    }

    public void setPay(String pay) {
        this.pay = pay;
    }
}
