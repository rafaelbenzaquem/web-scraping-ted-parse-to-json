public class Json {
    private String author;
    private String body;
    private String title;
    private String type;
    private String url;

    public Json(String author, String body, String title, String type, String url) {
        this.author = author;
        this.body = body;
        this.title = title;
        this.type = type;
        this.url = url;
    }

    public String getAuthor() {
        return author;
    }

    public String getBody() {
        return body;
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }

    public String getUrl() {
        return url;
    }
}
