package airhacks;

public interface MessageTest {

        static void main(String... args) {
                var result = App.message();
                var expected = """
                                hello, zero dependencies Java CLI
                                """;
                if (!expected.equals(result))
                        throw new AssertionError("expected [%s] but got [%s]".formatted(expected, result));
        }

}