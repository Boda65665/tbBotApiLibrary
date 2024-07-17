package org.example.TelegramBotAPI.Types.Message;

import com.google.gson.annotations.SerializedName;

public class ChatBoostAdded {
    @SerializedName("boost_count")
    private int boostCount;

    public int getBoostCount() {
        return boostCount;
    }

    public void setBoostCount(int boostCount) {
        this.boostCount = boostCount;
    }
}
