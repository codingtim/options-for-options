import java.util.function.Function;

public final class JsonWriter {

    private final OutputFormat outputFormat;

    public JsonWriter() {
        //constructor for backwards compatibility
        this(new JsonFormat());
    }

    public JsonWriter(OutputFormat outputFormat) {
        this.outputFormat = outputFormat;
    }

    public void writeJson(
            Appendable out,
            Json json,
            Function<JsonOptions, JsonOptions> jsonOptionsConsumer
    ) {
        JsonOptions jsonOptions = jsonOptionsConsumer.apply(JsonOptions.defaultOptions());
        //
    }
}