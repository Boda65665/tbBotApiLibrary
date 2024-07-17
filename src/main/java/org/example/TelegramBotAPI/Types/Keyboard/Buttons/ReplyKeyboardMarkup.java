package org.example.TelegramBotAPI.Types.Keyboard.Buttons;

import com.google.gson.annotations.SerializedName;
import org.example.TelegramBotAPI.Types.Keyboard.Keyboard;

public class ReplyKeyboardMarkup implements Keyboard {
    private Boolean selective;
    @SerializedName("input_field_placeholder")
    private String inputFieldPlaceholder;
    @SerializedName("one_time_keyboard")
    private Boolean oneTimeKeyboard;
    @SerializedName("resize_keyboard")
    private Boolean resizeKeyboard;
    @SerializedName("is_persistent")
    private Boolean isPersistent;
    private KeyboardButton[][] keyboard;

    public ReplyKeyboardMarkup(Boolean selective, String inputFieldPlaceholder, Boolean oneTimeKeyboard, Boolean resizeKeyboard, Boolean isPersistent, KeyboardButton[][] keyboard) {
        this.selective = selective;
        this.inputFieldPlaceholder = inputFieldPlaceholder;
        this.oneTimeKeyboard = oneTimeKeyboard;
        this.resizeKeyboard = resizeKeyboard;
        this.isPersistent = isPersistent;
        this.keyboard = keyboard;
    }

    public Boolean getSelective() {
        return selective;
    }

    public void setSelective(Boolean selective) {
        this.selective = selective;
    }

    public String getInputFieldPlaceholder() {
        return inputFieldPlaceholder;
    }

    public void setInputFieldPlaceholder(String inputFieldPlaceholder) {
        this.inputFieldPlaceholder = inputFieldPlaceholder;
    }

    public Boolean getOneTimeKeyboard() {
        return oneTimeKeyboard;
    }

    public void setOneTimeKeyboard(Boolean oneTimeKeyboard) {
        this.oneTimeKeyboard = oneTimeKeyboard;
    }

    public Boolean getResizeKeyboard() {
        return resizeKeyboard;
    }

    public void setResizeKeyboard(Boolean resizeKeyboard) {
        this.resizeKeyboard = resizeKeyboard;
    }

    public Boolean getPersistent() {
        return isPersistent;
    }

    public void setPersistent(Boolean persistent) {
        isPersistent = persistent;
    }

    public KeyboardButton[][] getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(KeyboardButton[][] keyboard) {
        this.keyboard = keyboard;
    }
}
