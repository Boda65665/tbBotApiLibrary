package org.example.TelegramBotAPI.Types.Message;

import com.google.gson.annotations.SerializedName;

public class Location {
    @SerializedName("proximity_alert_radius")
    private Float proximityAlertRadius;
    private Float heading;
    @SerializedName("live_period")
    private Float livePeriod;
    @SerializedName("horizontal_accuracy")
    private int horizontalAccuracy;
    private int longitude;
    private int latitude;

    public Float getProximityAlertRadius() {
        return proximityAlertRadius;
    }

    public void setProximityAlertRadius(Float proximityAlertRadius) {
        this.proximityAlertRadius = proximityAlertRadius;
    }

    public Float getHeading() {
        return heading;
    }

    public void setHeading(Float heading) {
        this.heading = heading;
    }

    public Float getLivePeriod() {
        return livePeriod;
    }

    public void setLivePeriod(Float livePeriod) {
        this.livePeriod = livePeriod;
    }

    public int getHorizontalAccuracy() {
        return horizontalAccuracy;
    }

    public void setHorizontalAccuracy(int horizontalAccuracy) {
        this.horizontalAccuracy = horizontalAccuracy;
    }

    public int getLongitude() {
        return longitude;
    }

    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }

    public int getLatitude() {
        return latitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }
}
