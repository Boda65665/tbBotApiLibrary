package org.example.TelegramBotAPI.Types.Keyboard.Inline;

import com.google.gson.annotations.SerializedName;
import org.example.TelegramBotAPI.Types.Keyboard.Keyboard;

public class InlineKeyboardMarkup implements Keyboard {
    @SerializedName("inline_keyboard")
    private InlineKeyboardButton[][] inline_keyboard;

    public InlineKeyboardMarkup(InlineKeyboardButton[][] inlineKeyboard) {
        this.inline_keyboard = inlineKeyboard;
    }

    public InlineKeyboardButton[][] getInlineKeyboard() {
        return inline_keyboard;
    }

    public void setInlineKeyboard(InlineKeyboardButton[][] inlineKeyboard) {
        this.inline_keyboard = inlineKeyboard;
    }
}
