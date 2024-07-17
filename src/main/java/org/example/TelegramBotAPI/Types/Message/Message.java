package org.example.TelegramBotAPI.Types.Message;

import com.google.gson.annotations.SerializedName;
import org.example.TelegramBotAPI.Types.Chat;
import org.example.TelegramBotAPI.Types.Keyboard.Inline.InlineKeyboardMarkup;
import org.example.TelegramBotAPI.Types.Payment.Invoice;
import org.example.TelegramBotAPI.Types.Payment.RefundedPayment;
import org.example.TelegramBotAPI.Types.Payment.SuccessfulPayment;
import org.example.TelegramBotAPI.Types.User;

import java.util.Arrays;

public class Message implements MaybeInaccessibleMessage {
    @SerializedName("message_id")
    private int messageId;
    private String text;
    private User from;
    private int date;
    private Chat chat;
    @SerializedName("sender_chat")
    private Chat senderChat;
    @SerializedName("sender_boost_count")
    private int senderBoostCount;
    @SerializedName("reply_to_message")
    private Message replyToMessage;
    private TextQuote quote;
    private Integer editDate;
    private String mediaGroupId;
    private Audio audio;
    private Document document;
    private PhotoSize[] photo;
    private Sticker sticker;
    private Story story;
    private Animation animation;
    private Video video;
    private Voice voice;
    private String caption;
    @SerializedName("show_captionAbove_media")
    private Boolean showCaptionAboveMedia;
    private Dice dice;
    private Location location;
    private Invoice invoice;
    @SerializedName("successful_payment")
    private SuccessfulPayment successfulPayment;
    @SerializedName("refunded_payment")
    private RefundedPayment refundedPayment;
    @SerializedName("boost_added")
    private ChatBoostAdded boostAdded;
    @SerializedName("reply_markup")
    private InlineKeyboardMarkup replyMarkup;
    @SerializedName("is_topic_message")
    private Boolean isTopicMessage;
    @SerializedName("is_automatic_forward")
    private Boolean isAutomaticForward;
    @SerializedName("caption_entities")
    private MessageEntity[] captionEntities;
    @SerializedName("has_media_spoiler")
    private Boolean hasMediaSpoiler;
    private MessageEntity[] entities;
    @SerializedName("effect_id")
    private int EffectId;
    @SerializedName("migrate_to_chatId")
    private int migrateToChatId;
    @SerializedName("migrate_from_chatId")
    private int migrateFromChatId;

    public int getMessageId() {
        return messageId;
    }

    public String getText() {
        return text;
    }

    public User getFrom() {
        return from;
    }

    public int getDate() {
        return date;
    }

    public Chat getChat() {
        return chat;
    }

    public Chat getSenderChat() {
        return senderChat;
    }

    public int getSenderBoostCount() {
        return senderBoostCount;
    }

    public Message getReplyToMessage() {
        return replyToMessage;
    }

    public TextQuote getQuote() {
        return quote;
    }

    public Integer getEditDate() {
        return editDate;
    }

    public String getMediaGroupId() {
        return mediaGroupId;
    }

    public Audio getAudio() {
        return audio;
    }

    public Document getDocument() {
        return document;
    }

    public PhotoSize[] getPhoto() {
        return photo;
    }

    public Sticker getSticker() {
        return sticker;
    }

    public Story getStory() {
        return story;
    }

    public Animation getAnimation() {
        return animation;
    }

    public Video getVideo() {
        return video;
    }

    public Voice getVoice() {
        return voice;
    }

    public String getCaption() {
        return caption;
    }

    public Boolean getShowCaptionAboveMedia() {
        return showCaptionAboveMedia;
    }

    public Dice getDice() {
        return dice;
    }

    public Location getLocation() {
        return location;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public SuccessfulPayment getSuccessfulPayment() {
        return successfulPayment;
    }

    public RefundedPayment getRefundedPayment() {
        return refundedPayment;
    }

    public ChatBoostAdded getBoostAdded() {
        return boostAdded;
    }

    public InlineKeyboardMarkup getReplyMarkup() {
        return replyMarkup;
    }

    public Boolean getTopicMessage() {
        return isTopicMessage;
    }

    public Boolean getAutomaticForward() {
        return isAutomaticForward;
    }

    public MessageEntity[] getCaptionEntities() {
        return captionEntities;
    }

    public Boolean getHasMediaSpoiler() {
        return hasMediaSpoiler;
    }

    public MessageEntity[] getEntities() {
        return entities;
    }

    public int getEffectId() {
        return EffectId;
    }

    public int getMigrateToChatId() {
        return migrateToChatId;
    }

    public int getMigrateFromChatId() {
        return migrateFromChatId;
    }

    @Override
    public String toString() {
        return "Message{" +
                "messageId=" + messageId +
                ", text='" + text + '\'' +
                ", from=" + from +
                ", date=" + date +
                ", chat=" + chat +
                ", senderChat=" + senderChat +
                ", senderBoostCount=" + senderBoostCount +
                ", forwardOrigin=" + messageId +
                ", replyToMessage=" + replyToMessage +
                ", quote=" + quote +
                ", editDate=" + editDate +
                ", mediaGroupId='" + mediaGroupId + '\'' +
                ", audio=" + audio +
                ", document=" + document +
                ", photo=" + Arrays.toString(photo) +
                ", sticker=" + sticker +
                ", story=" + story +
                ", animation=" + animation +
                ", video=" + video +
                ", voice=" + voice +
                ", caption='" + caption + '\'' +
                ", showCaptionAboveMedia=" + showCaptionAboveMedia +
                ", dice=" + dice +
                ", location=" + location +
                ", invoice=" + invoice +
                ", successfulPayment=" + successfulPayment +
                ", refundedPayment=" + refundedPayment +
                ", boostAdded=" + boostAdded +
                ", replyMarkup=" + replyMarkup +
                ", isTopicMessage=" + isTopicMessage +
                ", isAutomaticForward=" + isAutomaticForward +
                ", captionEntities=" + Arrays.toString(captionEntities) +
                ", hasMediaSpoiler=" + hasMediaSpoiler +
                ", entities=" + Arrays.toString(entities) +
                ", EffectId=" + EffectId +
                ", migrateToChatId=" + migrateToChatId +
                ", migrateFromChatId=" + migrateFromChatId +
                '}';
    }
}
