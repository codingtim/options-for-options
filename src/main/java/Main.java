public class Main {

    public static void main(String[] args) {
        StringBuilder out = new StringBuilder();
        Json json = new Json();

        new JsonWriter().writeJson(out, json, JsonOptions::withIndentation);
    }
}
