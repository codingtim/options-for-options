public class JsonOptions {
    private boolean indent = false;

    public void indent() {
        indent = true;
    }

    public void doNotIndent() {
        indent = false;
    }
}
