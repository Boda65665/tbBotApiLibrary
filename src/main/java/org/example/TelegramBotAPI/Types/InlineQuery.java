package org.example.TelegramBotAPI.Types;

public class InlineQuery {
    private final String id;
    private final String query;
    private final int offset;
    private final User from;

    public InlineQuery(String id, String query, int offset, User from) {
        this.id = id;
        this.query = query;
        this.offset = offset;
        this.from = from;
    }

    public String getId() {
        return id;
    }

    public String getQuery() {
        return query;
    }

    public int getOffset() {
        return offset;
    }

    public User getFrom() {
        return from;
    }

    @Override
    public String toString() {
        return "InlineQuery{" +
                "id='" + id + '\'' +
                ", query='" + query + '\'' +
                ", offset=" + offset +
                ", from=" + from +
                '}';
    }
}
