package org.example.TelegramBotAPI.Types.Message;

import com.google.gson.annotations.SerializedName;

public class Sticker {
    @SerializedName("file_id")
    private String fileId;
    @SerializedName("file_unique_id")
    private String fileUniqueId;
    private String type;
    private int width;
    private int height;
    @SerializedName("is_video")
    private Boolean isVideo;
    @SerializedName("is_animated")
    private Boolean isManual;
    @SerializedName("photo_size")
    private PhotoSize thumbnail;
    @SerializedName("premium_animation")
    private File premiumAnimation;
    @SerializedName("mask_position")
    private MaskPosition maskPosition;
    @SerializedName("custom_emoji_id")
    private String customEmojiId;
    @SerializedName("needs_repainting")
    private Boolean needsRepainting;

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public String getFileUniqueId() {
        return fileUniqueId;
    }

    public void setFileUniqueId(String fileUniqueId) {
        this.fileUniqueId = fileUniqueId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Boolean getIsVideo() {
        return isVideo;
    }

    public void setIsVideo(Boolean isVideo) {
        isVideo = isVideo;
    }

    public Boolean getVideo() {
        return isVideo;
    }

    public void setVideo(Boolean video) {
        isVideo = video;
    }

    public Boolean getManual() {
        return isManual;
    }

    public void setManual(Boolean manual) {
        isManual = manual;
    }

    public PhotoSize getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(PhotoSize thumbnail) {
        this.thumbnail = thumbnail;
    }

    public File getPremiumAnimation() {
        return premiumAnimation;
    }

    public void setPremiumAnimation(File premiumAnimation) {
        this.premiumAnimation = premiumAnimation;
    }

    public MaskPosition getMaskPosition() {
        return maskPosition;
    }

    public void setMaskPosition(MaskPosition maskPosition) {
        this.maskPosition = maskPosition;
    }

    public String getCustomEmojiId() {
        return customEmojiId;
    }

    public void setCustomEmojiId(String customEmojiId) {
        this.customEmojiId = customEmojiId;
    }

    public Boolean getNeedsRepainting() {
        return needsRepainting;
    }

    public void setNeedsRepainting(Boolean needsRepainting) {
        this.needsRepainting = needsRepainting;
    }

    @Override
    public String toString() {
        return "Sticker{" +
                "fileId='" + fileId + '\'' +
                ", fileUniqueId='" + fileUniqueId + '\'' +
                ", type='" + type + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", isVideo=" + isVideo +
                ", isManual=" + isManual +
                ", thumbnail=" + thumbnail +
                ", premiumAnimation=" + premiumAnimation +
                ", maskPosition=" + maskPosition +
                ", customEmojiId='" + customEmojiId + '\'' +
                ", needsRepainting=" + needsRepainting +
                '}';
    }
}
