package org.example.TelegramBotAPI.Types.Payment;

import com.google.gson.annotations.SerializedName;

public class Invoice {
    private String title;
    private String description;
    @SerializedName("start_parameter")
    private String startParameter;
    private String currency;
    @SerializedName("total_amount")
    private int totalAmount;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getStartParameter() {
        return startParameter;
    }

    public void setStartParameter(String startParameter) {
        this.startParameter = startParameter;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }
}
