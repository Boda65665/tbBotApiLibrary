package org.example.TelegramBotAPI;

import org.example.TelegramBotAPI.Exception.HttpRequestException;
import org.example.TelegramBotAPI.HttpRequest.Entity.File;
import org.example.TelegramBotAPI.Methods.MethodSendFile;
import org.example.TelegramBotAPI.Types.CallbackQuery;
import org.example.TelegramBotAPI.Types.Keyboard.Keyboard;
import org.example.TelegramBotAPI.Types.Update;
import org.example.TelegramBotAPI.HttpRequest.OkHttp;
import org.example.TelegramBotAPI.Types.Message.Message;
import org.example.TelegramBotAPI.Methods.MethodGetUpdate;
import org.example.TelegramBotAPI.Methods.MethodSendMessage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TelegramBotAPI {
    private final MethodGetUpdate methodGetUpdate;
    private final MethodSendMessage methodSendMessage;
    private final MethodSendFile methodSendFile;
    private List<Message> tempMessages = new ArrayList<>();
    private List<CallbackQuery> tempCallbacks = new ArrayList<>();

    public TelegramBotAPI(String token) {
        OkHttp okHttp = new OkHttp(token);
        methodGetUpdate = new MethodGetUpdate(okHttp);
        methodSendMessage = new MethodSendMessage(okHttp);
        methodSendFile = new MethodSendFile(okHttp);
    }

    private void getUpdates() throws HttpRequestException {
        for (Update update : methodGetUpdate.getUpdates()) {
            if (update.getCallbackQuery()!=null) tempCallbacks.add(update.getCallbackQuery());
            else tempMessages.add(update.getMessage());
        }

    }

    public List<Message> getMessages() throws HttpRequestException {
        List<Message> messages = tempMessages;
        tempMessages=new ArrayList<>();
        return messages;
    }

    public Message sendMessage(int chatId,String text,String parseMode,Keyboard keyboard) throws HttpRequestException {
        return methodSendMessage.sendMessage(chatId,text,parseMode,keyboard);
    }

    public Message sendMessage(int chatId,String message, String parseMode) throws HttpRequestException {
        return sendMessage(chatId, message, parseMode, null);
    }

    public Message sendMessage(int chatId, String message , Keyboard keyboard) throws HttpRequestException {
        return sendMessage(chatId, message, null, keyboard);
    }

    public Message sendMessage(int chatId,String message) throws HttpRequestException {
        return sendMessage(chatId, message, null, null);
    }

    public Message sendFile(File file) throws HttpRequestException, IOException, IllegalAccessException {
        return methodSendFile.sendFile(file);
    }

    public List<CallbackQuery> getCallbacks() throws HttpRequestException {
        List<CallbackQuery> callbacks = tempCallbacks;
        tempCallbacks = new ArrayList<>();
        return callbacks;
    }

    public void start(){
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    try {
                        Thread.sleep(10);
                        getUpdates();
                    } catch (HttpRequestException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        });

        thread.start();
    }
}
