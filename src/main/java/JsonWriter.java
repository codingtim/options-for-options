import java.util.function.Consumer;

public final class JsonWriter {

    public void writeJson(
            Appendable out,
            Json json,
            Consumer<JsonOptions> jsonOptionsConsumer
    ) {
        JsonOptions jsonOptions = new JsonOptions();
        jsonOptionsConsumer.accept(jsonOptions);
        //
    }
}