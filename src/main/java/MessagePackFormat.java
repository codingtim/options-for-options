public record MessagePackFormat(Endianness endianness) implements OutputFormat {

    enum Endianness {
        BIG_ENDIAN,
        LITTLE_ENDIAN
    }
}
