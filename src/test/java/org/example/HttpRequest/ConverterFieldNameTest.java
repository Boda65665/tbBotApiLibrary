package org.example.HttpRequest;

import org.example.TelegramBotAPI.HttpRequest.FieldNameConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConverterFieldNameTest {
    FieldNameConverter fieldNameConverter = new FieldNameConverter();
    @Test
    public void testConvertName() {
        Assertions.assertEquals("chat_id",fieldNameConverter.toValidName("chatId"));
    }
}
