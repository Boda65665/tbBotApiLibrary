package org.example.TelegramBotAPI.Types.Payment;

import com.google.gson.annotations.SerializedName;

public class ShippingAddress {
    @SerializedName("country_code")
    private String countryCode;
    private String state;
    private String city;
    @SerializedName("street_line1")
    private String streetLine1;
    @SerializedName("street_line2")
    private String streetLine2;
    @SerializedName("post_code")
    private String postCode;

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreetLine1() {
        return streetLine1;
    }

    public void setStreetLine1(String streetLine1) {
        this.streetLine1 = streetLine1;
    }



    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getStreetLine2() {
        return streetLine2;
    }

    public void setStreetLine2(String streetLine2) {
        this.streetLine2 = streetLine2;
    }
}
