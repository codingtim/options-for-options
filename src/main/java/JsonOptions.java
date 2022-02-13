public record JsonOptions(boolean indent, boolean indentArrays) {

    public JsonOptions(boolean indent) {
        //constructor for backwards compatibility
        this(indent, false);
    }

    public static JsonOptions defaultOptions() {
        return new JsonOptions(
                false,
                false
        );
    }

    public JsonOptions withIndentation() {
        return new JsonOptions(true, indentArrays);
    }

    public JsonOptions withoutIndentation() {
        return new JsonOptions(false, indentArrays);
    }


    public JsonOptions withArrayIndentation() {
        return new JsonOptions(indent, true);
    }

    public JsonOptions withoutArrayIndentation() {
        return new JsonOptions(indent, false);
    }

}
