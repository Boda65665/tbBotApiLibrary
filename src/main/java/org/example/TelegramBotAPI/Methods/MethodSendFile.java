package org.example.TelegramBotAPI.Methods;

import com.google.gson.Gson;
import org.example.TelegramBotAPI.Exception.HttpRequestException;
import org.example.TelegramBotAPI.HttpRequest.Entity.File;
import org.example.TelegramBotAPI.HttpRequest.OkHttp;
import org.example.TelegramBotAPI.Types.Message.Message;

import java.io.IOException;

public class MethodSendFile extends Method {
    private final Gson gson = new Gson();

    public MethodSendFile(OkHttp okHttp) {
        super(okHttp);
    }

    public Message sendFile(File file) throws HttpRequestException, IOException, IllegalAccessException {
        String messageJson = okHttp.sendRequest(file);
       return gson.fromJson(messageJson,Message.class);
    }
}
