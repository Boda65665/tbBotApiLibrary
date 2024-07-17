package org.example.TelegramBotAPI.Types.Message;

import com.google.gson.annotations.SerializedName;

public class PhotoSize {
    @SerializedName("file_id")
    private String fileId;
    @SerializedName("file_unique_id")
    private String fileUniqueId;
    private int width;
    private int height;
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

    public int getFileSize() {
        return fileSize;
    }

    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }
}
