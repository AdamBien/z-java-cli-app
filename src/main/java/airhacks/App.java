package airhacks;

public interface App {
 
    static String message() {
        return """
                hello, zero dependencies Java CLI
                """;
    }

    static void main(String ...args) {
        IO.println(message());
    }
}