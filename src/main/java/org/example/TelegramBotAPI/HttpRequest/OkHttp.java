package org.example.TelegramBotAPI.HttpRequest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.InstanceCreator;
import com.google.gson.JsonObject;
import okhttp3.*;
import org.example.TelegramBotAPI.Exception.HttpRequestException;
import org.example.TelegramBotAPI.HttpRequest.Entity.File;
import org.example.TelegramBotAPI.Types.Message.MaybeInaccessibleMessage;
import org.example.TelegramBotAPI.Types.Message.Message;

import java.io.IOException;
import java.lang.reflect.Type;

public class OkHttp {
    private final OkHttpClient client = new OkHttpClient();
    private final String url;
    private final Gson gson = new Gson();
    private final CreatorRequestBodyFromFIle creatorRequestBodyFromFIle = new CreatorRequestBodyFromFIle();

    public OkHttp(String token) {
        HttpUrl.Builder urlBuilder = HttpUrl.parse("https://api.telegram.org/bot"+ token).newBuilder();
        url = urlBuilder.build().toString();
    }

    public String sendRequest(Request request) throws HttpRequestException {
        try {
            // Отправляем запрос и получаем ответ
            Response response = client.newCall(request).execute();
            // Обрабатываем ответ
            if (response.isSuccessful()) {
                if (response.body()==null) return null;
                return response.body().string();
            } else {
                JsonObject jsonResponse = gson.fromJson(response.body().string(), JsonObject.class);
                StringBuilder stringBuilder = new StringBuilder("При запросе произошла ошибка,с кодом "+response.code());
                if (jsonResponse.getAsJsonPrimitive("description")!=null) {
                    stringBuilder.append(" ");
                    stringBuilder.append(jsonResponse.getAsJsonPrimitive("description").getAsString());
                }
                throw new HttpRequestException(stringBuilder.toString());
            }
        } catch (IOException e) {
            throw new HttpRequestException("При запросе произошла ошибка,неизвестная ошибка "+e);
        }
    }

    public String sendRequest(String nameMethod,String json) throws HttpRequestException {
        Request.Builder requestBuilder = new Request.Builder()
                .url(url+"/"+nameMethod);
        if (json!=null) {
            RequestBody jsonBody = RequestBody.create(json,MediaType.parse("application/json"));
            requestBuilder.post(jsonBody);
        }
        else requestBuilder.get();
        Request request = requestBuilder.build();
        return sendRequest(request);
    }

    public String sendRequest(String nameMethod) throws HttpRequestException {
        return sendRequest(nameMethod,null);
    }

    public String sendRequest(File file) throws HttpRequestException, IOException, IllegalAccessException {
        String nameMethod = "send"+file.getClass().getSimpleName();
        Request request = new Request.Builder()
                .url(url+"/"+nameMethod)
                .post(creatorRequestBodyFromFIle.create(file))
                .build();
        return sendRequest(request);
    }
}



