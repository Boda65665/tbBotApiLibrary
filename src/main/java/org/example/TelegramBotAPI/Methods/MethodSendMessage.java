package org.example.TelegramBotAPI.Methods;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.example.TelegramBotAPI.Exception.HttpRequestException;
import org.example.TelegramBotAPI.Types.Keyboard.Keyboard;
import org.example.TelegramBotAPI.HttpRequest.OkHttp;
import org.example.TelegramBotAPI.Types.Message.Message;
import org.example.TelegramBotAPI.Methods.RequestBody.SendMessageRequestBody;

import java.util.logging.Logger;

public class MethodSendMessage extends Method{
    private final Logger logger  = Logger.getLogger(MethodSendMessage.class.getName());
    private final Gson gson = new Gson();

    public MethodSendMessage(OkHttp okHttp) {
        super(okHttp);
    }

    public Message sendMessage(int chatId, String message, String parseMode, Keyboard keyboard) throws HttpRequestException {
        SendMessageRequestBody sendMessageRequest = new SendMessageRequestBody(chatId,message,parseMode,keyboard);
        String jsonRequest = gson.toJson(sendMessageRequest);
        String jsonResponseString = okHttp.sendRequest("sendMessage",jsonRequest);
        JsonObject jsonResponse = gson.fromJson(jsonResponseString, JsonObject.class);
        JsonObject jsonMessage = jsonResponse.getAsJsonObject("result");
        return gson.fromJson(jsonMessage,Message.class);
    }

}
