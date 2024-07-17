package org.example;

import org.example.TelegramBotAPI.Exception.HttpRequestException;
import org.example.TelegramBotAPI.HttpRequest.OkHttp;
import org.example.TelegramBotAPI.HttpRequest.Entity.Photo;
import org.example.TelegramBotAPI.TelegramBotAPI;
import org.example.TelegramBotAPI.Types.Keyboard.Inline.InlineKeyboardButton;
import org.example.TelegramBotAPI.Types.Keyboard.Inline.InlineKeyboardMarkup;
import org.example.TelegramBotAPI.Types.Keyboard.Keyboard;
import org.example.TelegramBotAPI.Types.Message.Message;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws HttpRequestException, IOException, IllegalAccessException, InterruptedException {
        TelegramBotAPI telegramBotAPI = new TelegramBotAPI("5453519203:AAHdKx-0zb7V4SVIjWQTn4ITNQn1VCoFtKc");
        telegramBotAPI.start();
        while (true){
            Thread.sleep(10);
            for (Message message : telegramBotAPI.getMessages()) {
                if (message.getText().equals("hello")) telegramBotAPI.sendMessage(message.getChat().getId(),"hi");
            }
        }
    }
}
