import java.util.function.Function;

public final class JsonWriter {

    public void writeJson(
            Appendable out,
            Json json,
            Function<JsonOptions, JsonOptions> jsonOptionsConsumer
    ) {
        JsonOptions jsonOptions = jsonOptionsConsumer.apply(JsonOptions.defaultOptions());
        //
    }
}