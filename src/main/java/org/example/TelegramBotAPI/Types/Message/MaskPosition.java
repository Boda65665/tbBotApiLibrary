package org.example.TelegramBotAPI.Types.Message;

import com.google.gson.annotations.SerializedName;

public class MaskPosition {
    private String point;
    @SerializedName("y_shift")
    private Float yShift;
    @SerializedName("x_shift")
    private Float xShift;
    private Float scale;

    public String getPoint() {
        return point;
    }

    public void setPoint(String point) {
        this.point = point;
    }

    public Float getyShift() {
        return yShift;
    }

    public void setyShift(Float yShift) {
        this.yShift = yShift;
    }

    public Float getxShift() {
        return xShift;
    }

    public void setxShift(Float xShift) {
        this.xShift = xShift;
    }

    public Float getScale() {
        return scale;
    }

    public void setScale(Float scale) {
        this.scale = scale;
    }
}
