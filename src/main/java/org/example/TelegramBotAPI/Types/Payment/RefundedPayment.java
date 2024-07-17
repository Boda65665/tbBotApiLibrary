package org.example.TelegramBotAPI.Types.Payment;

import com.google.gson.annotations.SerializedName;

public class RefundedPayment {
    @SerializedName("provider_payment_charge_id")
    private String providerPaymentChargeId;
    @SerializedName("telegram_payment_charge_id")
    private String telegramPaymentChargeId;
    @SerializedName("invoice_payload")
    private String invoicePayload;
    @SerializedName("total_amount")
    private int totalAmount;
    private String currency;

    public String getProviderPaymentChargeId() {
        return providerPaymentChargeId;
    }

    public void setProviderPaymentChargeId(String providerPaymentChargeId) {
        this.providerPaymentChargeId = providerPaymentChargeId;
    }

    public String getTelegramPaymentChargeId() {
        return telegramPaymentChargeId;
    }

    public void setTelegramPaymentChargeId(String telegramPaymentChargeId) {
        this.telegramPaymentChargeId = telegramPaymentChargeId;
    }

    public String getInvoicePayload() {
        return invoicePayload;
    }

    public void setInvoicePayload(String invoicePayload) {
        this.invoicePayload = invoicePayload;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
