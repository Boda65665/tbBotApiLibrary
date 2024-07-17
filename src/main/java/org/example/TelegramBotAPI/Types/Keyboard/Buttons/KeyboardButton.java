package org.example.TelegramBotAPI.Types.Keyboard.Buttons;

import com.google.gson.annotations.SerializedName;

public class KeyboardButton {
    private String text;
    @SerializedName("request_contact")
    private Boolean requestContact;
    @SerializedName("request_location")
    private Boolean requestLocation;

    public KeyboardButton(String text, Boolean requestContact, Boolean requestLocation) {
        this.text = text;
        this.requestContact = requestContact;
        this.requestLocation = requestLocation;
    }

    public KeyboardButton(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Boolean getRequestContact() {
        return requestContact;
    }

    public void setRequestContact(Boolean requestContact) {
        this.requestContact = requestContact;
    }

    public Boolean getRequestLocation() {
        return requestLocation;
    }

    public void setRequestLocation(Boolean requestLocation) {
        this.requestLocation = requestLocation;
    }
}
