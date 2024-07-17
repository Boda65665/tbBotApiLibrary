package org.example;

import org.example.TelegramBotAPI.Exception.HttpRequestException;
import org.example.TelegramBotAPI.HttpRequest.Entity.Photo;
import org.example.TelegramBotAPI.HttpRequest.OkHttp;
import org.example.TelegramBotAPI.Types.Keyboard.Buttons.KeyboardButton;
import org.example.TelegramBotAPI.Types.Keyboard.Buttons.ReplyKeyboardMarkup;
import org.example.TelegramBotAPI.Types.Keyboard.Inline.InlineKeyboardButton;
import org.example.TelegramBotAPI.Types.Keyboard.Inline.InlineKeyboardMarkup;
import org.example.TelegramBotAPI.Types.Keyboard.Keyboard;
import org.example.TelegramBotAPI.Types.Message.Message;
import org.example.TelegramBotAPI.TelegramBotAPI;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class TelegramBotApiTest {
    TelegramBotAPI telegramBotAPI = new TelegramBotAPI("5453519203:AAHdKx-0zb7V4SVIjWQTn4ITNQn1VCoFtKc");

    @Test
    public void getMessages(){
        Assertions.assertDoesNotThrow(()->{
            telegramBotAPI.getMessages();
        });

        telegramBotAPI=new TelegramBotAPI("d");
        Assertions.assertThrows(HttpRequestException.class,()->{
            telegramBotAPI.getMessages();
        });
    }

    @Test
    public void sendMessage() throws HttpRequestException {
        Message message = generateTestDataForSendMessage();
        Assertions.assertNotNull(message);
        Assertions.assertEquals(message.getChat().getId(), 1068479070);
        Assertions.assertEquals(message.getText(),"hi\nf");
    }

    private Message generateTestDataForSendMessage() throws HttpRequestException {
        KeyboardButton[][] keyboardButtons = new KeyboardButton[1][2];
        keyboardButtons[0][0]=new KeyboardButton("f");
        keyboardButtons[0][1]=new KeyboardButton("fd");

        Keyboard keyboard = new ReplyKeyboardMarkup(false,"hi",false,false,false,keyboardButtons);
        return telegramBotAPI.sendMessage(1068479070,"hi\nf","HTML",keyboard);
    }

    @Test
    public void sendFile() throws HttpRequestException, IOException, IllegalAccessException {
        InlineKeyboardButton[][] inlineKeyboardButtons = new InlineKeyboardButton[2][2];
        inlineKeyboardButtons[0][0] = new InlineKeyboardButton("hello01", "b1");
        inlineKeyboardButtons[0][1] = new InlineKeyboardButton("hello02", "v2");
        inlineKeyboardButtons[1][0] = new InlineKeyboardButton("hello10", "v32");
        inlineKeyboardButtons[1][1] = new InlineKeyboardButton("hello11", "f32");
        Keyboard keyboard = new InlineKeyboardMarkup(inlineKeyboardButtons);
        OkHttp okHttp = new OkHttp("5453519203:AAHdKx-0zb7V4SVIjWQTn4ITNQn1VCoFtKc");
        Photo photo = new Photo(1068479070, "P:\\library\\src\\main\\java\\org\\example\\TelegramBotAPI\\HttpRequest\\f.png", "d\nd", "HTML", "5104841245755180586", keyboard);
        Assertions.assertDoesNotThrow(() -> {
            okHttp.sendRequest(photo);
        });
    }


}
