import java.util.Objects;

public class JsonOptions {
    private final boolean indent;

    public JsonOptions() {
        //constructor with default values
        indent = false;
    }

    private JsonOptions(boolean indent) {
        this.indent = indent;
    }

    public JsonOptions indent() {
        return new JsonOptions(true);
    }

    public JsonOptions doNotIndent() {
        return new JsonOptions(false);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JsonOptions that = (JsonOptions) o;
        return indent == that.indent;
    }

    @Override
    public int hashCode() {
        return Objects.hash(indent);
    }
}
