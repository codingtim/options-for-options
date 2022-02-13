public class Main {

    public static void main(String[] args) {
        StringBuilder out = new StringBuilder();
        Json json = new Json();

        JsonWriter jsonWriter = new JsonWriter(new MessagePackFormat(MessagePackFormat.Endianness.BIG_ENDIAN));
        jsonWriter.writeJson(out, json, jsonOptions ->
                jsonOptions
                        .withIndentation()
                        .withoutArrayIndentation()
                        .withCopyright("(c) 2022")
        );
    }
}
