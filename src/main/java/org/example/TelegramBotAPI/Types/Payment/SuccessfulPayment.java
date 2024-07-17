package org.example.TelegramBotAPI.Types.Payment;

import com.google.gson.annotations.SerializedName;

public class SuccessfulPayment {
    @SerializedName("provider_payment_charge_id")
    private String providerPaymentChargeId;
    @SerializedName("telegram_payment_charge_id")
    private String telegramPaymentChargeId;
    @SerializedName("order_info")
    private OrderInfo orderInfo;
    @SerializedName("shipping_option_id")
    private String shippingOptionId;
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

    public OrderInfo getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(OrderInfo orderInfo) {
        this.orderInfo = orderInfo;
    }

    public String getShippingOptionId() {
        return shippingOptionId;
    }

    public void setShippingOptionId(String shippingOptionId) {
        this.shippingOptionId = shippingOptionId;
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
