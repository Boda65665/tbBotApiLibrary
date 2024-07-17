package org.example.TelegramBotAPI.Types.Message;

import com.google.gson.annotations.SerializedName;

public class Voice {
    @SerializedName("file_id")
    private String fileId;
    @SerializedName("file_unique_id")
    private String fileUniqueId;
    @SerializedName("mime_type")
    private String mimeType;
    private int duration;
    @SerializedName("file_size")
    private int fileSize;

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

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getFileSize() {
        return fileSize;
    }

    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }
}
