package org.example.TelegramBotAPI.Methods;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import org.example.TelegramBotAPI.Exception.HttpRequestException;
import org.example.TelegramBotAPI.Types.Update;
import org.example.TelegramBotAPI.HttpRequest.OkHttp;

import java.lang.reflect.Type;
import java.util.List;

public class MethodGetUpdate extends Method {
    private int offsetUpdate = 0;

    public MethodGetUpdate(OkHttp okHttp) {
        super(okHttp);
    }

    public List<Update> getUpdates() throws HttpRequestException {
        String responseJson = okHttp.sendRequest("getUpdates?offset="+offsetUpdate);
        JsonObject response = gson.fromJson(responseJson, JsonObject.class);
        JsonArray results = response.getAsJsonArray("result");
        Type listType = new TypeToken<List<Update>>(){}.getType();
        List<Update> updates = gson.fromJson(results.toString(),listType);
        if (!updates.isEmpty()) offsetUpdate = updates.get(updates.size()-1).getUpdateId()+1;
        return updates;
    }

}
