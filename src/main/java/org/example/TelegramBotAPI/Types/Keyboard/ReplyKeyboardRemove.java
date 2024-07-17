package org.example.TelegramBotAPI.Types.Keyboard;

import com.google.gson.annotations.SerializedName;

public class ReplyKeyboardRemove implements Keyboard {
    @SerializedName("remove_keyboard")
    private final boolean removeKeyboard = true;
    private final boolean selective;

    public ReplyKeyboardRemove(boolean selective) {
        this.selective = selective;
    }

    public boolean isRemoveKeyboard() {
        return removeKeyboard;
    }

    public boolean isSelective() {
        return selective;
    }
}
