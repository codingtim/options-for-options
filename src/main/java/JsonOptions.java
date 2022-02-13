public record JsonOptions(boolean indent) {

    public static JsonOptions defaultOptions() {
        return new JsonOptions(
                false
        );
    }

    public JsonOptions withIndentation() {
        return new JsonOptions(true);
    }

    public JsonOptions withoutIndentation() {
        return new JsonOptions(false);
    }

}
