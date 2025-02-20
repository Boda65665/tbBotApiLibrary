package org.example.TelegramBotAPI.Types.Message;

public class Dice {
    private String emoji;
    private int value;

    public String getEmoji() {
        return emoji;
    }

    public void setEmoji(String emoji) {
        this.emoji = emoji;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Dice{" +
                "emoji='" + emoji + '\'' +
                ", value=" + value +
                '}';
    }
}
