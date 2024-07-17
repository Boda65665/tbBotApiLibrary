package org.example.TelegramBotAPI.HttpRequest;

public class FieldNameConverter {
    public String toValidName(String fieldName) {
        Character[] characters = fieldName.chars().mapToObj(c -> (char)c).toArray(Character[]::new);
        StringBuilder validName = new StringBuilder();
        for (Character character : characters) {
            if (Character.isUpperCase(character)) {
                validName.append('_');
                validName.append(Character.toLowerCase(character));
            }
            else validName.append(character);
        }
        return validName.toString();
    }
}
