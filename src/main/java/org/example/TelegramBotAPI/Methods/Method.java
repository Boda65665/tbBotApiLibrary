package org.example.TelegramBotAPI.Methods;

import com.google.gson.Gson;
import org.example.TelegramBotAPI.HttpRequest.OkHttp;

public class Method {
    protected final OkHttp okHttp;
    protected final Gson gson = new Gson();

    public Method(OkHttp okHttp) {
        this.okHttp = okHttp;
    }
}
