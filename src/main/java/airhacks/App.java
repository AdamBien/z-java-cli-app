package airhacks;

public interface App {

    String VERSION = Version.get();

    static String message() {
        return """
                hello, zero dependencies Java CLI
                """;
    }

    static void main(String... args) {
        IO.println("zapp v: " + VERSION);
        IO.println(message());
    }
}
