public record JsonOptions(boolean indent, boolean indentArrays, String copyright) {

    public JsonOptions(boolean indent) {
        //constructor for backwards compatibility
        this(indent, false, null);
    }

    public static JsonOptions defaultOptions() {
        return new JsonOptions(
                false,
                false,
                null
        );
    }

    public JsonOptions withIndentation() {
        return new JsonOptions(true, indentArrays, copyright);
    }

    public JsonOptions withoutIndentation() {
        return new JsonOptions(false, indentArrays, copyright);
    }

    public JsonOptions withArrayIndentation() {
        return new JsonOptions(indent, true, copyright);
    }

    public JsonOptions withoutArrayIndentation() {
        return new JsonOptions(indent, false, copyright);
    }

    public JsonOptions withCopyright(String copyright) {
        return new JsonOptions(indent, indentArrays, copyright);
    }

    public JsonOptions withoutCopyright() {
        return new JsonOptions(indent, indentArrays, null);
    }

}
