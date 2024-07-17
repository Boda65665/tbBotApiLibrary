package org.example.TelegramBotAPI.HttpRequest;

import com.google.gson.Gson;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import org.example.TelegramBotAPI.Exception.HttpRequestException;
import org.example.TelegramBotAPI.HttpRequest.Entity.File;
import org.example.TelegramBotAPI.Types.Keyboard.Keyboard;

import java.lang.reflect.Field;

public class CreatorRequestBodyFromFIle {
    private final FieldNameConverter fieldNameConverter = new FieldNameConverter();
    private final Gson gson = new Gson();

    public RequestBody create(File file) throws HttpRequestException, IllegalAccessException {
        java.io.File photoFile = new java.io.File(file.getFilePath());
        String typeFile = file.getClass().getSimpleName().toLowerCase();
        MultipartBody.Builder requestBodyBuilder = new MultipartBody.Builder()
        .setType(MultipartBody.FORM)
        .addFormDataPart("chat_id", String.valueOf(file.getChatId()))
        .addFormDataPart(typeFile, photoFile.getName(), RequestBody.create(MediaType.parse("image/jpeg"), photoFile));
        for (Field declaredField : file.getClass().getDeclaredFields()) {
            declaredField.setAccessible(true);
            String name = declaredField.getName();
            Object value = declaredField.get(file);
            if (value != null) {
                String valueString;
                if (declaredField.get(file) instanceof Keyboard) {
                    valueString = gson.toJson(declaredField.get(file));
                } else valueString = (String) declaredField.get(file);
                requestBodyBuilder.addFormDataPart(fieldNameConverter.toValidName(name), valueString);
            }
        }
        return requestBodyBuilder.build();
    }

}
